import java.util.Scanner;

public class Input
{
    public Input()
    {
        //empty constructor
    }
    
    public String acceptInput()
    {
        String input;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter input: ");
        input = console.nextLine();
        System.out.println("Your Input is " + input);
        return input;
    }
}