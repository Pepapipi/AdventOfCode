<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_3\input.txt';
    $handle = fopen($filePath, 'r');
    
    $array = [];
    $ascii_value = 1;  // La valeur initiale pour 'a'
    
    // Ajoute les lettres minuscules
    for ($i = 97; $i <= 122; $i++) {
        $array[chr($i)] = $ascii_value;
        $ascii_value++;
    }
    
    // Réinitialise la valeur pour 'A'
    $ascii_value = 27;
    
    // Ajoute les lettres majuscules
    for ($i = 65; $i <= 90; $i++) {
        $array[chr($i)] = $ascii_value;
        $ascii_value++;
    }
    $sum = 0;
    
    while(! feof($handle))  {
        $result1 = str_split(fgets($handle));
        $result2 = str_split(fgets($handle));
        $result3 =   str_split(fgets($handle));      
        $compR1etR2 =  array_intersect($result1, $result2);
        $caractere = array_intersect($result3, $compR1etR2);

        
        foreach($caractere as $c)
        {
            $sum += $array[$c];
            break;
        }

    }
    echo $sum;
    fclose($handle);
?>