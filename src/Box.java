import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> {


    private final List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }


    public float getWeight() {
        float sum = 0;
        for (T element: list) {
            sum += element.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }


    public void pour(Box<T> box) {
        box.list.addAll(list);
        list.clear();
    }
}