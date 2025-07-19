import java.util.*;

public class closeStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "bca";
        boolean result = solution.closeStrings(word1, word2);
        System.out.println("Are close strings: " + result); // Output: true
    }
}

class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> hmap1 = new HashMap<>();
        HashMap<Character,Integer> hmap2 = new HashMap<>();
        HashSet<Integer> count = new HashSet<>();
        for(char letter:word1.toCharArray()){
            hmap1.put(letter, hmap1.getOrDefault(letter,0)+1);
        }
        for(char letter:word2.toCharArray()){
            hmap2.put(letter, hmap2.getOrDefault(letter,0)+1);
        }
        if(!hmap1.keySet().equals(hmap2.keySet()))    return false;
        List<Integer> freq1 = new ArrayList<>(hmap1.values());
        List<Integer> freq2 = new ArrayList<>(hmap2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
}

class Solution2 {
    public boolean closeStrings(String word1, String word2) {
        int[] l1 = new int[26];
        int[] l2 = new int[26];

        for (Character c : word1.toCharArray()) {
            l1[c - 'a'] ++;
        }
        for (Character c : word2.toCharArray()) {
            l2[c - 'a'] ++;
        }
        for (int i = 0; i < 26; i++) {
            if ((l1[i] == 0 && l2[i] != 0) || (l2[i] == 0 && l1[i] != 0)) {
                return false;
            }
        }

        Arrays.sort(l1);
        Arrays.sort(l2);
        return Arrays.equals(l1, l2);

    }
}