import java.util.*;
public class MaxcaharCount {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     HashMap<Character,Integer> map = new HashMap<>();
     for(int i = 0; i< s.length(); i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
     int max = Integer.MIN_VALUE;
     char maxC= ' ' ; 
     for(char ch: map.keySet()){
        int value = map.get(ch);
        if(value> max){
            max = value;
            maxC = ch;
        }
     } 
     if(maxC == ' ')
     {
        System.out.println("whitespace");
     }
     else{
     System.out.println(maxC);     
    }
}
}

