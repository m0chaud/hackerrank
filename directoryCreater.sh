#k=4

#mkdir -p echo "30days/day$k/"

#cp -R 30days/day3/ 30days/day$k/

#'cp -R 30days/day3/ 30days/day4/'

for (( i=4; i <= 29; i++ ))
do

mkdir -p echo "30days/day$i/"

cp -R 30days/day3/ 30days/day$i/

done

