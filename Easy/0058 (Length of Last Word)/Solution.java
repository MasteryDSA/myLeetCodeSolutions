class Solution {
    public int lengthOfLastWord(String s) {
        String store[] = {s};
        int i = store[0].length() - 1;
        int startCount = 0;

        while(i >= 0 && store[0].charAt(i) == ' ') {
            i--;
        }

        while(i>= 0 && store[0].charAt(i) != ' ') {
            startCount++;
            i--;
        }
        return startCount;

    }

    public static void main(String[] args) {
        String s = "Hello Clarise Tan";
        Solution main = new Solution();
        main.lengthOfLastWord(s);
    }
}