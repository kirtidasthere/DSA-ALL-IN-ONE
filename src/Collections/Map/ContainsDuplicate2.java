package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map=new HashMap<>(); //Creating Map
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i])) //checking element in map
            {
                if(Math.abs(i-map.get(nums[i]))<=k)
                {
                    return true;
                }
                else
                {
                    map.put(nums[i],i); //updating Index
                }
            }
            else
            {
                map.put(nums[i],i); //updating map
            }
        }
        return false;
    }

        public static void main(String[] args) {
            ContainsDuplicate2 a=new ContainsDuplicate2();
            int nums[]={1,2,3,1};
            int k=3;
            System.out.println(a.containsNearbyDuplicate(nums,k));

        }

}


