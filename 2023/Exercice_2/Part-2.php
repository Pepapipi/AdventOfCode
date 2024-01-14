<?php
    $filePath = '/Users/doriannunez/Documents/AdventOfCode/2023/Exercice_2/input.txt';
    $handle = fopen($filePath, 'r');
    $pattern = '/Game\s+(\d+):/';
    $patternColor = '/(\d+)\s+([a-zA-Z]+)/';
    $sum = 0;
    while(! feof($handle))  {
        $line = fgets($handle);
        $array["blue"] = null;
        $array["green"] = null;
        $array["red"] = null;
        preg_match_all($patternColor, $line, $matches);
        
        foreach($matches[1] as $k=>$number)
        {
            $val = intval($number);
            if(empty($array[$matches[2][$k]]) || $val > $array[$matches[2][$k]])
            {
                $array[$matches[2][$k]] = $val;
            }
        }
        if(empty($array["blue"]) || empty($array["green"]) || empty($array["red"])  )
        {
            continue;
        }
     
        $sum += $array["blue"] * $array["green"] * $array["red"] ;
    }
    echo $sum;
?>