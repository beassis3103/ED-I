package basico;

public class Trabalhador {
    private String nome;
    private int idade;
    private float salario;

    public Trabalhador(){
        nome = ("Nenhum nome");
        idade = 0;
        salario = 0;
    }

    public Trabalhador(String nome, int idade, float salario){
        this.nome = nome;
        this.idade = idade;
        this.salario= salario;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    
    public float getSalario(){
        return salario;
    }
     public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário mensal: " + salario);
        System.out.println("Salário anual: " + calcSalarioAnual());
    } 

    public float calcSalarioAnual(){
        return (salario *13);
    }




}
