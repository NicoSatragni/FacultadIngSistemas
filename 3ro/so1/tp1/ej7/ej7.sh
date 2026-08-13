DIR=$1
FILE=$2
T=1;
L=3;

if [ -z "$DIR" ] || [ ! -d "$DIR" ]; then
  echo "Directorio vacio o no es un directorio."
  exit 1
fi
FL=$(find "$DIR" -maxdepth 1 -type f -name "$FILE")
if [ -z "$FL" ] || [ "$(stat -c %s "$FL")" -le "$T" ]; then
  echo "No hay nada para hacer..."
  exit 0
fi

mapfile -t LISTA < <(ls "$DIR"/slot#*"$FILE".gz 2>/dev/null | sort -V)
CANTIDAD=${#LISTA[@]}
if [ "$CANTIDAD" -ge "$L" ]; then
  echo "Eliminando el mas antiguo... ${LISTA[0]}"
  rm "${LISTA[0]}"
fi

if [ "$CANTIDAD" -eq 0 ]; then
  NUEVO_NUM=1;
else
  NUEVO_NUM=$(($(echo "${LISTA[-1]}" | sed -E 's/.*#([0-9]+).*/\1/')+1))
fi
NEW_FILE="slot#$NUEVO_NUM-$FILE.gz"
#NEW_FILE=$(echo "${LISTA[-1]}" | sed -E 's/#([0-9]+/#"$NUEVO_NUM")')
gzip -c "$DIR/$FILE" >  "$DIR/$NEW_FILE"
rm "$FL"
