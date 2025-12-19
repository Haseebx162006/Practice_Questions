public class Main1 {
    public static void main(String[] args){
     int arr[][]= new int[4][];
     for(int i=0 ; i<arr.length ; i++){
        arr[0]=new int[3];
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=4;
        }
     }
    }
}
