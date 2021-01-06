// this solution uses Kadane's algorithm
// we know that kadane's algo works on a guarantee 
// that there must be at least a single positive number
// So, we have to handle the edge case when there are no positive nos.
class Solution {
public:
    int maxSubArray(vector<int>& a) {
        int max_so_far = 0, positive_sum = 0, largest_non_positive = INT_MIN;
        bool has_positive = false;
        
        for(int i=0;i<a.size();i++) {
            positive_sum += a[i];
            
            // finds the largest non-positive number
            if(a[i] > largest_non_positive) {
                largest_non_positive = a[i];
            }
            
            if(positive_sum < 0) {
                positive_sum = 0;
            }else if(positive_sum > max_so_far) {
                max_so_far = positive_sum;
                has_positive = true;
            }
        }
        
        // if we haven't encountered a positive number, print the largest non-positve number
        return has_positive ? max_so_far : largest_non_positive;
    }
};



// This solution uses dynamic programming approach
// also handles when all numbers are negative

/**
class Solution {
public:
    int maxSubArray(vector<int>& a) {
        int max_so_far = a[0], current_max = a[0];
        
        // current_max keeps the local or current max value
        // max_so_far keeps the global max value
        
        for(int i=1;i<a.size();i++) {
            // only add the next number to the current_max 
            // if adding the next number increases current_max
            current_max = max(a[i], current_max + a[i]);
            
            // update max so far if we have found a new greater sum value
            max_so_far = max(max_so_far, current_max);
        }
        
        return max_so_far;
    }
};
**/


// to print the max sum subarray in the DP approach store the index 
// when current + a[i] < a[i] as start and also store the index when
// current_max > max_so_far as end
// then print start to end