package Jour3;
import java.io.*;
import java.util.*;

public class oxygen
{	
	public static void main(String[] args) throws IOException 
	{
		List<String> list = new ArrayList<>();
        List<String> listOxygen = new ArrayList<>();
        List<String> listCO2 = new ArrayList<>();

		List<String> listO = new ArrayList<>();
        List<String> listOxygenO = new ArrayList<>();
        List<String> listCO2O = new ArrayList<>();

		//On ouvre le fichier
		File fichier = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\input.txt");
		BufferedReader buff = new BufferedReader(new FileReader(fichier));
		String ligne;
		
		ligne = buff.readLine();

		while(ligne !=null)
		{
			listO.add(ligne);
			list.add(ligne);
			ligne = buff.readLine();
		}
		//On lit tout le contenu du fichier
		for(int i=0;i<12;i++)
		{
			listOxygen.clear();
            listCO2.clear();
			listOxygenO.clear();
            listCO2O.clear();
            //Pour toute les valeurs dans la liste
			for(String lo:list) {
				char[] digits1 = lo.toCharArray();
				if(digits1[i] == '1')
				{
                    listOxygen.add(lo);
				}
				else
				{
                    listCO2.add(lo);
				}
			}

			for(String lo:listO) {
				char[] digits1 = lo.toCharArray();
				if(digits1[i] == '1')
				{
					listOxygenO.add(lo);
				}
				else
				{
					listCO2O.add(lo);
				}
			}	
            list.clear();
			

            if(listOxygen.size()>=listCO2.size())
            {
                for(String il:listOxygen)
                {
                    list.add(il);
                } 
            }
            else
            {
                for(String il:listCO2)
                {
                    list.add(il);
                } 
            }

			if(listO.size() != 1)
			{
			listO.clear();
			if(listOxygenO.size()<listCO2O.size())
            {
                for(String il:listOxygenO)
                {
                    listO.add(il);	
                } 
            }
            else
            {
                for(String il:listCO2O)
                {
                    listO.add(il);
                } 	
			}
			}
			System.out.println(listO);
	}
		String binaireOxygen = list.get(0);
		String binaireCO2 = listO.get(0);

		int decimalOxygen, decimalCO2;
		decimalOxygen = Integer.parseInt(binaireOxygen, 2);
		decimalCO2 = Integer.parseInt(binaireCO2, 2);
		System.out.println(binaireOxygen+" "+decimalOxygen);
		System.out.println(binaireCO2+" "+decimalCO2);
		System.out.println(decimalCO2*decimalOxygen);
		buff.close();
		
	}
}