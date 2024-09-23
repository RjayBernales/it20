 
package Multidim;

 
public class Multidimentional_Array {
    public static void main(String[] args) {
        
            String[][] arrays = {
                {".", "-", "-", "-", "."},
                {"|", "0", ",", "0", "|", " ", "?"},
                {"[", " ", "-", " ", "]"},
                {"|", "_", "|", "_", "|"}
            };
            for(int i=0; i < arrays.length; i++) {
                for(int j=0; j<arrays[i].length;j++) {
            System.out.print(arrays[i][j]);
        }
                System.out.println(" ");
        }
           
        }
}
