public class Algorithms {

    public char[] reverseLetters(char[] letters) {

        int k = 0;
        for(int i = letters.length-1; i >=(letters.length)/2; i--){
            char temp = letters[k];
            letters[k] = letters[i];
            letters[i] = temp;
            k++;
        }
        return letters;
    }
}
