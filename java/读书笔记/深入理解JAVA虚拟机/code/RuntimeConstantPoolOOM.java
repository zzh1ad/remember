import java.util.HashSet;
import java.util.Set;

/**
 * 该类是为了测试永久代OOM
 * <p>
 * 1.8 VM Args: -Xmx6M
 * 1.6 VM Args: -XX:PermSize=6M -XX:MaxPermSize=6M
 *
 * @author zzh
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        int i = 0;
//        while (true) {
//            set.add(String.valueOf(i++).intern());
//        }

        String s1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuffer("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
    }
}
