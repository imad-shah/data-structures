import java.util.Scanner;
public class ReverseWords
{
    public static String reverse_words(String str)
    {
        StackInterface <String> stack = new LinkedStack<String>();
        String top_of_stack = "";
        String reversed = "";
        for (int i  =0; i < str.length(); i++)
        {

            if (str.charAt(i) == ' ')
            {
                while (!stack.isEmpty())
                {
                    top_of_stack = stack.peek();
                    stack.pop();
                    reversed += top_of_stack;
                }
                reversed += ' ';
            }
            else
            {
                stack.push(String.valueOf(str.charAt(i)));
            }
        }
        while(!stack.isEmpty())
        {
            reversed += stack.pop();
        }
        return reversed;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string to have it reversed: ");
        String input = sc.nextLine();
        System.out.print(reverse_words(input));

    }
}