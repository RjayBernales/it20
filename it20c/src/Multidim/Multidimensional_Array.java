 
package Multidim;

 
public class Multidimensional_Array {
    public static void main(String[] args) {
            //inputs for the array(in my case I designed a Simple Character)
            String[][] arrays = {
                {".", "-", "-", "-", "."},
                {"|", "0", ",", "0", "|", " ", "?"},
                {"[", " ", "-", " ", "]"},
                {"|", "_", "|", "_", "|"}
            };
            //a nested for loop to make the array multdimensional 
            for(int i=0; i < arrays.length; i++) {
                for(int j=0; j<arrays[i].length;j++) {
            System.out.print(arrays[i][j]);
        }
                System.out.println(" ");
        }
           
        }
}
