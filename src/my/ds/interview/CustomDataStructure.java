package my.ds.interview;

import java.util.*;

public class CustomDataStructure {

    ArrayList<Integer> arrayList;
    Map<Integer,Integer> hashMap;

    public CustomDataStructure(){
        arrayList = new ArrayList<>();
        hashMap = new HashMap<>();
    }

    public void insert(int val){
        if (hashMap.get(val) != null){
            return;
        }

        int intVal = arrayList.size();
        arrayList.add(val);
        hashMap.put(val, intVal);
    }

    public int search(int val){

        return hashMap.get(val).intValue();
    }

    public int getRandom(){
        Random random = new Random();
        int index = random.nextInt(arrayList.size()-1);
        return arrayList.get(index);
      // return arrayList.get(new Random().nextInt(arrayList.size()-1));
    }

    public void remove(int val){
        Integer index = hashMap.get(val);
        if (index == null){
            return;
        }
        hashMap.remove(val);

        int size = arrayList.size();
        Integer last = arrayList.get(size-1);
        Collections.swap(arrayList, index, size-1);
        arrayList.remove(size-1);
        hashMap.put(last,index);
    }


    public static void main(String[] args) {
        CustomDataStructure ds = new CustomDataStructure();
        ds.insert(2);
        ds.insert(3);
        ds.insert(4);
        ds.insert(6);
        ds.insert(8);
        ds.insert(7);

        System.out.println(ds.search(6));
        //System.out.println(ds.getRandom());
        ds.remove(4);
        System.out.println(ds.search(6));
        System.out.println(ds.search(7));
    }

}
