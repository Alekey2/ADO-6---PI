import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int t = 0;
        int qt = 4;
        char materia;
        
         do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a Matéria:\nA - Algoritimos e Programação I \nB - Fundamentos de Administração \nC - Matemática Para TI \nD - Conceitos de Computação \nE - Desenvolvimento de Logíca\n");
        materia = sc.nextLine().charAt(0);
        t++;
            if (t<qt){
                System.out.println("\nTentativa Número: "+t+"\n");
            }
            else if (t==qt){
            System.out.println("\nResposta incorreta nas 3 tentativas");
            break;
            }
           
    switch(materia){
        
        case 'A':
            System.out.println("\nResposta Incorreta\n");
            break;
      
        case 'B':
              System.out.println("\nResposta Incorreta\n");
              break;
      
        case 'C':
            System.out.println("\nResposta Incorreta\n");
            break;
            
        case 'D':
            System.out.println("\nResposta Incorreta\n");
            break;
        
        case 'E':
            System.out.println("\nResposta Correta\n");
            break;
        
    }
  
    }while(t>qt || materia != 'E');
      
         
         }
 }
