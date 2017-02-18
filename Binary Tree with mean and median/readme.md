# Augmented-Binary-Tree
Implementation in Java
Store "size" and "sum" of each node

Computer mean and median after every insert or delete operation in O(log n) time.
#Input :
//inserting the tree nodes one by one
T.Insert(3);

T.Insert(8);

T.Insert(1);

T.Insert(4);

T.Insert(6);

T.Insert(2);

T.Insert(10);

T.Insert(9);

T.Insert(20);

T.Insert(25);

T.Insert(15);

T.Insert(16);

//deleting a few nodes and checking the in-order traversal
T.deletekey(25);

T.inOrderTraversal(T.root);

T.deletekey(10);

T.inOrderTraversal(T.root);

T.deletekey(3);

T.inOrderTraversal(T.root);


#Output:

Inserting key: 3<br>
Mean: 3.0,Median:3.0<br>
Inserting key: 8<br>
Mean: 5.5,Median:5.5<br>
Inserting key: 1<br>
Mean: 4.0,Median:3.0<br>
Inserting key: 4<br>
Mean: 4.0,Median:3.5<br>
Inserting key: 6<br>
Mean: 4.4,Median:4.0<br>
Inserting key: 2<br>
Mean: 4.0,Median:3.5<br>
Inserting key: 10<br>
Mean: 4.857142857142857,Median:4.0<br>
Inserting key: 9<br>
Mean: 5.375,Median:5.0<br>
Inserting key: 20<br>
Mean: 7.0,Median:6.0<br>
Inserting key: 25<br>
Mean: 8.8,Median:7.0<br>
Inserting key: 15<br>
Mean: 9.363636363636363,Median:8.0<br>
Inserting key: 16<br>
Mean: 9.916666666666666,Median:8.5<br>

Inorder Traversal:element(node-size): <br>
1(size=2,sum=3),<br>
2(size=1,sum=2),<br>
3(size=12,sum=119),<br>
4(size=2,sum=10),<br>
6(size=1,sum=6),<br>
8(size=9,sum=113),<br>
9(size=1,sum=9),<br>
10(size=6,sum=95),<br>
15(size=2,sum=31),<br>
16(size=1,sum=16),<br>
20(size=4,sum=76),<br>
25(size=1,sum=25),<br>
<br>


* DELETION *
After deleting node with data=25<br>
#Mean: 8.545454545454545,Median:8.0<br>

Inorder Traversal:element(node-size): <br>
1(size=2,sum=3),<br>
2(size=1,sum=2),<br>
3(size=11,sum=94),<br>
4(size=2,sum=10),<br>
6(size=1,sum=6),<br>
8(size=8,sum=88),<br>
9(size=1,sum=9),<br>
10(size=5,sum=70),<br>
15(size=2,sum=31),<br>
16(size=1,sum=16),<br>
20(size=3,sum=51),<br>
#Mean: 8.545454545454545,Median:8.0<br>
<br>


* DELETION *
After deleting node with data=10<br>
<br>
Inorder Traversal:element(node-size):<br> 
1(size=2,sum=3),<br>
2(size=1,sum=2),<br>
3(size=10,sum=84),<br>
4(size=2,sum=10),<br>
6(size=1,sum=6),<br>
8(size=7,sum=78),<br>
9(size=1,sum=9),<br>
15(size=4,sum=60),<br>
16(size=1,sum=16),<br>
20(size=2,sum=36),<br>
#Mean: 8.4,Median:7.0<br>
<br>


* DELETION *
After deleting node with data=3<br>
<br>
Inorder Traversal:element(node-size):<br> 
1(size=2,sum=3),<br>
2(size=1,sum=2),<br>
4(size=9,sum=81),<br>
6(size=1,sum=6),<br>
8(size=6,sum=74),<br>
9(size=1,sum=9),<br>
15(size=4,sum=60),<br>
16(size=1,sum=16),<br>
20(size=2,sum=36),<br>
#Mean: 9.0,Median:8.0<br>
