using System;

public class Solution
{
    public static void Main()
    { 
        string[] l = Console.ReadLine().Split();
        int W = int.Parse(l[0]);
        int H = int.Parse(l[1]);
        string[] T = Console.ReadLine().Split(new [] { "  " }, StringSplitOptions.None);
        int[] Ti = new int[T.Length];
        for (int i = 0; i < Ti.Length; i++)
        {
            Ti[i] = i;
        }
        for (int i = 0; i < H - 2; i++)
        {
            l = Console.ReadLine().Split('|');
            for (int j = 0; j < l.Length; j++)
            {
                if (l[j] == "--")
                {
                    for (int k = 0; k < Ti.Length; k++)
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
        string[] B = Console.ReadLine().Split(new [] { "  " }, StringSplitOptions.None);
        for (int i = 0; i < T.Length; i++)
        {
            Console.WriteLine(T[i] + B[Ti[i]]);
        }
    }
}