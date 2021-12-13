package Jour9;
import java.io.*;
import java.util.*;

public class partie1 {
    
    public static void main (String[] args) throws IOException
    {
        File doc = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour9\\input.txt");
        Scanner ligne = new Scanner(doc);

        List<Integer> listePrecedente = new ArrayList<>();
        List<Integer> listeActuelle = new ArrayList<>();
        List<Integer> listeFuture = new ArrayList<>();


        String[] chiffrePrecedent = ligne.nextLine().split("");
        for(String c:chiffrePrecedent)
        {
            listeActuelle.add(Integer.parseInt(c));
            
        }
        String[] chiffreAcuel = ligne.nextLine().split("");
        for(String c:chiffreAcuel)
        {
            listeFuture.add(Integer.parseInt(c));
            
        }

        int indexSuperieur =0;
        for (int i = 0 ; i <listeActuelle.size(); i++)
        {
            indexSuperieur++;
            int chiffreApres = listeActuelle.get(indexSuperieur);
            int chiffreActuel = listeActuelle.get(i);
            int chiffreDessous = listeFuture.get(i);

            /* Faire en sorte qu'on ne sorte pas de la liste */
            
            
        }
        

        System.out.println(listeActuelle);
        System.out.println(listeFuture);

        ligne.close();
    }
}
