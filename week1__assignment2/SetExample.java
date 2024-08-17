import java.util.HashSet;
import java.util.Set;

public class SetExample {
    private Set<String> set;

    public SetExample() {
        set = new HashSet<>();
    }

    public boolean addElement(String element) {
        return set.add(element);
    }

    public boolean removeElement(String element) {
        return set.remove(element);
    }

    public boolean searchElement(String element) {
        return set.contains(element);
    }

    public Set<String> getSet() {
        return set;
    }
}
