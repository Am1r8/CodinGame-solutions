import java.util.*;

class Player
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int lx = in.nextInt();
        int ly = in.nextInt();
        int inx = in.nextInt();
        int iny = in.nextInt();

        while (true)
        {
            String d = "";
            if (iny < ly)
            {
                iny++;
                d = "S";
            }
            else if (iny > ly)
            {
                iny--;
                d = "N";
            }
            if (inx < lx)
            {
                inx++;
                d += "E";
            }
            else if (inx > lx)
            {
                inx--;
                d += "W";
            }
            System.out.println(d);
        }
    }
}