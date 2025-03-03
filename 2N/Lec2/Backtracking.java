import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public List<String> generateParenthesis(int n) {
        
      List<String> ans = new ArrayList<>();

      solve(0,0,"",n,ans);
      return ans;
        
    }
    public void solve(int open, int close, String s, int n, List<String>ans){

        //check if length of string is equal to 2*n
        if(s.length() == 2*n){
            ans.add(s);
            return ans;
        }

        if(open < n){
            solve(open + 1, close, s + "(", n, ans);
        }
        if(close < open){
            solve(open, close + 1, s + ")", n, ans);
        }
    }   
}
