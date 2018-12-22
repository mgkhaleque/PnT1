package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// printing key word+value altogether using HashMap
public class UseHashMap2 {

    public static void main(String[] args) {
        Map <String, String > state = new LinkedHashMap<String, String>();
        state.put("USA", "NY");
        state.put("Canada", "Toronto");
        state.put("UK", "London");

        //System.out.println(state.get("USA"));//for printing one key /object

        for (Map.Entry entry:state.entrySet()){//for printing all key/objects altogether
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }

    }

}
