import java.io.*;

public class BinaryToOctal {
    public static void main(String[] args) throws Exception{
        String num = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Binary number : ");
        num = br.readLine();
        int dec = Integer.parseInt(num,2);

        String oct = Integer.toOctalString(dec);

        System.out.println("Binary " + num + " in Octal is " + oct);
    }
}
