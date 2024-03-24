In this study, we see the use of arrayList and linketList and their comparison in terms of performance. 
I observed that ArrayList is ahead in terms of performance when adding elements sequentially, and LinkedList is ahead in terms of performance when adding elements in the desired index.

In this case, since changes or additions are made to the list with the index, for example, LinkedList is ahead in a shorter time.
(...)
for (int i = 0 ; i< 100000 ; i++) {
             list.add(0,i);
         }
(...)
output:
LinkedList insertion time 10 ms
ArrayList insertion time 1129 ms

-----------------------------------------------------------------------------------

In the other case, ArrayList performed this operation in a shorter time by far because the elements were added sequentially and indext was not specified.
(...)
for (int i = 0 ; i< 100000 ; i++) {
             list.add(i);
         }
(...)
output:
LinkedList insertion time 184 ms
ArrayList insertion time 46 ms
