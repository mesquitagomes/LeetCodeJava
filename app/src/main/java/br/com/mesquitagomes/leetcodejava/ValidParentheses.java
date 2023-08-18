package br.com.mesquitagomes.leetcodejava;

public class ValidParentheses {

    public boolean isValid(String s) {
        
        char[] opener = new char[s.length()];
        int i = 0;

        if (s.length() % 2 != 0)
            return false;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                opener[i++] = c;
            else if (c == ')') {
                if (i == 0 || opener[--i] != '(')
                    return false;
            } else if (c == ']') {
                if (i == 0 || opener[--i] != '[')
                    return false;
            } else if (c == '}') {
                if (i == 0 || opener[--i] != '{')
                    return false;
            }
        }

        return !(i > 0);
    }

}
