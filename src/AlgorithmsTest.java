import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void reverseLetters() {
        Algorithms reverseTest = new Algorithms();

        char[] testInput1 = {'c', 'a', 't'};
        char[] testInput2 = {'b', 'a', 'n', 'd'} ;

        char[] expectedOutput1 = {'t', 'a', 'c'};
        char[] expectedOutput2= {'d', 'n', 'a', 'b'};
        assertArrayEquals(expectedOutput1, reverseTest.reverseLetters(testInput1));
        assertArrayEquals(expectedOutput2, reverseTest.reverseLetters(testInput2));
    }
}