#!/bin/bash
DIR=$1
if [ -z "$DIR" ] || [ ! -d "$DIR" ]; then
  exit 1
fi

mostrar_arbol() {
  local dir_actual=$1
  local nivel=$2
  local sangria="* "
  for ((i=0;i<nivel;i++)); do
    sangria=" $sangria"
  done
  
  for item in "$dir_actual"/*; do
        if [ -d "$item" ]; then
          echo "${sangria}$(basename $item)"
          mostrar_arbol "$item" "$((nivel+1))"
    fi
  done
}
mostrar_arbol "$DIR" 0
