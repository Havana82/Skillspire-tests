import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithms reverse = new Algorithms();
        char[] letters = {'A','B','C','D','E'};
        System.out.println(Arrays.toString(reverse.reverseLetters(letters)));
    }
}