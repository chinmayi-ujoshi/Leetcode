class Solution {
public:
    int compress(vector<char>& chars) {
        int ans = 0;
        for(int i = 0 ;i<chars.size();){
            char current = chars[i];
            int count = 0;

            while(i<chars.size() && chars[i]==current){
                ++count;
                ++i;
            }
            chars[ans++] = current;

            if(count>1){
                for(char c :to_string(count)){
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
};