package Jour6;
import java.io.*;
import java.util.*;

public class partie2 {
    
    public static void main(String[] args) throws IOException
    {
        List <Integer> suiteDeChiffres = new ArrayList<>();
        List <Integer> suiteDeChiffres2 = new ArrayList<>();
        List <Integer> suiteDeChiffres3 = new ArrayList<>();
        List <Integer> suiteDeChiffres4 = new ArrayList<>();
        List <Integer> suiteDeChiffres5 = new ArrayList<>();
        List <Integer> suiteDeChiffres6 = new ArrayList<>();
        List <Integer> suiteDeChiffres7 = new ArrayList<>();
        File fichier = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour6\\input.txt");
		BufferedReader buff = new BufferedReader(new FileReader(fichier));
        String[] ligne = buff.readLine().split(",");

        for(String n : ligne)
        {
            int chiffre = Integer.parseInt(n);
            suiteDeChiffres.add(chiffre);
        }

        //On s'occupe de la première liste
        for (int i=0; i<80; i++)
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
                if (!(i==79))
                {
                    suiteDeChiffres.add(8);
                }
                else
                {
                    suiteDeChiffres2.add(8);
                }
                
            }
        }
    /* ---------------------------------------------------------------------------------------------
    -------------------------------------------------------------------------------------------------
    ------------------------------------------------------------------------------------------------*/
    //On s'occupe de la deuxième + première liste
    for (int i=80; i<160; i++)
    {
        //On refait ce qu'on a fait à la première liste
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

        
        // On parcourt la deuxième liste
        for (int yy=0 ; yy<suiteDeChiffres2.size() ; yy++)
        {
            if (!(suiteDeChiffres2.get(yy) == 0))
            {
                suiteDeChiffres2.set(yy, suiteDeChiffres2.get(yy)-1);
            }
            else
            {
            suiteDeChiffres2.set(yy, 6);
            nbrAAjouter++;
            }
        }

        //Mais on ajoute les nouvelles valeurs dans un autre liste
        for(int a=0; a<nbrAAjouter; a++)
        {
            if (!(i==159))
            {
                suiteDeChiffres2.add(8);
            }
            else
            {
                suiteDeChiffres3.add(8);
            }
        }
    }
    /*------------------------------------------------------------------------------------------
    ----------------------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------------------*/

    //On s'occupe de la troisième + deuxième + première liste
    for (int i=160; i<162; i++)
    {
    //On refait ce qu'on a fait à la première liste
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

    
    // On parcourt la deuxième liste
    for (int yy=0 ; yy<suiteDeChiffres2.size() ; yy++)
    {
        if (!(suiteDeChiffres2.get(yy) == 0))
        {
            suiteDeChiffres2.set(yy, suiteDeChiffres2.get(yy)-1);
        }
        else
        {
            suiteDeChiffres2.set(yy, 6);
            nbrAAjouter++;
        }
    }

    // On parcourt la troisième liste
    for (int yyy=0 ; yyy<suiteDeChiffres3.size() ; yyy++)
    {
        if (!(suiteDeChiffres3.get(yyy) == 0))
        {
            suiteDeChiffres3.set(yyy, suiteDeChiffres3.get(yyy)-1);
        }
        else
        {
            suiteDeChiffres3.set(yyy, 6);
            nbrAAjouter++;
        }
    }

    //Mais on ajoute les nouvelles valeurs dans un autre liste
    for(int a=0; a<nbrAAjouter; a++)
    {
        if (!(i==161))
        {
            suiteDeChiffres3.add(8);
        }
        else
        {
            //suiteDeChiffres4.add(8);
        }
        
    }
        
        /*
        //On s'occupe de la quatrième + troisième + deuxième + première liste
        for (int i=230; i<256; i++)
        {
        //On refait ce qu'on a fait à la première liste
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

        
        // On parcourt la deuxième liste
        for (int yy=0 ; yy<suiteDeChiffres2.size() ; yy++)
        {
            if (!(suiteDeChiffres2.get(yy) == 0))
            {
                suiteDeChiffres2.set(yy, suiteDeChiffres2.get(yy)-1);
            }
            else
            {
                suiteDeChiffres2.set(yy, 6);
                nbrAAjouter++;
            }
        }

        // On parcourt la troisième liste
        for (int yyy=0 ; yyy<suiteDeChiffres3.size() ; yyy++)
        {
            if (!(suiteDeChiffres3.get(yyy) == 0))
            {
                suiteDeChiffres3.set(yyy, suiteDeChiffres3.get(yyy)-1);
            }
            else
            {
                suiteDeChiffres3.set(yyy, 6);
                nbrAAjouter++;
            }
        }

        // On parcourt la quatrieme liste
        for (int yyyy=0 ; yyyy<suiteDeChiffres3.size() ; yyyy++)
        {
            if (!(suiteDeChiffres4.get(yyyy) == 0))
            {
                suiteDeChiffres4.set(yyyy, suiteDeChiffres3.get(yyyy)-1);
            }
            else
            {
                suiteDeChiffres4.set(yyyy, 6);
                nbrAAjouter++;
            }
        }

        //Mais on ajoute les nouvelles valeurs dans un autre liste
        for(int a=0; a<nbrAAjouter; a++)
        {
            suiteDeChiffres4.add(8);
        }*/
        
        System.out.println(suiteDeChiffres.size()+suiteDeChiffres2.size()+suiteDeChiffres3.size());
        buff.close();
    }
}
}

