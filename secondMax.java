import java.util.*;


public class secondMax {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();

     int[] arr = new int[size];

     for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
     }
    
     int max= Integer.MIN_VALUE , min = Integer.MAX_VALUE;
     for(int i= 0; i < arr.length; i++){
     if (arr[i]> max)
     max = arr[i];
     if(arr[i]<min)
     min= arr[i];
    }
     int smax= Integer.MIN_VALUE, smin = Integer.MAX_VALUE;
     for(int i= 0; i < arr.length; i++){
     if(arr[i]<max && arr[i]>smax){
        smax = arr[i];
     }
     if(arr[i]>min && arr[i]<smin){
        smin = arr[i];
     }
    }
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0; i<arr.length; i++)
    {
        map.put(arr[i], map.getOrDefault(arr[i],0)+1);
    }
    System.out.println(map.get(smax)+ " " +map.get(smin));

}
}

