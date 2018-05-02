package Arrays;

import com.sun.istack.internal.NotNull;

import java.util.HashMap;

/**
 * Input array of integers and integer sum
 * output indexes of array elements that add up to the sum
 */
public class TwoSum {


    public static void main(String[] args){
        TwoSum twoSum= new TwoSum();
        int[] val = twoSum.twoSum(new int[]{4,4,4,6,8},8);
        for(int i: val){
            System.out.println(i);
        }

    }

  private   int[] twoSum(@NotNull int[] arr, int k){
      HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                return new int[]{i,map.get(arr[i])};
            }
            else map.put(k-arr[i],i);
        }


return new int[]{0,0};
    }

}
