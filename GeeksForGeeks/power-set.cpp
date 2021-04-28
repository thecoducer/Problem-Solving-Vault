void powerSetUtil(string s, vector<string> &result, int index, string curr) {
    result.push_back(curr);
    
    int n = s.length();
    
    // append remaining chars to the current subset
    for(int i=index+1; i<n; i++) {
        curr = curr + s[i];
        powerSetUtil(s, result, i, curr);
        // once all subsets beginning with
        // initial "curr" are printed, remove
        // last character to consider a different
        // prefix of subsets.
        curr.erase(curr.length() - 1);
    }
    
    return;
}

vector <string> powerSet(string s)
{
    vector<string> result;
    powerSetUtil(s, result, -1, "");
    return result;
}