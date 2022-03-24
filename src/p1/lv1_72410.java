package p1;

import java.util.Locale;

public class lv1_72410 {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"	));
    }

    static class Solution {
        public String solution(String new_id) {

            String answer = null;

            new_id = new_id.toLowerCase(Locale.ROOT);
            new_id = new_id.replaceAll("[^a-z0-9_.-]","");
            new_id = aa(new_id);

            if(new_id.charAt(0) == '.'){
                new_id = new_id.substring(1);
            }

            if (new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0,new_id.length()-1);

            }
            if(new_id.isEmpty()){
                new_id += "a";
            }
            new_id = new_id.substring(0,15);

            if (new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0,new_id.length()-2);
            }
            int cnt = new_id.length();
            if(cnt <= 2 ){
                cnt++;
                new_id += new_id.charAt(new_id.length());
            }
            answer = new_id;

            return answer;
        }

        static String aa(String new_id){

            if(new_id.contains("..")){
                new_id = new_id.replace("..",".");
                aa(new_id);
            }
            return new_id;
        }
    }
}
