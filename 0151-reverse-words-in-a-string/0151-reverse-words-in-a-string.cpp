class Solution {
public:
    string reverseWords(string s) {
        int i = s.find_first_not_of(' ');
        int j = s.find_last_not_of(' ');
        s=s.substr(i,j-i+1);

        stringstream ss(s);
        string word;
        vector<string> words;
        string result="";

        while(ss>>word){
            words.push_back(word);
        }
        for(int k = words.size()-1; k>=0;k--){
            result=result+words[k];
            if(k>0){
                result+=' ';
            }
        }
        return result;
    }
};