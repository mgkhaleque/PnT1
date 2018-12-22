package Map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Mapping with int + String

public class UseMap {
    public static void main(String []args){

        Map<Integer, String> state = new HashMap<Integer, String>();
        state.put(1, "NY");
        state.put(2, "NJ");
        state.put(3, "FL");

        System.out.println(state.get(3));

        //for (Map.Entry list : state.entrySet()){
           // System.out.println("CollectionView: "+list.getKey()+ " "+list.getValue());
        //}

    }
}
