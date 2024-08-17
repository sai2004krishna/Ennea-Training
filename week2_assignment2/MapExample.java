import java.util.HashMap;
import java.util.Map;

public class MapExample {
    private Map<Integer, String> map;

    public MapExample() {
        map = new HashMap<>();
    }

    public void addElement(int k, String v) {
        map.put(k, v);
    }

    public String removeElement(int k) {
        return map.remove(k);
    }

    public boolean searchKey(int k) {
        return map.containsKey(k);
    }

    public boolean searchValue(String v) {
        return map.containsValue(v);
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
