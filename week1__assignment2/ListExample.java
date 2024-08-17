import java.util.*;

public class ListExample {
    private List<String> list;

    public ListExample() {
        list = new ArrayList<>();
    }

    public void addElement(String element) {
        list.add(element);
    }

    public boolean removeElement(String element) {
        return list.remove(element);
    }

    public boolean searchElement(String element) {
        return list.contains(element);
    }

    public List<String> getList() {
        return list;
    }
}
