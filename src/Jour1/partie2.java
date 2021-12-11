package Jour1;
import java.io.*;
import java.util.*;

public class partie2 {

    public static void main(String[] args) throws IOException 
    {
        List<Integer>list = new ArrayList<>();
		//On ouvre le fichier
		File doc =new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour1\\input.txt");
        Scanner ligne = new Scanner(doc);
        while (ligne.hasNextInt())
        {
            list.add(ligne.nextInt());
        }
        int somme = 0;
        int premiereValeur = 0;
        int secondeValeur =0;
        for (int i=3; i<list.size() ; i++)
        {
            premiereValeur = list.get(i-3)+list.get(i-2)+list.get(i-1);
            secondeValeur = list.get(i-2)+list.get(i-1)+list.get(i);

            if(premiereValeur<secondeValeur)
            {
                somme ++;
            }
        }
        ligne.close();
        System.out.println(somme);
    }
}
