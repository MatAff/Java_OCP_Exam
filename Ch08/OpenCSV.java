
package Ch08;

import java.io.*;

public class OpenCSV {

    public static void main(String[] args) {

        // Create file
	File f = new File("Ch08/items.csv");

        // Open InputStream
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
        
            // Print content
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch(IOException e) {
            System.out.println("Whoops something went wrong; " + e.getMessage());
        }


    } 

} 
