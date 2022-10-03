
package ficheiros;

import java.util.Scanner;


public class Ficheiros {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("1-Criar Ficheiro");
            System.out.println("2-Verifica se ficheiro existe");
            System.out.println("3-Escrever em ficheiro mantendo dados(existentes)");
            System.out.println("4-Escrever um novo ficheiro");
            System.out.println("5-Ler um ficheiro");
            System.out.println("6- Mostrar lista de ficheiros");
            System.out.println("0-Sair");
            System.out.println("Selecione a opção pretendida");
            op=ler.nextInt();
            switch(op){
                case 1: Ficheiro.criaFicheiro();break;
                case 2: Ficheiro.verificaFicheiro();break;
                case 3: Ficheiro.escreveFicheiro();break;
                case 4: Ficheiro.escreveNovoFicheiro();break;
                case 5: Ficheiro.leituraFicheiro();break;
                case 6: Ficheiro.mostraFicheiro();break;
                case 0: break;
            }
        }while(op!=0);
    }

    
}
