package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Mapping with String
// LinkedHashMap


public class UseHashMap {
    public static void main (String []args){

        Map<String, String> state = new HashMap<String, String>();
        state.put("USA", "NY");
        state.put("Canada", "Toronto");
        state.put("UK", "London");

        //System.out.println(state.get("USA"));//for printing one key /object

        for (Map.Entry entry:state.entrySet()){//for printing all key/objects altogether
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }
    }
}
