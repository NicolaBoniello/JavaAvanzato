import java.io.*;

public class Main {

    public static void main(String[] args) {
        Main s = new Main();

        String dir = "C:\\Users\\nicol\\Desktop\\esercizio\\src";
        String file = dir+"\\file.txt";

        s.creaFile(file);
        s.bufferedWriter(file, "hello","how","are", "you", "?");
        s.fileReader(file);
    }

    public void creaFile(String path){
        File f = new File(path);

        if (!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void bufferedWriter(String filePath, String... testo){


        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(getFile(filePath)));
            for (String string : testo)
            {
                bw.write(string);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    private File getFile(String filePath){

        File file = new File(filePath);

        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return file;

    }

    public void fileReader(String filePath) {

        try(

                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);


        ) {

            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);

            }

            System.out.println("----------------------");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}