/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheiros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ftimoteo
 */
class Ficheiro {

    static void criaFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar");
        nome = Ficheiros.ler.nextLine();
        nome = Ficheiros.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    static void verificaFicheiro() {
        
    }

    static void escreveFicheiro() {
        
    }

    static void escreveNovoFicheiro() {
        
    }

    static void leituraFicheiro() {
        
    }

    static void mostraFicheiro() {
        File ficheiro = new File("C:\\Users\\ftimoteo\\Desktop\\Cen\\cenca\\java\\ficheiros\\ficheiros");
        File[] lista = ficheiro.listFiles();
        System.out.println(">>>>>>>Lista de Ficheiros: <<<<<<<");
        for(int x=0;x<lista.length;x++){
            System.out.println(lista[x].getName());
        }
    }
    
}
