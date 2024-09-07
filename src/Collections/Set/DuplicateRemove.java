package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove
{
    public static void main(String[] args) {
        int arr[]={10,10,11,12,13,10};
        Set<Integer> set=new HashSet<>();

        for(int num:arr)
        {
            set.add(num);
        }
        System.out.println(set);

    }
}
