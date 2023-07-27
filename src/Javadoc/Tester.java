package Javadoc;

/**
 * The type Tester.
 * Author Simone
 */
public class Tester {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("[wordHere]"));
        System.out.println(wordGames.getFullName("Simone", "Benedetti"));
    }
}
