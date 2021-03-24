vector<int> matrixDiagonally(int mat[MAX][MAX], int n)
{
     int i = 0, j = 0;
     // initial direction is down to up
     bool isUp = true;
     vector<int> result;
     
     // traverse all n*n elements
     for(int k = 0; k < n * n;) {
         
         if(isUp) {
             // downwards to upwards
             for(; i >= 0 && j < n; i--, j++) {
                 result.push_back(mat[i][j]);
                 k++;
             }
             
             // if i becomes less than 0
             // when j is still less than n
             // reset i to 0
             if(i < 0 && j < n) {
                 i = 0;
             }
             
             // if j is out of bounds
             if(j == n) {
                 i += 2; // adding two when i is negative and j is out of bounds
                 j--;
             }
         }else{
             // upwards to downwards
             for(; j >= 0 && i < n; j--, i++) {
                 result.push_back(mat[i][j]);
                 k++;
             }
             
             // if j becomes less than 0
             // when i is still less than n
             // reset j to 0
             if(j < 0 && i < n) {
                 j = 0;
             }
             
             // if i is out of bounds
             if(i == n) {
                 j += 2; // adding two when j is negative and i is out of bounds
                 i--;
             }
         }
         // reverse the flag to change the direction
         isUp = !isUp;
     }
     
     return result;
}
