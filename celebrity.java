public static int Celebrity(int[][] matrix) {
    int member = 0;

    for (int i = 0; i < matrix.length; i++) {
        if (matrix[member][i] == 1) {
            member = i;
        }
    }

    // Verify if the candidate is indeed a celebrity
    for (int i = 0; i < matrix.length; i++) {
        if (i != member && (matrix[member][i] == 1 || matrix[i][member] == 0)) {
            return -1; 
        }
    }

    return member;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
int cel = Celebrity(matrix);

    if (cel != -1) {
        System.out.println("Celebrity is person " + cel);
    } else {
        System.out.println("No celebrity found");
    }
}
}
