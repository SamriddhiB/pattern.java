/*Display numbers in a pyramid pattern.
              1
            1 2 1
           1 2 4 2 1
         1 2 4 8 4 2 1
      1 2 4 8 16 8 4 2 1
   1 2 4 8 16 32 16 8 4 2 1
1 2 4 8 16 32 64 32 16 8 4 2 1
*/


public class pattern {
    public static void main(String[] args) {
        int x=8;
        int r=1;
        for (int i = x; i > 0; i--)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= r-1; j++)             
            {
                System.out.print( (int)Math.pow(2, j)+  " ");  
            }
            for (int j = r-1; j >= 1; j--)
            {                    
                System.out.print((int)Math.pow(2, j-1)+" ");
            }                          
            System.out.println();
            r++;
        }
    }
}

