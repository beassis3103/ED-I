//classe Contador
public class Contador {
    //atributos
    int valor;

    //contrutores
    public Contador(){ //determina que toda vez que eu iniciar um contador, ele vai inicializar zerado
        valor = 0;
    }

    //métodos
    public void Incrementar(){ //incrementa de 1 em 1
        valor++;
    }

    public void Zera(){ //zera o contador
        valor = 0;
    }

    public int getValor(){ //pegar o valor final do contador
        return valor;
    }

//Main
    public static void main(String args[]){
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        c1.Incrementar();
        c1.Incrementar();
        c2.Incrementar();

        System.out.println("Contador 1: " + c1.getValor());
        System.out.println("Contador 2: " + c2.getValor());
    }
}