import java.util.Scanner;

public class cadastro {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        String[] array = nome.split(" ");
        char letra = (array[0].charAt(0));
        String sobrenome = array[array.length - 1];
        String log = letra + "_" + sobrenome;
        System.out.println("Seu username e: " + log);

        System.out.println("Informe a senha: ");
        String senha = scanner.nextLine();

        if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7){
            System.out.println("Senha padrao forte!!!");
        }
         else{
        System.out.println("Senha fraca!!!");
        }
    }
}
