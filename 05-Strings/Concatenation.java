// Concatenation - in simple terms, chaining things together.

// To concatenate Strings, use the + operator OR the concat() method.

public class Concatenation
{
    public static void main(String[] args)
    {
        // Predeclare some Strings
        String str1 = "how";
        String str2 = "are";
        String str3 = "you";
        
        // Example 1
        String phrase = str1 + " " + str2 + " " + str3;
        System.out.println(phrase);
        
        // Example 2
        char episodeNum = '8';
        String primitiveConcatenation = "This is Episode: " + episodeNum;
        System.out.println(primitiveConcatenation);
        
        // Example 3
        String blah = "I am " + (6 + 7) + " years old.";
        System.out.println(blah);
        
        // Example 4
        String concatExample = str1.concat(str2).concat(str3);
        System.out.println(concatExample);
        
        // BONUS Example:
        String bonus = "H" + str1.substring(1) + " " + str2 + " " + str3 + "?";
        System.out.println(bonus);
    }
}