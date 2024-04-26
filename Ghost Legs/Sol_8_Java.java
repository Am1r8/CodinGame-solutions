import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    { 
        Scanner s = new Scanner(System.in);
        String[] l = s.nextLine().split(" ");
        int W = Integer.parseInt(l[0]);
        int H = Integer.parseInt(l[1]);
        String[] T = s.nextLine().split("  ");
        int[] Ti = new int[T.length];
        for (int i = 0; i < Ti.length; i++)
        {
            Ti[i] = i;
        }
        for (int i = 0; i < H - 2; i++)
        {
            l = s.nextLine().split("\\|");
            for (int j = 0; j < l.length; j++)
            {
                if (l[j].equals("--"))
                {
                    for (int k = 0; k < Ti.length; k++)
                    {
                        if (Ti[k] == j - 1)
                        {
                            Ti[k] += 1;
                        }
                        else if (Ti[k] == j)
                        {
                            Ti[k] -= 1;
                        }
                    }
                }
            }
        }
        String[] B = s.nextLine().split("  ");
        for (int i = 0; i < T.length; i++)
        {
            System.out.println(T[i] + B[Ti[i]]);
        }
    }
}