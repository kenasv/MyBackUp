/*This freeware program.
 */
package mybackup;
import java.util.Scanner;
import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author kenasv
 */
public class MyBackUp {

    /**
     * @param args the command line arguments
     */
    static String[] m = new String [5];
    static Scanner scn;

 
    public static void main(String args[]) {
        openFile();
        readFile();
        outFile();
    }
    
    private static void openFile(){
        try{
        scn = new Scanner (new File("d:/1/test.txt"));
        }catch(Exception e) {JOptionPane.showMessageDialog(null, "Файл не найден");}
    }
    
    private static void readFile(){
        while (scn.hasNext()){
          for(int row=0;row<m.length;row++){
              
              m[row] = scn.next();
              
                        }  
        }
    }
    private static void outFile(){
        for(int row=0;row<m.length;row++){
              
              System.out.print(m[row]);
              
              System.out.println();
          }
    }
        
}
