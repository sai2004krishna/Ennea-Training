import java.util.HashMap;
import java.util.Map;

public class MapExample {
    private Map<Integer, String> map;

    public MapExample() {
        map = new HashMap<>();
    }

    public void addElement(int key, String value) {
        map.put(key, value);
    }

    public String removeElement(int key) {
        return map.remove(key);
    }

    public boolean searchKey(int key) {
        return map.containsKey(key);
    }

    public boolean searchValue(String value) {
        return map.containsValue(value);
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
