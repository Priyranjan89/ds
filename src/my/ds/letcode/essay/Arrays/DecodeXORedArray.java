package my.ds.letcode.essay.Arrays;

import java.util.Arrays;
import java.util.List;

public class DecodeXORedArray {

    public int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int[] res = new int[size+1];
        res[0] = first;
        for(int i=0; i<size; i++) {
            res[i+1] = res[i] ^ encoded[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int encoded[] = {1,2,3};
        int first = 1;

        DecodeXORedArray xoRedArray = new DecodeXORedArray();
        int result[] = xoRedArray.decode(encoded, first);

        System.out.print("[ ");
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.print("]");
        System.out.println("\n");
        List<Number> list = Arrays.asList(1,2,3);

        //list.forEach(System.out::println);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        List<Number> nums = list;
        //nums.forEach(System.out::println);
        ////nums.add(7);
    }
}
