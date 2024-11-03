class Specialarray {
    public static boolean isSpecialArray (int[] arr){
        int n=0;
        if(n==1)
            return true;
        for( int i= 0 ; i< arr.length-1 ; i++ ){
            if((arr[i] % 2 == 0 && arr[i+1] % 2 == 0 ) || (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 )){
                return false;
            }
        }
         return true;
    }
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
            System.out.println(isSpecialArray(arr));

        }  
    
}
    

