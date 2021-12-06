package Jour6;
import java.io.*;
import java.util.*;

public class partie1 {
    
    public static void main(String[] args) throws IOException
    {
        List <Integer> suiteDeChiffres = new ArrayList<>();
        File fichier = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour6\\input.txt");
		BufferedReader buff = new BufferedReader(new FileReader(fichier));
        String[] ligne = buff.readLine().split(",");

        for(String n : ligne)
        {
            int chiffre = Integer.parseInt(n);
            suiteDeChiffres.add(chiffre);
        }
        int somme =0;
        for (int i=0; i<256; i++)
        {
            int nbrAAjouter = 0;
            for (int y=0 ; y<suiteDeChiffres.size() ; y++)
            {
              if (!(suiteDeChiffres.get(y) == 0))
              {
                  suiteDeChiffres.set(y, suiteDeChiffres.get(y)-1);
              }
              else
              {
                suiteDeChiffres.set(y, 6);
                nbrAAjouter++;
              }
            }

            for(int a=0; a<nbrAAjouter; a++)
            {
                suiteDeChiffres.add(8);
            }
        }
        
        System.out.println(suiteDeChiffres.size());
    }
}
