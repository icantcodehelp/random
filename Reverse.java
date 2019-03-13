
/**
 * Write a description of class Reverse here
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    static String SECRET_PASSWORD = "JOHNCENA";
    
    static String obfuscate(String input) 
    {
        return input.replace('O','0');
    }
    public static void main(String [] args) {
        if (args.length !=1)
        {
            System.out.println("Wrong! You have to run this program with one argument :\njava.Reverse <argument>");
            return;
        }
        
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win! Congratulations!");
        }
        else 
        {
            System.out.println("Wrong password! Try again!");
        }
    }
}
