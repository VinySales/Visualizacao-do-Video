/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author vinys
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("HTML");
        v[1] = new Video("PHP");
        v[2] = new Video("JAVA");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Viny", 21, 'm');
        g[1] = new Gafanhoto("Jéssica", 22, 'f');
        
        Visualizacao visu[] = new Visualizacao[1];
        visu[0]  = new Visualizacao(g[0], v[1]);
        System.out.println(visu[0].toString());
    }
    
}
