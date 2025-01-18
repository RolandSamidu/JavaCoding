import java.util.*;

class AlphabetPattern
{
    public static void main(String[] arg)
    {
        int line, row, col;
        char ch = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        line = scanner.nextInt();

        for (row = 1; row <= line; row++)
        {
            for (col = 1; col <= row; col++)
            {
                System.out.print("" + ch);
            }
            System.out.println();
            ch++;
        }
    }
}