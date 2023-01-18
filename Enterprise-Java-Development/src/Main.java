public class Main {
    public static void main(String[] args){

        int[] array1 = {1, 2, 3, 4, 5};
        differenceOfNumbers(array1);
        findTheSmallest(array1);
    }

    public static void differenceOfNumbers(int[] array){
        int largest = array[0];
        int smallest = array[0];
        for (int i=0; i<array.length; i++){
            if (largest<array[i]){
                largest = array[i];
            } else if (smallest>array[i]){
                smallest = array[i];

            }
        }
        System.out.println(largest-smallest);
    }

    public static void findTheSmallest(int[] array){
        int smallest = array[0];
        for (int i=0; i<array.length; i++){
            if (smallest>array[i]){
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }
}
