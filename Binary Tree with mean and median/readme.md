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
Mean: 3.0,Median:3.0
Inserting key: 8
Mean: 5.5,Median:5.5
Inserting key: 1
Mean: 4.0,Median:3.0
Inserting key: 4
Mean: 4.0,Median:3.5
Inserting key: 6
Mean: 4.4,Median:4.0
Inserting key: 2
Mean: 4.0,Median:3.5
Inserting key: 10
Mean: 4.857142857142857,Median:4.0
Inserting key: 9
Mean: 5.375,Median:5.0
Inserting key: 20
Mean: 7.0,Median:6.0
Inserting key: 25
Mean: 8.8,Median:7.0
Inserting key: 15
Mean: 9.363636363636363,Median:8.0
Inserting key: 16
Mean: 9.916666666666666,Median:8.5

Inorder Traversal:element(node-size): 
1(size=2,sum=3),
2(size=1,sum=2),
3(size=12,sum=119),
4(size=2,sum=10),
6(size=1,sum=6),
8(size=9,sum=113),
9(size=1,sum=9),
10(size=6,sum=95),
15(size=2,sum=31),
16(size=1,sum=16),
20(size=4,sum=76),
25(size=1,sum=25),



* DELETION *
After deleting node with data=25
Mean: 8.545454545454545,Median:8.0

Inorder Traversal:element(node-size): 
1(size=2,sum=3),
2(size=1,sum=2),
3(size=11,sum=94),
4(size=2,sum=10),
6(size=1,sum=6),
8(size=8,sum=88),
9(size=1,sum=9),
10(size=5,sum=70),
15(size=2,sum=31),
16(size=1,sum=16),
20(size=3,sum=51),
Mean: 8.545454545454545,Median:8.0



* DELETION *
After deleting node with data=10

Inorder Traversal:element(node-size): 
1(size=2,sum=3),
2(size=1,sum=2),
3(size=10,sum=84),
4(size=2,sum=10),
6(size=1,sum=6),
8(size=7,sum=78),
9(size=1,sum=9),
15(size=4,sum=60),
16(size=1,sum=16),
20(size=2,sum=36),
Mean: 8.4,Median:7.0



* DELETION *
After deleting node with data=3

Inorder Traversal:element(node-size): 
1(size=2,sum=3),
2(size=1,sum=2),
4(size=9,sum=81),
6(size=1,sum=6),
8(size=6,sum=74),
9(size=1,sum=9),
15(size=4,sum=60),
16(size=1,sum=16),
20(size=2,sum=36),
Mean: 9.0,Median:8.0
