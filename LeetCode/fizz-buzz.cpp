class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> result;
        
        for(int i = 1; i <= n; i++) {
            string temp = "";
            
            temp += divisibleByX(i, 3, "Fizz");
            temp += divisibleByX(i, 5, "Buzz");
            
            if(temp == "") {
                temp += to_string(i);
            }
            
            result.push_back(temp);
        }
        
        return result;
    }
    
    string divisibleByX(int n, int x, string outputStr) {
        return n % x == 0 ? outputStr : "";
    }
    
};