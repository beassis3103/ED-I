import java.util.Scanner;

public class Basic{
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        int idade;
        String nome;
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("\nNome: " + nome + "\nIdade: " + idade);
        
        scanner.close();
    }
}