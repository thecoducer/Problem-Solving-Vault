vector<int> matrixDiagonally(int mat[MAX][MAX], int n)
{
     int i = 0, j = 0;
     bool isUp = true;
     vector<int> result;
     
     for(int k = 0; k < n * n;) {
         
         if(isUp) {
             // downwards to upwards
             for(; i >= 0 && j < n; i--, j++) {
                 result.push_back(mat[i][j]);
                 k++;
             }
             
             if(i < 0 && j <= n-1) {
                 i = 0;
             }
             
             if(j == n) {
                 i += 2;
                 j--;
             }
         }else{
             // upwards to downwards
             for(; j >= 0 && i < n; j--, i++) {
                 result.push_back(mat[i][j]);
                 k++;
             }
             
             if(j < 0 && i <= n-1) {
                 j = 0;
             }
             
             if(i == n) {
                 j += 2;
                 i--;
             }
         }
         isUp = !isUp;
     }
     
     return result;
}
