import sun.misc.JavaNioAccess;
import sun.misc.SharedSecrets;
import sun.misc.Unsafe;
import sun.misc.VM;

import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/**
 * 1.8 VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 *
 * @deprecated  该类是测试直接内存溢出的情况
 * @author zzh
 */
public class DirectMemoryOOM {

    private static final int _100MB = 1024 * 1024 * 100;

    public static BufferPoolMXBean getDirectBufferPoolMBean(){
        return ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class)
                .stream()
                .filter(e -> e.getName().equals("direct"))
                .findFirst()
                .orElseThrow(null);
    }

    public static JavaNioAccess.BufferPool getNioBufferPool(){
        return SharedSecrets.getJavaNioAccess().getDirectBufferPool();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            System.out.println(Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0);
            System.out.println(VM.maxDirectMemory() / 1024.0 / 1024.0);
            System.out.println(getDirectBufferPoolMBean().getTotalCapacity() / 1024.0 / 1024.0);
            System.out.println(getNioBufferPool().getTotalCapacity() / 1024.0 / 1024.0);

            // 使用 byteBuffer 分配内存会直接报错
//            ByteBuffer.allocateDirect(30*1024*1024);
            // 使用 unsafe 分配内存会到资源耗尽报错 win 环境下已提交内存不断增加
            // 解释 https://github.com/fenixsoft/jvm_book/issues/16
            long l = unsafe.allocateMemory(_100MB);
            System.out.println(l);
        }
    }
}
