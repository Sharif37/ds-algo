import java.util.HashSet;

/*
time complexity: O(n)
Key features of a HashSet:
No Duplicates: It ensures that no element is stored more than once.
Fast Access: Due to its internal hash table implementation, a HashSet allows for fast insertion, deletion, and lookup operations, typically with O(1) time complexity.
Unordered: The elements in a HashSet are not stored in any specific order, so the insertion order is not maintained.

 */
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> element=new HashSet<>();
        for(int num : nums){
            if(element.contains(num))
            {
                return true ;
            }
            element.add(num);
        }
        return false ;


    }
}