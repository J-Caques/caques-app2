package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class TSV {
    //convertToTSV()
        /*
            Converts List pulled from AddInventory into TSV
         */

   void saveTSVFile(List<ItemEntry> a, ItemEntry object) {
       System.out.println("Enter Filename: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        String file = fileName + ".csv";

    try {
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Serial Number\tName\tValue");

        for(int i=0;i<a.size();i++){
            pw.println(object);
        }
        pw.close();
        fw.close();
        }
    catch (IOException e){
        System.out.println("Error printing Tab Delimited File");
    }
    }
}
