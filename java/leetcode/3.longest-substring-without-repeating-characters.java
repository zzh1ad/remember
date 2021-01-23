import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> charMap = new HashMap<>();
        int length = s.length();
        int maxIndex = 0;
        int maxLength = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if(charMap.containsKey(currentChar)){
                int currentLength = i-maxIndex;
                if(currentLength>maxLength){
                    maxLength = currentLength;
                }
                int currentIndex = charMap.get(currentChar);
                if (maxIndex <= currentIndex) {
                    maxIndex= currentIndex+1;
                }

            }else{
                charMap.put(currentChar, i);
            }
        }
        int lastLength = length - maxIndex;
        if(lastLength>maxLength){
            maxLength = lastLength;
        }
        return maxLength;
    }

    // public static void main(String[] args) {
    //     System.out.println(new Solution().lengthOfLongestSubstring("abba"));
    // }
}
// @lc code=end

