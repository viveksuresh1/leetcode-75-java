public class compress {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = solution.compress(chars);
        System.out.println("Compressed Length: " + length); // Output: 6
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " "); // Output: a2 b2 c3
        }
    }
    
}


class Solution {
    public int compress(char[] chars) {
        int write = 0, read = 0;
        while(read<chars.length){
            char temp = chars[read];
            int count = 0;
            while(read<chars.length && temp==chars[read]){
                read++;
                count++;
            }
            chars[write++] = temp;
            if(count>1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}