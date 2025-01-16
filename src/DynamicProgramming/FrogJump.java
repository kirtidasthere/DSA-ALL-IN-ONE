package DynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrogJump
{
    public boolean canCross(int[] stones)
    {
        Map<Integer, Set<Integer>> map=new HashMap<>();
        for(int val : stones)
        {
            map.put(val, new HashSet<>());
        }
        map.get(stones[0]).add(1);

        for(int val : stones)
        {
            for(int jump : map.get(val))
            {
                if(jump != 0 && map.containsKey(val + jump))
                {
                    map.get(val + jump).add(jump -1);
                    map.get(val + jump).add(jump);
                    map.get(val + jump).add(jump + 1);
                }
            }
        }
        return !map.get(stones[stones.length -1]).isEmpty();
    }

    public static void main(String[] args) {
        FrogJump a = new FrogJump();
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17}; // Example input
        boolean result = a.canCross(stones);
        System.out.println("Can the frog cross? " + result);
    }
}
