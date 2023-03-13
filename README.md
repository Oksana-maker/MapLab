# MapLab
Map and TreeSat
Создайте проект MapLab с классом MapSetTester и статическим методом main(). Вам нужно будет использовать классы HashMap и TreeSet

В методе main() создайте словарь HashMap с именем networkMap, в котором будут храниться данные в виде пары ключ и значение. Ключ - имя телеканала (строка), а значение - это множество типа TreeSet, который содержит телевизионные шоу для этого телеканала - тоже строки):

   Map <______, ______> networkMap = new HashMap<>();
ПРИМЕЧАНИЕ: замените символы нижнего подчеркивания нужными классами

В цикле запросите у пользователя название телешоу, а затем запросите пользователя ввести имя телевизионного канала для этого шоу. После того, как у вас появятся исходные данные, найдите канал в словаре networkMap.

Если канал еще не добавлен в словарь, то создайте множество TreeSet в которое добавьте название телешоу, а затем ключ к паре значений (канал, с заданным телевизионным шоу) в словарь.

Если канал находится в словаре, добавьте телешоу к множеству TreeSet этого телеканала.

Таким образом введите не менее 10 телевизионных шоу. После обновления словаря выведите его содержимое.

Пример вывода (обратите внимание, что сети не расположены в алфавитном порядке, но телевизионные шоу для каждого канала выводятся по алфавиту. Как вы думаете почему?):

   Input tv network: FOX
   Input tv show on FOX: The Simpsons
   {FOX=[The Simpsons]}

   Input tv network: NBC
   Input tv show on NBC: ER
   {FOX=[The Simpsons], NBC=[ER]}

   Input tv network: ABC
   Input tv show on ABC: 20/20
   {FOX=[The Simpsons], NBC=[ER], ABC=[20/20]}

   Input tv network: CBS
   Input tv show on CBS: Survivor
   {CBS=[Survivor], FOX=[The Simpsons], NBC=[ER], ABC=[20/20]}

   Input tv network: ABC
   Input tv show on ABC: Lost
   {CBS=[Survivor], FOX=[The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: FOX
   Input tv show on FOX: Family Guy
   {CBS=[Survivor], FOX=[Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: CBS
   Input tv show on CBS: CSI
   {CBS=[CSI, Survivor], FOX=[Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: FOX
   Input tv show on FOX: American Idol
   {CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: ABC
   Input tv show on ABC: Desperate Housewives
   {CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Desperate Housewives, Lost]}

   Input tv network: NBC
   Input tv show on NBC: Law And Order
   {CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER, Law And Order], ABC=[20/20, Desperate Housewives, Lost]}
Если у вас есть словарь с каналами, выведите содержимое словаря в алфавитном порядке каналов, по одному каналу в каждой строке.

Создайте массив содержащий ключи (названия каналов) словаря networkMap.

Отсортируйте полученный массив каналов по алфавиту.

Переберите элементы массива ключей, что бы получить соответствующее значение (наборы ТВ-шоу) для каждого ключа из словаря и распечатать их.

Примечание: Вам не придется сортировать ТВ-шоу для канала, так как они уже будут отсортированы. Как вы думаете почему?
