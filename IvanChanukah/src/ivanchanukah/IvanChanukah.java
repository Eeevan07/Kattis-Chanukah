/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanchanukah;
import java.io.*;
/**
 *
 * @author Ivan
 */
public class IvanChanukah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(in.readLine());
        while (cases-- > 0) {
            String[] tokens = in.readLine().split(" ");
            int n = Integer.parseInt(tokens[1]);
            out.write(tokens[0] + " " + (n * (n + 1) / 2 + n) + "\n");
        }

        out.close();
        in.close();
    }
    
}
