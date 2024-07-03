public static int[] leftRotate(int[] arr, int d) {
    int n = arr.length;
    int[] rotatedArr = new int[n];

    for (int i = 0; i < n; i++) {
        rotatedArr[(i + n - d) % n] = arr[i];
    }
    for(int i=0;i<n;i++){
     int newindex = (i+d) % n;
     System.out.println(newindex);
     rotatedArr[i] = arr[newindex];
    }

    return rotatedArr;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int d = 2; // Number of left rotations

    int[] rotatedArr = leftRotate(arr, d);
    System.out.println("Original Array: " + Arrays.toString(arr));
    System.out.println("Left Rotated Array: " + Arrays.toString(rotatedArr));

}
