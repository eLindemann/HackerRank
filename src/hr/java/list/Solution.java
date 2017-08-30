package hr.java.list;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        
        List<Integer> l = new ArrayList<>();
        int lLength = reader.nextInt();
        for (int i = 0; i < lLength; i++) {
            l.add(reader.nextInt());
        }
        
        List<List> q = new ArrayList<>();
        int qLength = reader.nextInt();
        for (int i = 0; i < qLength; i++) {
            reader.nextLine(); // load up the next line
            List<Integer> qIn = new ArrayList<>();
            String qString = reader.nextLine();
            qIn.add((Integer) reader.nextInt());
            if (qString.equals("Insert")) qIn.add((Integer) reader.nextInt());
            q.add(qIn);
        }
        
        q.forEach((query) -> {
            int x = (int) query.get(0);
            if (query.size() > 1) {
                int y = (int) query.get(1);
                l.add(x, y);
            } else l.remove(x);
        });
        
        l.forEach((i) -> {
            System.out.print(i + " ");
        });
    }
}