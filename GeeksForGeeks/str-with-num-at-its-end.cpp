// better solution

class Solution{
public:	

	int isSame(string s)
	{
	    int len = s.length();
	    
	    int i = len - 1, num = 0, x = 1;
	    while(i >= 0) {
	        if(s[i] >= '0' && s[i] <= '9') {
	            num += (s[i] - '0') * x;
	            x *= 10;
	            
                // if num is greater than or equal to the length of the string
                // then num cannot be equal to the length of the string before digits
	            if(num >= len) {
	                return 0;
	            }
	        }else{
	            break;
	        }
	        
	        i--;
	    }
	    
	    if(num == i + 1) {
	        return 1;
	    }else{
	        return 0;
	    }
	}
};



// This solution traverse the string backwards and finds the length of the number at end
// Then it gets the length of the word substring and the number substring
// and checks for equality among them

/**
class Solution{
public:	

	int isSame(string s)
	{
	    int len = s.length();
	    int num_count = 0;
	    
	    int i = len - 1;
	    while(i >= 0) {
	        if(s[i] >= '0' && s[i] <= '9') {
	            num_count++;
	            i--;
	        }else{
	            break;
	        }
	    }
	    
	    int word_len = s.substr(0, len - num_count).length();
	    string num_str = s.substr(len - num_count, num_count);
	    
	    stringstream str_to_int(num_str);
	    int num = 0;
	    str_to_int >> num;
	    
	    if(word_len == num) {
	        return 1;
	    }else{
	        return 0;
	    }
	}
};
**/