class Solution {
public:
    vector<string> result; // Stores all valid letter combinations
    unordered_map<char, string> phoneMap = {
        {'2', "abc"}, {'3', "def"}, {'4', "ghi"}, {'5', "jkl"},
        {'6', "mno"}, {'7', "pqrs"}, {'8', "tuv"}, {'9', "wxyz"}
    };

    void backtrack(string& digits, string current, int index) {
        // Base case: If the current combination is of the required length
        if (index == digits.size()) {
            result.push_back(current); // Store the combination
            return;
        }

        // Get possible letters for the current digit
        string letters = phoneMap[digits[index]];

        // Loop through each letter and recurse
        for (char letter : letters) {
            backtrack(digits, current + letter, index + 1);
        }
    }

    vector<string> letterCombinations(string digits) {
        if (digits.empty()) return {}; // Edge case: Return empty list for empty input
        backtrack(digits, "", 0); // Start recursion
        return result; // Return all possible combinations
        
    }
};