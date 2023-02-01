import java.io.*;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){

        boolean duplicates = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++;){
                if(set.contains(nums[i])){
                    duplicates = true;
                };
            }

        }
        return duplicates;
    }
}
