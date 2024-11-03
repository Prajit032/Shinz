class Secondlargestoccurence {

    public static int countSecondLargestOccurrence(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

    
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        int count = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i]== secondLargest) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 6, 8, 8};
        int count = countSecondLargestOccurrence(arr);
        System.out.println("Count is : " + count);
    }
}
