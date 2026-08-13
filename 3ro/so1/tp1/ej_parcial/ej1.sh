#!/bin/bash
FILE=$1
tr -d '[:punct:]' <  "$FILE" | tr -d '[:digit:]' | tr -s '[:blank:]' '\n' | tr -s '[:upper:]' '[:lower:]' | sort | uniq -c | sort -nr > archivo.tmp
MAX=$( { read cant pal; echo "$cant"; } < archivo.tmp)
#read cant pal < archivo.tmp | echo "$cant " "$pal"
while read -r cant pal; do
  echo "TF($pal) =  $cant/$MAX = 0.$(($cant*100/$MAX))"
done < archivo.tmp
