package Exercico1Enoque;
import java.util.Scanner;
public class testes {
public static void main(String[] args) {
    //instancias
    Normal n = new Normal();
    camaroteInferior ci = new camaroteInferior();
    CamaroteSuperior cs = new CamaroteSuperior();
    Scanner entrada = new Scanner(System.in);
    
    //variaveis
    int x ;
    int y;
    
    //repetição até o usuario digitar "1" ou "2"
    do 
    {
    System.out.println("Digite: 1 para ingresso normal e 2 para ingresso VIP");
    x = entrada.nextInt();
    }while(x>2);
    
    //condições
    if(x == 1){
        n.imprimirValor();
    }
    if(x == 2){
        System.out.println("Ingresso VIP selecionado... Digite 1 para camarote superior e 2 para camarote inferior.");
        y = entrada.nextInt();
        if(y == 1){
            cs.imprimirLocalização();
            cs.imprimirValor();
        }
        if(y == 2){
            ci.imprimirLocalização();
            ci.imprimirValor();
        }
    }
    
    
    
    
  }
}
