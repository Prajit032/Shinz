 class rhymingword {

    public static int RhymeCount(String word, String input) {
        int count = 0;
        int minLength = Math.min(word.length(), input.length());
        for (int i = 1; i <= minLength; i++) {
            if (word.substring(word.length() - i).equals(input.substring(input.length() - i))) {
                count = i;
            } else {
                break;
            }
        }
        return count;
    }
    public static String RhymingWord(String[] arr, String input) {
        int maxCount = 0;
        String res = "";
        for (String word : arr) {
            int rhymeCount = RhymeCount(word, input);
            if (rhymeCount > maxCount || (rhymeCount == maxCount && word.length() < res.length())) {
                maxCount = rhymeCount;
                res = word;
            }
        }
        return res;
    }

    
        public static void main(String[] args) {
            String[] arr = {"gender", "blender", "blunder", "under"};
            String input = "thunder";
            System.out.println(RhymingWord(arr, input));
        }
}
