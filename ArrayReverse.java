public class ArrayReverse
{
    public static void main (String[]args)
    {
       String[] colors = {"red", "blue", "yellow", "green", "Orange"};

        int left = 0;
        int right = colors.length - 1;

        while(left < right) {
            //Swap
            String temp = colors[left];
            colors[left] = colors[right];
            colors[right] = temp;

            // Advance the pointers inward 
            left ++;
            right --;

        }

       for(int i = 0; i < colors.length; i++){
        System.out.println(colors[i]);
       } 
    }
}