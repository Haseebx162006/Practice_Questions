public class Question1 {
    public static <T> void Swap(T[] array, int position1,int position2){
        position1--;
        position2--;
        T temp= array[position1];
        array[position1]=array[position2];
        array[position2]=temp;
    }
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{1,2,3,4};
        Swap(arr, 1, 3);
        for(Integer integer: arr){
            System.out.println(integer);
        }
    }
    
}
