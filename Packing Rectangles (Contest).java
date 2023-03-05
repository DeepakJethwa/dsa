There are n rectangles of the same size: w in width and h in length. It is required to find a square of the smallest size into which these rectangles can be packed. Rectangles cannot be rotated.
Input
The first line of the input contains three space separated integers w, h and n.

Constraints
1 ≤ w, h, n ≤ 109
Output
Output the minimum length of a side of a square, into which the given rectangles can be packed.
  
  
  import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework


 

// don't change the name of this class

// you can add inner classes if needed

class Main {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        long w = s.nextLong();

        long h = s.nextLong();

        long n = s.nextLong();

        

        long left = 1;

        long right = (long)(1e18)*1L;

        long ans = -1;

        while(left <= right){

            long mid = left +(right - left)/2;

            long sq = mid ;

            long x = sq/w;

            long y = sq/h;

            if((y > 0 && x >= ((n-1)/y+1)) || (x > 0 && y >= ((n-1)/x+1))){

                ans = sq;

                right = mid - 1;

            }else {

                left = mid + 1;

            }

        }

        System.out.println(ans);

    }

}
