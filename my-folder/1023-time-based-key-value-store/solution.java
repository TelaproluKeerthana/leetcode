import java.util.*;

public class TimeMap {

    private Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!timeMap.containsKey(key)) {
            return "";
        }
        TreeMap<Integer, String> tree = timeMap.get(key);
        Integer floorKey = tree.floorKey(timestamp);
        if (floorKey == null) {
            return "";
        }
        return tree.get(floorKey);
    }
}

