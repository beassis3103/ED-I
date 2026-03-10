import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Expressão: ");
        String exp = entrada.nextLine();
        if(estaBalanceado(exp)){
            System.out.println("Expressão Balanceada");
        } else{
             System.out.println("Expressão Desbalanceada");
        }
       
    }
    public static boolean estaBalanceado(String expr){
        Pilha <Character> p = new Pilha <Character>();
        for(int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            try{
            if(c == '('){
                p.push(c);
            }else if(c == ')'){
                if (!p.isEmpty()){
                    p.pop();
                } else{
                    return false;
                }
            }
            
                return p.isEmpty();
            } catch{

            }
        }
    }
}
                                                                                                        