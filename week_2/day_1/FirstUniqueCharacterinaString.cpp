class Solution {
public:
    int firstUniqChar(string s) {
        int freq[26]={0};
        //count frequency of each charater
        for(char ch:s){
            freq[ch-'a']++;

        }
        //find the first unique character
        for(int i=0;i<s.length();i++){
            if(freq[s[i]-'a']==1){
                return i;
            }
            
            
        }
    
      return -1;
    }
};
