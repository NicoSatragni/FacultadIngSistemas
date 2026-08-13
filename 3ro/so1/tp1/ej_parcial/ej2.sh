NUM=$1
FILE=res_fib.txt
touch "$FILE"

retornar_fib() {
  local num=$1
  local r=$2

  if [ "$num" -le 0 ]; then
    echo 0
    return
  fi
  if [ "$num" -eq 1 ]; then
    echo 1
    return
  fi
  
  if [ -s "$FILE" ]; then
    local res=$(grep "^$num " "$FILE" 2>/dev/null)
    if [ -n "$res" ]; then
      echo $res | cut -d' ' -f 2
      return
    fi
  fi
  
 local  res=$(calcular_fib "$num")
 echo "$res"
}

calcular_fib() {
  local N=$1
  local N1=$(retornar_fib "$(($N - 1))")
  local N2=$(retornar_fib "$(($N - 2))")
  local RES=$((N1+N2))
  echo "$N $RES" >> "$FILE"
  sort -nu "$FILE" -o "$FILE"
  echo "$RES"
  return
}

retornar_fib "$NUM"
