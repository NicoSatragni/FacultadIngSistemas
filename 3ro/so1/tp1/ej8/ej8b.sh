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

  echo "$sangria" $(basename "$dir_actual")

  if [ ! -d "$dir_actual" ]; then
    return
  fi

  for item in "$dir_actual"/*; do
    mostrar_arbol "$item" "$(($nivel+1))"
  done
}

mostrar_arbol "$DIR" 0
