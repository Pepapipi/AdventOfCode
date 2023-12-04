<?php

    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_6\input.txt';
    $handle = fopen($filePath, 'r');
    $line = fgets($handle);

    for($i =0;$i<strlen($line)-13;$i++)
    {
        $chaine = substr($line, $i, 14);
        $count = 0;
        foreach(str_split($chaine) as $mot){
            $count += substr_count($chaine,$mot);
        }
        if($count == 14)
        {
            echo $i+14;
            break;
        }
        
    }
    
?>