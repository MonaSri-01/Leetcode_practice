class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        res = ""
        for ch in s:
            if ch.isalnum():
                res += ch
        
        start = 0
        end = len(res) - 1
        while start < end:
            if res[start] != res[end]:
                return False
            start += 1 
            end -= 1
        return True