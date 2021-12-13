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

        int y =0;
        for (int i = 1 ; i <listeActuelle.size(); i++)
        {
            
            int chiffreActuel = listeActuelle.get(i);
            int chiffreAvant = listeActuelle.get(y++);
            
            if(chiffreActuel<chiffreAvant)
            {
                System.out.println(chiffreAvant+" "+chiffreActuel);
            }
        }
        

        System.out.println(listeActuelle);
        System.out.println(listeFuture);

        ligne.close();
    }
}
