import java.util.*;

public class Priority_Queue {
    ArrayList<Integer> l = new ArrayList<>();

    // Adds an element and maintains heap property
    public void add(int val) { // O(log n)
        l.add(val);
        upheaplify(l.size() - 1);
    }

    private void upheaplify(int child) {
        if (child == 0) return; // Stop if it's the root node
        int parent = (child - 1) / 2;
        if (l.get(parent) > l.get(child)) {
            swap(parent, child);
            upheaplify(parent); // Recur for the parent
        }
    }

    private void swap(int parent, int child) {
        int temp = l.get(parent);
        l.set(parent, l.get(child));
        l.set(child, temp);
    }

    public int size() {
        return l.size();
    }

    public int getMin() {
        return l.get(0);
    }

    // Removes the minimum element and maintains heap property
    public int remove() { // O(log n)
        swap(0, l.size() - 1);
        int rv = l.remove(l.size() - 1);
        downheaplify(0);
        return rv;
    }

    private void downheaplify(int parent) {
        int child1 = parent * 2 + 1;
        int child2 = parent * 2 + 2;
        int min = parent;

        if (child1 < l.size() && l.get(child1) < l.get(min)) {
            min = child1;
        }
        if (child2 < l.size() && l.get(child2) < l.get(min)) {
            min = child2;
        }
        if (min != parent) {
            swap(parent, min);
            downheaplify(min);
        }
    }
}