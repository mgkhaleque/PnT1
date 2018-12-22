package Reader;

import java.io.*;

public class ReadFile {
    public static void main(String []args) throws IOException {

        String path = "/Users/zibonibrahim/Documents/MGK/gd.text";

        FileReader fr = null;
        BufferedReader br = null;

        fr = new FileReader(path);
        br = new BufferedReader(fr);

        String data = " ";
        while ((data = br.readLine()) !=null){
            System.out.println(data);
        }
    }
}
