
import javax.print.DocFlavor;
import	java.util.HashMap;
import java.util.Map;

/**
 * @author : zengjin
 * @date : 2020-03-26 10:55
 **/
public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello World");
        Map<String,Integer> map = new HashMap<> ();
        map.put("K1",1);
        map.put("K2",2);
        map.put("K3",3);
        map.put("K4",4);
        map.put("K5",5);
        System.out.println(map);*/
        String a = "hello";
        String b = new String("hello");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
