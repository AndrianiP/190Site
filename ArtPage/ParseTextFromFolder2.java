import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ParseTextFromFolder2{
    public static void main(String[] args) throws IOException {
        File directoryPath = new File("ArtPage/art/");

        File output = new File("output.txt");


        if (output.delete()){
            System.out.println("\nDeleted the file "+output.getName()+" since it already existed.");
        }
        else{
            System.out.println("File could not be deleted cause it did not exist");
        }

        if (output.createNewFile()){
            System.out.println("Created a new file "+ output.getName());
        }

        if (output.canWrite()){
            File Files[] = directoryPath.listFiles();
            FileWriter automater = new FileWriter(output.getName());
        
         for (int i = 0; i < Files.length; i++){
             automater.write("<img src='art/"+Files[i].getName()+"'>\n");

        }
         automater.close();
         System.out.println("\nDone writing to "+output.getName());
        }
    }
}
    
    

