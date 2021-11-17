import java.util.Arrays;

public class MyList<E> {
    // đếm các số lượng phần tử trong mảng khác null.
    private int size;
    private int capacity = 5;
    private Object[] elements;

    public MyList() {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] newArr = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        elements =  newArr;

    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }


    public void get(int i) {
        if (i>=0 && i < size){
            System.out.println(elements[i]);
        }
    }

}
