import java.util.*;

public class ListExample {
    private List<String> list;

    public ListExample() {
        list = new ArrayList<>();
    }

    public void addElement(String ele) {
        list.add(ele);
    }

    public boolean removeElement(String ele) {
        return list.remove(ele);
    }

    public boolean searchElement(String ele) {
        return list.contains(ele);
    }

    public List<String> getList() {
        return list;
    }
}
