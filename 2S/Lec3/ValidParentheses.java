package 2S.Lec3;

public class ValidParentheses {

    public boolean isValid(String s)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0, n=s.length(); i<n; i++)
        {
            char c=s.charAt(i);
            if(st.isEmpty())
            {
                if(c==')'||c=='}'||c==']') return false;
                else st.push(c);
            }
            else
            {
                if(c==')' && st.peek()=='(') st.pop();
                else if(c=='}' && st.peek()=='{') st.pop();
                else if(c==']' && st.peek()=='[') st.pop();
                else st.push(c);
            }
        }
        return st.isEmpty();
    }
}
