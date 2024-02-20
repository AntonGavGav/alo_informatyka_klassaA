import java.util.LinkedList;

public class MySet<T> {
    private static final int CAPACITY = 500;

    private static int length;
    LinkedList<T>[] mySet = new LinkedList[CAPACITY];
    public String toString(){
        String res = "";
        for(Object element: mySet){
            res = res + element + ", ";
        }
        return res;
    }
    public void add(T element){
        if(contains(element)){
            return;
        }
        int hash = getHash(element);
        if(mySet[hash] == null){
            mySet[hash] = new LinkedList<T>();
        }
        mySet[hash].add(element);
        length++;
    }
    public boolean contains(T searched_element){
        int hash = getHash(searched_element);
        if(mySet[hash] != null) {
            for (T element : mySet[hash]) {
                if (element.equals(searched_element)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void remove(T element){
        int hash = getHash(element);
        if(contains(element)){
            mySet[hash].remove(element);
            if(mySet[hash].isEmpty()){
                mySet[hash] = null;
            }
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    private int getHash(T element){
        return Math.abs(element.hashCode()%CAPACITY);
    }

}
