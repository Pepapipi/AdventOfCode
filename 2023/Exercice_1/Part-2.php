<?php
    $filePath = "/Users/doriannunez/Documents/AdventOfCode/2023/Exercice_1/input.txt";
    $handle = fopen($filePath, 'r');
    $sum = 0;
    $digits = [
        "one" => '1',
        "two" => '2',
        "three" => '3',
        "four" => '4',
        "five" => '5',
        "six" => '6',
        "seven" => '7',
        "eight" => '8',
        "nine" => '9',
    ];
    $spelledNumbers = ['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    $reversedSpelledNumbers = array_map(fn($num) => strrev($num), $spelledNumbers);
    $forwardRe = '/([0-9]|' . implode('|', $spelledNumbers) . ')/m';
    $backwardRe = '/([0-9]|' . implode('|', $reversedSpelledNumbers) . ')/m';
    
    while(! feof($handle))  {
        $result = fgets($handle);
        
        preg_match($forwardRe, $result, $matches);
        $firstNumber= $matches[0]; 
        if(!intval($firstNumber)) $firstNumber = $digits[$firstNumber];
    
        preg_match($backwardRe, strrev($result), $matches);
        $lastNumber = strrev($matches[0]);
        if(!intval($lastNumber)) $lastNumber = $digits[$lastNumber];

        
        $sum +=intval($firstNumber.$lastNumber);
        
    }
    echo $sum;
?>