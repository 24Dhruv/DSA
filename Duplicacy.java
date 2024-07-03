static boolean checkDuplicacy(String str) {

 Stack <Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
        
        char  ch = str.charAt(i);
            if (ch == ')') {
                 if( st.size()>0 && st.peek() == '(' ){
                    return true;
                 }
            while(st.peek() != '('){
                 st.pop();
            }
            st.pop();
            }
            else{
            st.push(ch);
            }
        }

    return false ;
        }
