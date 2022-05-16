public class PrintStringConcat {
    public static void main (String args[]) {
        String texto1 = "Holberton";
        String texto2 = "School";
        String texto = "Bem vindo a ".concat(texto1).concat(" ").concat(texto2).concat("!");
        System.out.println(texto);
    }
}
