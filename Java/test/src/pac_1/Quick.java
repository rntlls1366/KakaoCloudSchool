package pac_1;
import java.util.Arrays;
import java.util.Scanner;
public class Quick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(quick(arr)));
    }
    public static int[] quick(int[] arr) {
        /**기저조건, arr의 길이가 2이면 1회 정렬, 2 미만이면 그대로 리턴 */
        if(arr.length == 2) {
            if(arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            return arr;
        }
        else if(arr.length < 2) return arr;

        /**피벗 하나를 기준으로 작으면 left 크면 right로 담기 위해 크기를 구하고, 배열 선언 후 값 입력 */
        int pivot = arr[0];
        int left_cnt = 0, right_cnt = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < pivot) left_cnt++;
            else right_cnt++;
        }

        int[] left = new int[left_cnt];
        int[] right = new int[right_cnt];
        left_cnt = 0; right_cnt = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < pivot) left[left_cnt++] = arr[i];
            else right[right_cnt++] = arr[i];
        }

        /**좌 우로 나뉘어진 두 배열을 다시 quick함수로 보내고, 돌아온 정렬된 값을 좌. 피벗. 우 로 배열에 입력 */

        int[] arr1 = quick(left);
        int[] arr2 = quick(right);
        int[] result = new int[arr1.length + arr2.length + 1];
        int result_cnt = 0;
        for(int i = 0; i < arr1.length; i++) {
            result[result_cnt++] = arr1[i];
        }
        result[result_cnt++] = pivot;
        for(int i = 0; i < arr2.length; i++) {
            result[result_cnt++] = arr2[i];
        }
        return result;
    }

}
