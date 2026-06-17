class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& num1, vector<int>& num2) {
        unordered_map<int,int> mp;
        stack<int> st;
        for(int i=num2.size()-1;i>=0;i--){
            while(!st.empty() &&st.top()<=num2[i]){
                st.pop();
            }
            if(st.empty()){
                mp[num2[i]]=-1;
            } else{
                mp[num2[i]]=st.top();
            }
            st.push(num2[i]);
        }
        vector<int> ans;
        for(int num:num1){
            ans.push_back(mp[num]);
        }
        return ans;
        
    }
};
