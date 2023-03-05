The high median paradigm (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two integer N and M. You have to construct an array A having N non- negative integers such that the sum of its elements is M. As there are many such arrays possible, find the maximum median of all such possible arrays.
Input
The first line of the input contains two integers N and M.

Constraints:
1 <= N, M <= 109
Output
Print the maximum median possible.
  
  
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n==1)
        System.out.print(m);
        else{
            int mid = (int)Math.ceil((double)(n)/2.0);
            mid--;
            int median = m/(n-mid);
            System.out.print(median);
        }
    }
}
