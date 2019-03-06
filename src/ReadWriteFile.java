import java.io.*;

public class ReadWriteFile {

    public static void main(String args[])
    {
        String fileIn = "D://file_in.txt";
        String fileOut = "D://file_out.txt";

        try(BufferedReader br = new BufferedReader((new FileReader(fileIn)))){

            String line;
            while((line = br.readLine()) != null)
            {
                try(BufferedWriter bw = new BufferedWriter((new FileWriter(fileOut, true)))) {

                    bw.write(line);
                    bw.newLine();

                }catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
