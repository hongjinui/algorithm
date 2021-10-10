import java.io.*;
import java.util.StringTokenizer;

public class Test {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine(); //String
        String s2 = br.readLine(); //String

        bw.write(s+ "\n");
//        bw.newLine();
        bw.write(s2);
        bw.flush();
        bw.close();



/*
//        int i = Integer.parseInt(bf.readLine()); //Int

//        String s2 = bf.readLine(); //String
//        int i2 = Integer.parseInt(bf.readLine()); //Int

        System.out.println(s);
//        System.out.println(i);
        System.out.println(s2);
//        System.out.println(i2);

        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String[] arr = s2.split(" ");
        for(String ch : arr){
            System.out.println(ch);
        }
*/



    }
}
