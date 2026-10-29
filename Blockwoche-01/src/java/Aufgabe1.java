public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] x = new int[3][4];

        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[0][3] = 4;
        x[1][0] = 5;
        x[1][1] = 6;
        x[1][2] = 7;
        x[1][3] = 8;
        x[2][0] = 9;
        x[2][1] = 10;
        x[2][2] = 11;
        x[2][3] = 12;

        System.out.println(print2darray(x));
    }

    public static boolean print2darray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return true;
    }
}
// bleh