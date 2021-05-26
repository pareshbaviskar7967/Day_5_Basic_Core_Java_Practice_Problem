class Triplet {

    static void Tripletoperation(int[] arr, int n) {
        boolean found = true;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
            }
        }
        if (found == false)
            System.out.println(" not exist ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 1, 0, 5 };
        int n = arr.length;
        Tripletoperation(arr, n);
    }
}