package simpleArrayList;

import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public Object getElement() {
        return element;
    }

    public void add(int index,E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }

    private void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element, newSize);
    }

    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index " + i + ", Size" + i);
        }
        return (E) element[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "element=" + Arrays.toString(element) +
                '}';
    }
}
