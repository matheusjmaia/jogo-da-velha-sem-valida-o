
package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class JogoDaVelha {


    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String L1 = "-",L2 = "-",L3 = "-",L4 = "-",L5 = "-",L6 = "-",L7 = "-",L8 = "-",L9 = "-";
        String bolinha = "O";
        String xis = "X";
        int i;
        int para = 0;
        String jogar;
        int local;
        System.out.println("-"+L1+"-+-"+L2+"-+-"+L3+"-");
        System.out.println("-"+L4+"-+-"+L5+"-+-"+L6+"-");
        System.out.println("-"+L7+"-+-"+L8+"-+-"+L9+"-");
        System.out.println("De quem é a vez de jogar? X ou O?");
        jogar = console.next();
        String x = "x";
        boolean jogador =  jogar.equalsIgnoreCase(xis);
        for (i = 1; i <=9; i++){
            if (jogador){
                jogar = "X";
            } else{
                jogar = "O";
            }
        System.out.println("Qual local?");
        local = console.nextInt();
        switch (local){
            case 1:                
                L1 = jogar;
                break;
            case 2:
                L2 = jogar;
                break;
            case 3:
                L3 = jogar;
                break;
            case 4:
                L4 = jogar;
                break;
            case 5:
                L5 = jogar;
                break;
            case 6:
                L6 = jogar;
                break;
            case 7:
                L7 = jogar;
                break;
            case 8:
                L8 = jogar;
                break;
            case 9:
                L9 = jogar;
                break;
            }
        
        
        jogador = !jogador;
        System.out.println("-"+L1+"-+-"+L2+"-+-"+L3+"-");
        System.out.println("-"+L4+"-+-"+L5+"-+-"+L6+"-");
        System.out.println("-"+L7+"-+-"+L8+"-+-"+L9+"-");
        
    if ((L1.equals("O") && L2.equals("O") && L3.equals("O")) || (L4.equals("O") && L5.equals("O") && L6.equals("O")) || (L7.equals("O") && L8.equals("O") && L9.equals("O")) || (L1.equals("O") && L4.equals("O") && L7.equals("O")) || (L2.equals("O") && L5.equals("O") && L8.equals("O")) || (L3.equals("O") && L6.equals("O") && L9.equals("O")) || (L1.equals("O") && L5.equals("O") && L9.equals("O")) || (L7.equals("O") && L5.equals("O") && L3.equals("O"))){
        System.out.println("O jogador representado por Bolinha, ganhou!");
        para = 1;
        break;
    }
    if ((L1.equals("X") && L2.equals("X") && L3.equals("X")) || (L4.equals("X") && L5.equals("X") && L6.equals("X")) || (L7.equals("X") && L8.equals("X") && L9.equals("X")) || (L1.equals("X") && L4.equals("X") && L7.equals("X")) || (L2.equals("X") && L5.equals("X") && L8.equals("X")) || (L3.equals("X") && L6.equals("X") && L9.equals("X")) || (L1.equals("X") && L5.equals("X") && L9.equals("X")) || (L7.equals("X") && L5.equals("X") && L3.equals("X"))){
        System.out.println("O jogador representado por Xis, ganhou!");
        para = 1;
        break;
        
    }
        
        
        }
     if (para == 0){
     if (!(((L1.equals("X") && L2.equals("X") && L3.equals("X")) || (L4.equals("X") && L5.equals("X") && L6.equals("X")) || (L7.equals("X") && L8.equals("X") && L9.equals("X")) || (L1.equals("X") && L4.equals("X") && L7.equals("X")) || (L2.equals("X") && L5.equals("X") && L8.equals("X")) || (L3.equals("X") && L6.equals("X") && L9.equals("X")) || (L1.equals("X") && L5.equals("X") && L9.equals("X")) || (L7.equals("X") && L5.equals("X") && L3.equals("X"))) && ((L1.equals("O") && L2.equals("O") && L3.equals("O")) || (L4.equals("O") && L5.equals("O") && L6.equals("O")) || (L7.equals("O") && L8.equals("O") && L9.equals("O")) || (L1.equals("O") && L4.equals("O") && L7.equals("O")) || (L2.equals("O") && L5.equals("O") && L8.equals("O")) || (L3.equals("O") && L6.equals("O") && L9.equals("O")) || (L1.equals("O") && L5.equals("O") && L9.equals("O")) || (L7.equals("O") && L5.equals("O") && L3.equals("O"))))){
        
        System.out.println("Empate! DEU VELHA!");
     }
    }
    }
    }
    


