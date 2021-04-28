class Solution{
public:
    bool isLucky(int n) {
        // keeps track of the no. of iterations
        // static variable is shared among recursive calls
        static int counter = 2;
        
        // counter has left the n or the calculated position of the input no. behind
        // then n was not deleted
        // hence lucky number
        if(counter > n) {
            return true;
        }
        
        // if n is a multiple of counter
        // it will get deleted
        if(n % counter == 0) {
            return false;
        }
        
        // calculate position for the input number, n
        // (n / counter) gives us how many numbers get deleted
        n = n - (n / counter);
        
        counter++;
        
        return isLucky(n);
    }
};