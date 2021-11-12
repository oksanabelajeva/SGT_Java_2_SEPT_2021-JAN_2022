package lessons.lesson20;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMaps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Oxana", 34);
        students.get("Oxana"); // returns 34
        students.containsKey("Oxana"); // returns true
        students.containsValue(34); // returns true

        students.put("Oxana", 35); // age will be overriden because Map can't contain the same key
    }
}
