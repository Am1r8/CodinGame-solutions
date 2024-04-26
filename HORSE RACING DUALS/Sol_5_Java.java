import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        TreeSet<Integer> ho = new TreeSet<Integer>();
        for (int i = 0; i < N; i++)
            ho.add(in.nextInt());
        Iterator<Integer> it = ho.iterator();
        int cu, pr = it.next(); 
        int mi = Integer.MAX_VALUE;
        while (it.hasNext()) {
            cu = it.next();
            if (cu-pr < mi)
                mi = cu-pr;
            pr = cu;
        }
        System.out.println(mi);
    }
}