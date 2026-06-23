package Collections.List.ArrayList;
import java.util.Arrays;


 class MyArrayList<E> {
    private Object[] data;
    private int size;

    public MyArrayList(){
        data = new Object[10];
    }

    public void add(E element){
        if(size == data.length){
            grow();
        }
        data[size++] = element;

    }
    @SuppressWarnings("Unchecked")
    public E get(int index){
        if(index < 0 || index >=size){
            throw new IndexOutOfBoundsException();
        }
        return (E) data[index];
    }

    public int size(){
        return size;
    }
    private void grow(){
        Object[] newArray = new Object[data.length * 2];
        for(int i = 0; i<data.length;i++){
            newArray[i] = data[i];
        }
        data = newArray;

    }
    public String toString(){
        return Arrays.toString(Arrays.copyOf(data,size));
    }
}
public class CustomArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list);
    }
}

