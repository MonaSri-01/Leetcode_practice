class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        for (int ind = 0; ind < s_arr.length; ind ++){
            if (s_arr[ind] != t_arr[ind])
                return false;
        }
        return true;
    }
}