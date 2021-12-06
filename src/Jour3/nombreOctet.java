package Jour3;
import java.io.*;
import java.util.*;

public class nombreOctet
{	
	public static void main(String[] args) throws IOException 
	{
		List<String> list = new ArrayList<>();

		//On ouvre le fichier
		File fichier = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\input.txt");
		BufferedReader buff = new BufferedReader(new FileReader(fichier));
		String ligne;
		
		ligne = buff.readLine();

		while(ligne !=null)
		{
			list.add(ligne);
			ligne = buff.readLine();
		}
		
		int[] gamma = new int[12];
		int[] epsi = new int[12];

		//On lit tout le contenu du fichier
		for(int i=0;i<12;i++)
		{
			int nombreDe1 = 0;
			int nombreDe0 = 0;

			for(String lo:list) {
				char[] digits1 = lo.toCharArray();
				if(digits1[i] == '1')
				{
					nombreDe1++;
				}
				else
				{
					nombreDe0++;
				}
			}
	
			if (nombreDe0 >= nombreDe1)
			{
				gamma[i]=0;
				epsi[i]=1;
			}

			else
			{
				gamma[i]=1;
				epsi[i]=0;
			}
			
		}

		int resultatGamma, resultatEpsi;
		resultatGamma = ConvertiBinaireEnDecimale(gamma,12);
		System.out.println("------------------------");
		resultatEpsi = ConvertiBinaireEnDecimale(epsi, 12);

		System.out.println(resultatGamma*resultatEpsi);
		buff.close();

	}


	static int ConvertiBinaireEnDecimale(int[] o, int nbChar)
	{
		int somme = 0;
		int i=nbChar-1;
		
		for(int element:o)
		{
			somme += (int) (element * Math.pow(2,i));
			i--;

			System.out.println(somme + "  "+element);
		}
		return somme;

	}

}
