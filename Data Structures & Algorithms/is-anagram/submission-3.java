class Solution {
    public boolean isAnagram(String s, String t) {
        char[] letter = new char[26];
        int length = s.length();

        if(s.length() != t.length()) return false;

        for (int i = 0 ; i < length; i++){
            letter[s.charAt(i) - 'a']++;
        }

        for (int i = 0 ; i < length ; i++){
            letter[t.charAt(i) - 'a']--;
        }

        for(int i = 0 ; i < letter.length ; i ++){
            if(letter[i] != 0) return false;
        }


        return true;
    }
}
