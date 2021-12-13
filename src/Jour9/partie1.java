package Jour9;
import java.io.*;
import java.util.*;

public class partie1 {
    
    public static void main (String[] args) throws IOException
    {
        File doc = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour9\\input.txt");
        Scanner ligne = new Scanner(doc);

        List<Integer> liste = new ArrayList<>();
        List<Integer> nombreInf = new ArrayList<>();
        while(ligne.hasNextLine())
        {
            String[] chiffre = ligne.nextLine().split("");
            for (String c:chiffre)
            {
                liste.add(Integer.parseInt(c));
            }
        }
        //Parcous de la liste
        for (int l=0; l<liste.size();l++)
        {
            int chiffreActuel = liste.get(l);
            
            //Parcours de la première ligne
            if(l < 100)
            {
                int chiffreApres = liste.get(l+1);
                int chiffreDessous = liste.get(l+100);
                //Parcours de tout les chiffres sauf le premier et le dernier de la ligne
                if (l>0 && l<100)
                {
                    int chiffrePrecedent = liste.get(l-1);
                    //Si le chiffre actuel est inférieur aux chiffres autours
                    if (chiffreActuel<chiffreApres && chiffreActuel<chiffrePrecedent && chiffreActuel<chiffreDessous)
                    {
                        nombreInf.add(chiffreActuel);
                    }
                }
                //Parcours du premier chiffre ou dernier chiffre de la première ligne
                else
                {
                    //Si c'est le premier chiffre de la première ligne
                    if (l==0)
                    {
                        if (chiffreActuel<chiffreApres && l<chiffreDessous)
                        {
                            nombreInf.add(chiffreActuel);
                        }
                    }
                    else
                    {
                        int chiffrePrecedent = liste.get(l-1);
                        if (chiffreActuel<chiffreDessous && chiffreActuel<chiffrePrecedent)
                        {
                            nombreInf.add(chiffreActuel);
                        }
                    }
                }
            }
            //Parcours du reste de la liste
            else
            {
                int chiffreDessus = liste.get(l-100);
                int chiffrePrecedent = liste.get(l-1);
                //Parcours de la dernière ligne
                if (l>=liste.size()-100)
                {
                    //Si le chiffre n'est pas aux extrémités
                    if (l>liste.size()-100 && l<liste.size()-1)
                    {
                        int chiffreApres = liste.get(l+1);
                        //Si le chiffre actuel est inférieur aux chiffres autours
                        if (chiffreActuel<chiffreApres && chiffreActuel<chiffrePrecedent && chiffreActuel<chiffreDessus)
                        {
                            nombreInf.add(chiffreActuel);
                        }
                    }
                    //Si le chiffre est à l'une des extrémités
                    else
                    {
                        //Si le chiffre est à l'extrémité droite
                        if (l==liste.size())
                        {
                            int chiffreApres = liste.get(l+1);
                            if (chiffreActuel<chiffreApres && l<chiffreDessus)
                            {
                                nombreInf.add(chiffreActuel);
                            }
                        }
                        //Si le chiffre est à l'extrémité gauche
                        else
                        {
                            if (chiffreActuel<chiffreDessus && chiffreActuel<chiffrePrecedent)
                            {
                                nombreInf.add(chiffreActuel);
                            }
                        }
                    }

                }
                //Parcours classique du reste de la liste
                else
                {
                    int chiffreApres = liste.get(l+1);
                    int chiffreDessous = liste.get(l+100);
                    if(l%100 == 0 || (l+1)%100 == 0)
                    {
                        if (l%100 == 0)
                        {
                            
                            if(chiffreActuel<chiffreDessus && chiffreActuel<chiffreApres && chiffreActuel<chiffreDessous)
                            {
                                nombreInf.add(chiffreActuel);
                            }
                        }
                        else
                        {
                            
                            if(chiffreActuel<chiffreDessus && chiffreActuel<chiffrePrecedent && chiffreActuel<chiffreDessous)
                            {
                                nombreInf.add(chiffreActuel);
                            }
                        }
                    }
                    else
                    {
                        if(chiffreActuel<chiffreDessus && chiffreActuel<chiffreApres && chiffreActuel<chiffreDessous && chiffreActuel<chiffrePrecedent)
                            {
                                nombreInf.add(chiffreActuel);
                            }
                    }
                }
            }
        }
        
        int somme=0;
        for(int n:nombreInf)
        {
            somme+= n+1;
        }
        System.out.println(somme);
        ligne.close();
    }

}
