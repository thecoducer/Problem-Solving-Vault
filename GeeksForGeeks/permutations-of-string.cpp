class Solution
{
	public:
	    void permute(vector<string> &result, string s, int l, int r) {
	        if(l == r) {
	            result.push_back(s);
	        }else{
	            for(int i=l;i<=r;i++) {
	                swap(s[l], s[i]);
	                permute(result, s, l+1, r);
	                swap(s[l], s[i]);
	            }
	        }
	    }
	
		vector<string> find_permutation(string s)
		{
		    vector<string> result;
		    permute(result, s, 0, s.length()-1);
		    sort(result.begin(), result.end());
		    return result;
		}
};