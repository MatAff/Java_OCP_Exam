
package Ch08;

import java.io.*;

public class Meth {

    public static void main(String[] args) {
    
        // Create existing file
        File f = new File("Ch08/test.txt");
        System.out.println(f);

        // Create non-existing file
        File n = new File("Ch08/fail.txt");
        System.out.println(n);

        // Create file for directory
        File d = new File("Ch08");
        System.out.println(d);

        /// /// /// FILE ELEMENTS /// /// ///

        // Get name
        System.out.println("// Get name");
        System.out.println(f.getName());
        System.out.println(d.getName());
        System.out.println(n.getName());

        // Get absolute path
        System.out.println("// Get absolute path");
        System.out.println(f.getAbsolutePath());
        System.out.println(d.getAbsolutePath());
        System.out.println(n.getAbsolutePath());

        // Get parent directory
        System.out.println("// Get parent directory");
        System.out.println(f.getParent());
        System.out.println(d.getParent());
        System.out.println(n.getParent());

        /// /// /// FILE CHARACTERISTICS /// /// /// 

        // Check if file exists
        System.out.println("// Check if file exists");
        System.out.println(f.exists());
        System.out.println(d.exists());
        System.out.println(n.exists());

        // Is directory
        System.out.println("// Is directory");
        System.out.println(f.isDirectory());
        System.out.println(d.isDirectory());
        System.out.println(n.isDirectory());

        // Is file
        System.out.println("// Is file");
        System.out.println(f.isFile());
        System.out.println(d.isFile());
        System.out.println(n.isFile());

        // Length (file size)
        System.out.println("// Length (file size)");
        System.out.println(f.length());
        System.out.println(d.length());
        System.out.println(n.length());

        // Last modified
        System.out.println("// Last modified");
        System.out.println(f.lastModified());
        System.out.println(d.lastModified());
        System.out.println(n.lastModified());

        /// /// /// FILE ALTERATIONS /// /// ///
  
        // Create file
        try (PrintWriter pw = new PrintWriter(n)) {
            pw.append("Hi");
        } catch (FileNotFoundException e) { } 

        // Check exists and delete
        System.out.println("// Check exists and delete");
        System.out.println(n.exists());
        System.out.println(n.delete());
        System.out.println(n.exists());
        System.out.println(n.delete());
    } 

}

