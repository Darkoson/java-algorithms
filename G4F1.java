public class G4F1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 2, 5, 8, 6, -2 };

        int start = 0;
        int end = arr.length - 1;

        quisort(arr, start, end);

        for (int i = 0; i <= end; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void quisort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int index = partition(arr, l, r);

        quisort(arr, l, index-1);
        quisort(arr, index + 1, r);

    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int index = l;
        for (int i = l ; i < r; i++) {
            if (arr[i] < pivot) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, r);

        return index;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
