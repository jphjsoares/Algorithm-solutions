import java.util.Hashtable;
import java.util.Set;

public class SingleNumber {
    public static int solution(int[] nums){
        // Current number, Times present
        Hashtable<Integer, Integer> ocurrences = new Hashtable<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            Integer n = ocurrences.get(nums[i]);
            // if the key exists increment the times present
            if(n != null) ocurrences.replace(nums[i], n+1);

            //if it does not exist, place it there
            else ocurrences.put(nums[i], 1);
        }
        Set<Integer> keys = ocurrences.keySet();
        int toReturn = 0;
        for(Integer key : keys){
            if (ocurrences.get(key) > 1) toReturn = key; 
        } 
        return toReturn;
    } 

    public static void main(String[] args){
        int[] test = {1,2,3,4,5,6,7,8,2};
        System.out.println(solution(test));
    }
}
