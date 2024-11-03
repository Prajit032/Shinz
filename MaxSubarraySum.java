
public class MaxSubarraySum {
    public static void subarray(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
         
        for(int i = 0; i< arr.length; i++)
        {
            int start = i;
            for(int j = i; j < arr.length; j++)
            {
                int  end = j;
                currsum = 0;
                for(int k= start; k <= end; k++){
                    currsum += arr[k];
                }
                    System.out.println(currsum);
                    if(currsum > max){
                        max= currsum;
                    }
                }
            }
            System.out.println(max);
            
        }
        public static void main(String args[]){
            int arr[]= {2,4,6,8,10};
            subarray(arr);
        }
}


