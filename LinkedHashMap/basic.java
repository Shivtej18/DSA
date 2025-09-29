import java.util.LinkedHashMap;
import java.util.HashMap;
public class basic {
    public static void main(String args[]){
        LinkedHashMap <String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",300);
        lhm.put("Brazil",200);
        lhm.put("Russia",250);
        System.out.println(lhm);

        HashMap  <String , Integer> hm = new HashMap<>();
        hm.put("India",300);
        hm.put("Brazil",200);
        hm.put("Russia",250);
        System.out.println(hm);


    }
}
