package my.ds.letcode.essay.Arrays;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    int backIndex=0;
    int frontIndex=0;
    String[] arr;
    public OrderedStream(int n) {
        arr=new String[n];
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey-1]=value;
        frontIndex++;
        int i=backIndex;
        List<String> list=new ArrayList<String>();
        while(i<frontIndex&&arr[i]!=null){
            list.add(arr[i]);
            i++;
        }
        backIndex=i;
        return list;
    }
}
