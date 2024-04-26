import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
 
        int nbAssociations = in.nextInt();
        int nbFiles = in.nextInt();
        in.nextLine();
        Map assoc = new HashMap();
        for (int i = 0; i < nbAssociations; i++) {
            assoc.put(in.next().toLowerCase(), in.next());
            in.nextLine();
        }
 
        for (int i = 0; i < nbFiles; i++) {
            String fileName = in.nextLine().toLowerCase();
            int pos = fileName.lastIndexOf('.');
            String extension = (pos == -1) ? "" : fileName.substring(pos+1, fileName.length());
            System.out.println((String)(assoc.getOrDefault(extension, "UNKNOWN")));
        }
    }
}