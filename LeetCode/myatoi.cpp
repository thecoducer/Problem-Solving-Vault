// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
public:
    int myAtoi(string s) {
        int i, n = s.length();
        
        if(n == 0){
            return 0;
        }
        
        long long int ans = 0;
        
        int sign = 1;
        bool flag = false;
        
        for(i=0;i<n;i++)
        {
            if(!isValid(s[i])){
                return ans;
            }
            
            else if(s[i] == ' ')
            {
                // haven't encountered a sign character yet
                if(flag == false)
                    continue;
                else
                    return ans;
            }
            
            else if(s[i]=='-')
            {
                if(flag == false)
                {
                    sign = -1;
                    flag = true;
                }
                else
                    return ans;
            }
            
            else if(s[i]=='+')
            {
                if(flag == false)
                    flag = true;
                else
                    return ans;
            }
            
            else
            {
                ans = abs(ans) * 10 + (s[i] - '0');
                ans = ans*sign;
                if(ans >= INT_MAX)
                    return INT_MAX;
                else if(ans <= INT_MIN)
                    return INT_MIN;
                flag = true;
            }
        }
         return ans;
    }
    
    bool isValid(char c)
    {
        if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5'|| c=='6' 
           || c=='7' || c=='8' || c=='9' || c==' ' || c=='-' || c=='+')
            return true;
        return false;
    }
};