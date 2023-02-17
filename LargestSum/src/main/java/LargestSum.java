
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){

        Integer max = Collections.max(nums);
        System.out.println(max);
        nums.remove(max);
        Integer max2 = Collections.max(nums);
        return max + max2;
    }
}