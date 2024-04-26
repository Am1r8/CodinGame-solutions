ar=()
read n
for ((i=0 ; i < n ; i++ )); do
    read ar[i]
done

ar=($(printf '%s\n' "${ar[@]}" | sort -g))
di=0
md=$(( ${ar[1]} - ${ar[0]} ))
for (( i=2 ; i < n ; i++ )); do
   di=$(( ${ar[$i - 1]} - ${ar[$i]} ))
   if [[ $di -lt 0 ]]; then
      di=$((-$di))
   fi
   if [[ $di -lt $md ]]; then
      md=$di
   fi
done
echo $md