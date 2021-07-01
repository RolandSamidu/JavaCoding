class CodePractise
{
    public static void main(String[] args) {
        String name = "John";
        String s_name = "Walker";
        int number = 69;
        float no = 12.21f;
        char letter = 'A';
        float value = number + no;
        int x = 12, y = 13, z = 15;
        boolean mybool = true;
        byte no_1 = -100;
        short no_2 = 20000;
        long no_3 = 15000000000L;
        double no_4 = 123.321d;
        float f1 = 35e3f;
        double d1 = 12E4d;
        char b = 68;
        char c = 73, d = 76, e = 79, f = 86, g = 69, i = 89, j = 85; 
        System.out.println(name + " " + s_name);
        System.out.println(number);
        System.out.println(no);
        System.out.println(letter);
        System.out.println(value);
        System.out.println(x+y+z);
        System.out.println(mybool);
        System.out.println(no_1);
        System.out.println(no_2);
        System.out.println(no_3);
        System.out.println(no_4);
        System.out.println(f1 + "  " + d1);
        System.out.println(c+" "+d+e+f+g+" "+i+e+j); //create a "I LOVE YOU" from ASCII value
        System.out.println(b+""+e+""+d+""+d);

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; //Automatic casting : int to double
        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Cating
        double my_Double = 8.96;
        int my_Int = (int) my_Double; //Manual Casting : double to int
        System.out.println(my_Double);
        System.out.println(my_Int);
    }
}
