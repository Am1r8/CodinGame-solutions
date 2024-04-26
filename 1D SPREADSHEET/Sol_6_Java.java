import java.util.Scanner;

class Solution 
{
    static Integer[] res;
    static String[][] she;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        she = new String[N][3];
        res = new Integer[N];
        for (int i = 0; i < N; i++) {
            she[i] = new String[]{in.next(), in.next(), in.next()};
        }
        for (int i = 0; i < N; i++) {
            System.out.println(gr(i));
        }
    }
    private static int gr(int index) {
        if (res[index] != null) {
            return res[index];
        }
        String v1 = she[index][1];
        String v2 = she[index][2];
        int i1 = v1.charAt(0) == '$' ? gr(Integer.parseInt(v1.substring(1))) : Integer.parseInt(v1);
        int i2 = v2.equals("_") ? 0 : v2.charAt(0) == '$' ? gr(Integer.parseInt(v2.substring(1))) : Integer.parseInt(v2);
        switch (she[index][0]) {
            case "VALUE":
                res[index] = i1;
                break;
            case "ADD":
                res[index] = i1 + i2;
                break;
            case "SUB":
                res[index] = i1 - i2;
                break;
            case "MULT":
                res[index] = i1 * i2;
                break;
        }
        return res[index];
    }
}