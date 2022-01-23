import java.util.ArrayList;
import java.util.List;

/**
 * VM Args -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author zzh
 * @deprecated 构建一个堆内存溢出的程序
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
