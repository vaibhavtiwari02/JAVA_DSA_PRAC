/**
 * paranthesis
 */
public class paranthesis {
    public static String removeParanthesis(String s){
        int p=0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);
            if(c == '('){ //if it encounters a '(' it increases value of p by 1
                p++;
                if(p>1){ //in the starting it ncounters 2 '(' thus p =2.
                    sb.append(" "+c);
                }
            }
            else{
                p--; //at last it encounters 2 ')' therefore value becomes 1 for the last ')'
                if(p>0){
                    sb.append(" "+c); //only appends the last ')'
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s ="(()())";
        System.out.println(removeParanthesis(s));
    }
}