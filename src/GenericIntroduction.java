import java.util.Arrays;

public class GenericIntroduction {
    public static void main(String[] args) {

        //Дженерик крч <T>
        Storage<String> stringStorage = new Storage<>();

        stringStorage.add("One", 0);
        stringStorage.add("Two", 1);

        Storage<Integer> integerStorage = new Storage<>();

        integerStorage.add(1, 0);
        integerStorage.add(2, 1);


    }


}

class Storage<T> {
    private Object[] items = new Object[100];


    public void add(T item, int index) {
        items[index] = item;
    }

    public Object[] getItems() {
        return items;
    }
}
