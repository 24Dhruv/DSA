 public static boolean isBalanced(String str) {

           Stack<Character> stack = new Stack<>();
           for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.charAt(i)=='(' || str.charAt(i)=='{'|| str.charAt(i)=='['){
                   stack.push(ch);
                //    continue;
               }
               else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
            }
    } return true;
}
