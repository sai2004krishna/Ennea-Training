import java.util.HashSet;
import java.util.Set;

public class SetExample {
    private Set<String> set;

    public SetExample() {
        set = new HashSet<>();
    }

    public boolean addElement(String ele) {
        return set.add(ele);
    }

    public boolean removeElement(String ele) {
        return set.remove(ele);
    }

    public boolean searchElement(String ele) {
        return set.contains(ele);
    }

    public Set<String> getSet() {
        return set;
    }
}
