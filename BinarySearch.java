import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int nums[] = {2,5,6,7,9,88,99};
        System.out.println(search(nums, target, 0, nums.length-1));

        sc.close();
    }

    static int search(int[] arr,int target, int s, int e)
    {
        if(s> e) {
            return -1;
        }
        int m = s + (e - s ) / 2;
        if(target == arr[m]){
            return m;
        }
        if(target > arr[m]) {
            return search(arr, target, m + 1, e);
        }
        return search(arr, target, s, m - 1);

    }
}