public class NumerosPares {
    public static void main (String args[]) {
        for (int i = 0; i < 100; i = i+2) {
            System.out.print(i + ( i == 98 ? "\n" : ", "));
        }
    }
}