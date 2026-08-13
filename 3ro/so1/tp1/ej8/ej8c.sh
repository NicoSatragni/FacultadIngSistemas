#/!bin/bash
DIR=$1
NIVEL_MAX=$2
if [ -z "$DIR" ] || [ !-d "$DIR" ]; then
    echo "Uso: $0 <directorio> [nivel_maximo]"
    exit 1
fi

imprimir_arbol() {
    local dir_actual="$1"
    local nivel=$2

    if [ ! -d "$dir_actual" ] || [ $nivel -gt $NIVEL_MAX ]; then
        return;
    fi
        
    local sangria=" *"

    for((i=0;i<nivel;i++)); do
        sangria=" $sangria"
    done

    for item in "$dir_actual"/*; do
        echo "$sangria $(basename "$item")"
        if [ "$nivel" -lt "$NIVEL_MAX" ]; then
            imprimir_arbol "$item" "$((nivel+1))"
        fi
    done
}
imprimir_arbol "$DIR" 0
