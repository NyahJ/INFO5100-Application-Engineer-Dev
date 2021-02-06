
public class FindMaxAndMin{
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        findMaxAndMin(array);
    }
    public static void findMaxAndMin(int[] array){
        int max = array[0];
        int min = array[0];
 
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
  
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The Max value:" + max);
        System.out.println("The Min value:" + min);
    }
}
