public class CWH_5_PS1 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = rows; i > 0; i--) {
            for (int columns = 0; columns < i; columns++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
