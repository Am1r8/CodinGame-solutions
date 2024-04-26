import java.util.*;
import java.math.*;
import java.io.*;
class Solution {
    private static double distance(double longa, double lata, double longb, double latb){
        double x = (longb-longa)*Math.cos((lata+latb)/2);
        double y = latb - lata;
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) * 6371;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Double lon = new Double(in.next().replace(',', '.'));
        Double lat = new Double(in.next().replace(',', '.'));
        int N = in.nextInt();
        in.nextLine();
        double min = Double.POSITIVE_INFINITY;
        String res = "";
        Double d;
        for (int i = 0; i < N; i++) {
            String[] defib = in.nextLine().replace(',', '.').split(";");
            d = distance(lon, lat, new Double(defib[4]), new Double(defib[5]));
            if (d < min) {
                min = d;
                res = defib[1];
            }
        }
        System.out.println(res);
    }
}