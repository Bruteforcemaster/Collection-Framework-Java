import java.util.Arrays;

public class ArraysClassLeran {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(arr,4);
        System.out.println(index);
        Arrays.sort(arr);

        Arrays.fill(arr,12);
    }
}
