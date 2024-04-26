import java.util.*;
import java.io.*;
import java.math.*;

class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
            int mmh = 0;
            int mmx = 0;
        while (true) {
            for (int i = 0; i < 8; i++) {
                int h = in.nextInt();
                if (mmh <= h) {
                    mmh = h;
                    mmx = i;
                }
            }
            System.err.println(mmh);
            System.out.println(mmx);
            mmh = 0;
            mmx = 0;
        }
    }
}