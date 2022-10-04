import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Character> map = new HashMap<>();

        int k = 1 ;
        String s= "10#11#12";
        for(char ch='a';ch<='z';ch++){
            if(ch<'j'){
                map.put(String.valueOf(k++),ch);
            }else{
                map.put(String.valueOf(k++)+"#",ch);
            }

        }
//        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        int i =s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='#'){
                sb.append(map.get(s.substring(i-2,i+1)));
                i=i-3;
            }else{
                sb.append(map.get(s.substring(i,i+1)));
                i=i-1;
            }
        }

        System.out.println(sb.reverse().toString());
    }

}