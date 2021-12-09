package Jour6;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
public class partie2 {
    
    public static void main(String[] args) throws IOException
    {
        for (int i=0; i < 256; i++)
        {
            Path chemin = Paths.get("F:\\Desktop\\AdventOfCode\\src\\Jour6\\input.txt");
            InputStream input = null;
            input = Files.newInputStream(chemin);
            
            BufferedReader buff = new BufferedReader(new InputStreamReader(input));
            
            //On récupère la ligne
            String ligne = buff.readLine();
             
            // Ecrire dans le fichier
            int nbrAAjouter = 0;
            char temp;
            for (int y=0 ; y<ligne.length() ; y++)
            {
                temp = ligne.charAt(y);
                if (temp == '0')
                {
                nbrAAjouter++;
                }
                
            }
            String newLigne;

            if (ligne.contains("0"))
            {
                 newLigne = ligne.replace("0", "a").replace("1","0").replace("2", "1").replace("3", "2").replace("4","3" ).replace("5","4").replace("6","5").replace("7","6").replace("8","7").replace("a", "6");
            }

            else
            {
                newLigne = ligne.replace("1","0").replace("2", "1").replace("3", "2").replace("4","3" ).replace("5","4").replace("6","5").replace("7","6").replace("8","7");
            
            }
            
             //On remplace remplace l'ancienne ligne par la nouvelle
             BufferedOutputStream output;
             byte[] data = newLigne.getBytes();
             output = new BufferedOutputStream(Files.newOutputStream(chemin, WRITE));

             output.write(data);

             // vider le tampon
             output.flush();

             // fermer le fichier
             output.close();
        
            //Ajoute les nouveaux poissons
            for(int a=0; a<nbrAAjouter; a++)
            {
                
                BufferedOutputStream outputt;
                String o = ",8";
                byte[] datat = o.getBytes();
                outputt = new BufferedOutputStream(Files.newOutputStream(chemin, WRITE,APPEND));
                // Ecrire dans le fichier
                outputt.write(datat);
 
                // vider le tampon
                outputt.flush();
 
                // fermer le fichier
                outputt.close();
                
            }
            //System.out.println(suiteDeChiffres.size());
            input.close();
            buff.close();

        }
        Path chemin = Paths.get("F:\\Desktop\\AdventOfCode\\src\\Jour6\\input2.txt");
            InputStream input = null;
            input = Files.newInputStream(chemin);
            
            BufferedReader buff = new BufferedReader(new InputStreamReader(input));
            
            //On récupère la ligne
            String ligne = buff.readLine();
            System.out.println((ligne.length()+1)/2);
        
 
    } 
}
