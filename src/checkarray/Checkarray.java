
package checkarray;


public class Checkarray {

   public static boolean arrSort(int[] array)
 
{
        if (array.length <= 1) {
            return
 
true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return
 
false;
            }
        }

        return
 
true;
    }
}
