public class Swap
{
    public static void main(String[]args)
    {

        int a = 7;
        int b = 15; 

        int temp = a;
        a = b; 
        b = temp;
         
        System.out.println("a is" + a);
        System.out.println("b is " + b);
    }
}