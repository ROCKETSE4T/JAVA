package modules.module2.javaCollections;
import java.util.ArrayList;

public class MyHashTable{
    protected int size;
    protected ArrayList<ArrayList<ArrayList<Object>>> hashArea = new ArrayList();

    public MyHashTable(int size){

        this.size = size;

        for (int i = 0; i < this.size; i++){
            ArrayList<ArrayList<Object>> kv = new ArrayList<>();
            hashArea.add(kv);
        }
    }

    public int hashCode(String key){
        int hash = key.hashCode();

        int index = Math.abs(hash) % this.size;

        return index;
    }

    public void put(String key, Object value){
        int index = hashCode(key);

        for (ArrayList<Object> pair : hashArea.get(index)){
            if(pair.get(0).equals(key)){
                pair.set(1, value);
                return;
            }
        }

        ArrayList<Object> entry = new ArrayList<>();
        entry.add(key);
        entry.add(value);

        hashArea.get(index).add(entry);

    }

    public void remove(String key){
        int index = hashCode(key);
        for (ArrayList<Object> pair : hashArea.get(index)){
            if(pair.get(0).equals(key)){
                hashArea.get(index).clear();
                return;
            }
        }
    }

    public Object get(String key){
        int index = hashCode(key);
        for (ArrayList<Object> pair : hashArea.get(index)){
            if(pair.get(0).equals(key)){
                return pair.get(1);
            }
        }

        return null;
    }

}


class Execute{
    public static void main(String[] args){
        MyHashTable hashTable = new MyHashTable(10);

        System.out.println(hashTable.hashArea);
        hashTable.put("Enzo", 10);
        System.out.println(hashTable.hashArea);
        hashTable.put("Arthur", 10);
        System.out.println(hashTable.hashArea);
        hashTable.remove("Enzo");
        System.out.println(hashTable.get("Arthur"));



    }
}


