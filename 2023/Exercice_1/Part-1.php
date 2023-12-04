<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2023\Exercice_1\input.txt';
    $handle = fopen($filePath, 'r');
    $sum = 0;
    while(! feof($handle))  {
        $result = fgets($handle);
        $line = str_split($result);
        $firstNumber = '';
        $lastNumber = '';
        foreach($line as $caractere)
        {
            if(!intval($caractere)) continue;

            if($firstNumber == ''){
                $firstNumber = $caractere;
            }

            $lastNumber = $caractere;
        }

        if($firstNumber != '' && $lastNumber != '')
        {
            $sum += intval($firstNumber.$lastNumber);
        }

    }
    echo $sum;
?>