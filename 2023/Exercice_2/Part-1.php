<?php
    $filePath = '/Users/doriannunez/Documents/AdventOfCode/2023/Exercice_2/input.txt';
    $handle = fopen($filePath, 'r');
    $pattern = '/Game\s+(\d+):/';
    $patternColor = '/(\d+)\s+([a-zA-Z]+)/';
    $sum = 0;
    while(! feof($handle))  {
        $line = fgets($handle);
        $pass = true;
        preg_match_all($patternColor, $line, $matches);
        
        foreach($matches[1] as $k=>$number)
        {
           
            if(($matches[2][$k] === "green" && intval($number) > 13 )|| ($matches[2][$k] === "blue" && intval($number) > 14 )||($matches[2][$k] === "red" && intval($number) > 12 ))
            {
                $pass = false;
                break;
            }
        }
        if($pass === false)
        {
            continue;
        }
    
        preg_match($pattern, $line, $matches);
        $id = $matches[1];
        $sum += intval($id);
    }
    echo $sum;
?>