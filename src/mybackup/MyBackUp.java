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
    static String[] m = String [5];
    static Scanner scn;

 
    public static void main(String[] args) {
        openFile();
        readFile();
        outFile();
    }
    
    private static void openFile(){
        try{
        scn = new Scanner (new File(D:/1/test.txt));
        }catch(Exception e) {JOptionPane.showMessageDialog(null, "Файл не найден");}
    }
    
    private static void readFile(){
        while (scn.hasNext()){
          for(int row=0;row<m.length;row++){
              for(int col=0;col<m[row].length;col++){
              m[row][col] = scn.next();
              }
          }  
        }
    }
    private static void outFile(){
        
    }
        
}
