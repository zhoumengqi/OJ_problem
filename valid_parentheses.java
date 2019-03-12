import java.util.Stack;

public class valid_parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char chs[] = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '(' || chs[i] == '[' || chs[i] == '{') {
                stack.add(chs[i]);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                switch (chs[i]) {
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;

                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new valid_parentheses().isValid("((([]))"));
    }
}
