package basico;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Trabalhador trabA = new Trabalhador();

        System.out.println("Cadastre o trabalhador A: ");
        System.out.print("Nome: ");
        String nome = s.nextLine();
        trabA.setNome(nome);

        System.out.print("Idade: ");
        int idade = s.nextInt();
        trabA.setIdade(idade);

        System.out.print("Salário: ");
        float salario = s.nextFloat();
        trabA.setSalario(salario);

        trabA.calcSalarioAnual();
        trabA.mostrar();

    }
    
}
