package Javadoc;

/**
 * The type Word games.
 * Author Simone
 */
public class WordGames {
    /**
     * Add hello word string.
     *
     * @param word the word
     * @return the string
     */
    public String addHelloWord(String word){
        return "Hello" + " " +word;
    }

    /**
     * Get full name string.
     *
     * @param name    the name
     * @param surname the surname
     * @return the string
     */
    public String getFullName(String name, String surname){
        return name + " " +surname;
    }
}
