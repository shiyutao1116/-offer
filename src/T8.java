import java.util.HashSet;

/**
 * @author shiyutao
 * @create 2021-10-10 15:35
 */
public class T8 {

//1
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<nums.length;i++){
             if(!hashSet.add(nums[i])){
                 return nums[i];
             }
        }
        return -1;
    }
   //2
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums.length && j != i; j++) {
                if(nums[i]==nums[j]){
                return nums[i];
                }
            }

            }
            return -1;
        }

    }