public class PilhaPratos <T>{
    //atributos
    public static final int TAMD = 100;
    private int topoPilha;  
    private T prato[];

    //contrutores
    public PilhaPratos(int tam){
        this.prato = (T[]) new Object[tam];  
        this.topoPilha = -1;  
    }

    public PilhaPratos(){
        this(TAMD);
    }

    //metodos
    public boolean isEmpty(){
        return topoPilha == -1;
    }

    public boolean isFull(){
        return topoPilha == prato.length -1;
    }

    public void push(T e) throws Exception{
        if(!this.isFull()){
            topoPilha++;
            this.prato[topoPilha] = e;
        } else {
           throw new Exception("Overflow - Pilha lotada");
        }
    }

    public void pop(T e) throws Exception{
        if(!this.isEmpty()){
            topoPilha -= 1;
            this.prato[topoPilha] = e;
        } else{
            throw new Exception("Underflow- Pilha vazia");
        }
    }

    public T topo(T e) throws Exception{
        if(!this.isEmpty()){
            return this.prato[topoPilha];
        }else{
            throw new Exception("Underflow - Pilha vazia");
        }
    }

    public int sizeElement(){
        return topoPilha +1;
    }
}
