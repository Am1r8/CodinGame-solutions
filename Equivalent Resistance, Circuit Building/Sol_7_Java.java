import java.util.*;
import java.util.regex.*;


class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Pattern p1 = Pattern.compile("(\\([^()\\[\\]]+\\)|\\[[^()\\[\\]]+\\])");
        Pattern p2 = Pattern.compile("(\\w+)");
        Map<String, int[]> map = new HashMap<>();
        String  p= "";
        int g= 1001;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) { map.put(in.next(), new int[]{in.nextInt(), 1}); }
        in.nextLine();
        String c = in.nextLine();
        while(!p.equals(c)) {
            p = c;
            Matcher ma = p1.matcher(c);
            while(ma.find()) {
                boolean s = ma.group(1).startsWith("(");
                Matcher sb = p2.matcher(ma.group(1));
                String nc = "HSH" + g++;
                int[] nv = {s?0:1, s?1:0};
                while(sb.find()) {
                    int[] pv = map.get(sb.group(1));
                    if ( s ) {
                        nv[0]  = nv[0] * pv[1] + nv[1] * pv[0];
                        nv[1] *= pv[1]; 
                    }
                    else {
                        nv[1] = nv[1] * pv[0] + nv[0] * pv[1];
                        nv[0] *= pv[0]; 
                    }
                }
                int d1 = nv[0], d2 = nv[1];
                while(d2 > 0) {
                    int temp = d1 % d2;
                    d1 = d2;
                    d2 = temp;
                }
                map.put(nc, new int[] {nv[0]/d1, nv[1]/d1});
                c = c.replaceFirst(ma.group(1).replaceAll("([()\\[\\]])", "\\\\$1"), nc);
            }
        }
        System.out.println(String.format("%.1f", 1.0 * map.get(c)[0] / map.get(c)[1]));
    }
}