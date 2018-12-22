package Map;

import java.util.HashMap;
import java.util.Map;

//Question will come under data-structure
//HashMap is created and inserted some data, retrieve the CollectionView of values presented in map
//lot cities of USA, how we gonna Map and the CollectionView

public class CollectionView {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");//map comes from either variable OR object
        map.put(2, "LA");
        map.put(3, "Boston");
        map.put(4, "Seattle");
        map.put(5, "Jersey City");

        //Map is Interface here
        for (Map.Entry<Integer, String> USA : map.entrySet()) {
            System.out.println("Collection View is - " + USA.getKey() + " : " + USA.getValue());
        }
    }
}