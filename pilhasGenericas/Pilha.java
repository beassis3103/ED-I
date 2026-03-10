public class Pilha <T>{
    //Atributos
    private static final int TAMD = 100;
    private int topoPilha;
    private T ele[];

    //Construtores
    public Pilha (int tam){
        this.ele = (T[]) new Object[tam];
        this.topoPilha = -1;
    }

    public Pilha (){   
        this(TAMD);
    }

    //Métodos
    public boolean isEmpty(){
        return topoPilha == -1;
    }

    public boolean isFull(){
        return topoPilha == ele.length -1;
    }

    public void push(T e) throws Exception {
        if (!this.isFull()) {
            topoPilha++;
            this.ele[topoPilha] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de pilha.");
        }
    }

    public T pop() throws Exception {
        if (!this.isEmpty()) {
            T temp = this.ele[topoPilha];
            topoPilha--;
            return temp;
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha.");
        }
    }

    public T topo() throws Exception {
        if (!this.isEmpty()) {
            return this.ele[topoPilha];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha.");
        }
    }
    
    public int sizeElements() {
        return topoPilha + 1;
    }
    

}