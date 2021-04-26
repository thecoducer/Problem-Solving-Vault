class Solution{
    
    // stores mapping for phone digits to char sets
    const vector<string> numToCharsMap{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public:
    void possibleWordsUtil(int a[], int n, int currDigit, vector<string> &result, char output[]) {
        // currDigit is a pointer
        // if it reaches n, then all n buttons have been pressed
        // so we store the combination formed
        if(currDigit == n) {
            result.push_back(output);
            return;
        }
        
        // buttons 0 and 1 don't have any char set
        if(a[currDigit] == 0 || a[currDigit] == 1) {
            return;
        }
            
        // generating word combinations
        for(int i=0;i<numToCharsMap[a[currDigit]].length();i++) {
            output[currDigit] = numToCharsMap[a[currDigit]][i];
            possibleWordsUtil(a, n, currDigit + 1, result, output);
        }
    }
    
    vector<string> possibleWords(int a[], int n)
    {
        vector<string> result;
        char output[n+1];
        output[n] = '\0';
        
        possibleWordsUtil(a, n, 0, result, output);
        return result;
    }
};