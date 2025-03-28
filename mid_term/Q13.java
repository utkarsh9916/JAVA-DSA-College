package mid_term;
// Q:-13 MEDIUM Count the Number of Vowel Strings in Range.
// You are given a 0-indexed array of string words and two integers left and right.
// A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

// Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
// Example 1:
// Input: words = ["are","amy","u"], left = 0, right = 2

// leetcode q 2586

public class Q13 {
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        return true;
    }
    return false;
}
public int vowelStrings(String[] words, int left, int right) {
    int count=0;
    for(int i=left;i<=right;i++){
        int len=words[i].length();
        String str=words[i];
        if(isVowel(str.charAt(0))&&isVowel(str.charAt(len-1))){
            count++;
        }
    }
    return count;
}
}
