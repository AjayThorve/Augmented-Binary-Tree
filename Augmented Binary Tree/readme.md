# Augmented-Binary-Tree
Implementation in Java
Store "size" and "sum" of each node<br>
Update 21st feb: added "rank" augmentation<br>
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
Inorder Traversal:element(node-size): 
1(Size=2,Rank=1,sum=3),
2(Size=1,Rank=1,sum=2),
3(Size=12,Rank=3,sum=119),
4(Size=2,Rank=1,sum=10),
6(Size=1,Rank=1,sum=6),
8(Size=9,Rank=3,sum=113),
9(Size=1,Rank=1,sum=9),
10(Size=6,Rank=2,sum=95),
15(Size=2,Rank=1,sum=31),
16(Size=1,Rank=1,sum=16),
20(Size=4,Rank=3,sum=76),
25(Size=1,Rank=1,sum=25),

postOrder Traversal: 2,1,6,4,9,16,15,25,20,10,8,3,
preOrder Traversal: 3,1,2,8,4,6,10,9,20,15,16,25,


* DELETION *
After deleting node with data=25

Inorder Traversal:element(node-size): 
1(Size=2,Rank=1,sum=3),
2(Size=1,Rank=1,sum=2),
3(Size=11,Rank=3,sum=94),
4(Size=2,Rank=1,sum=10),
6(Size=1,Rank=1,sum=6),
8(Size=8,Rank=3,sum=88),
9(Size=1,Rank=1,sum=9),
10(Size=5,Rank=2,sum=70),
15(Size=2,Rank=1,sum=31),
16(Size=1,Rank=1,sum=16),
20(Size=3,Rank=3,sum=51),



* DELETION *
After deleting node with data=10

Inorder Traversal:element(node-size): 
1(Size=2,Rank=1,sum=3),
2(Size=1,Rank=1,sum=2),
3(Size=10,Rank=3,sum=84),
4(Size=2,Rank=1,sum=10),
6(Size=1,Rank=1,sum=6),
8(Size=7,Rank=3,sum=78),
9(Size=1,Rank=1,sum=9),
15(Size=4,Rank=2,sum=60),
16(Size=1,Rank=1,sum=16),
20(Size=2,Rank=3,sum=36),



* DELETION *
After deleting node with data=3

Inorder Traversal:element(node-size): 
1(Size=2,Rank=1,sum=3),
2(Size=1,Rank=1,sum=2),
4(Size=9,Rank=3,sum=81),
6(Size=1,Rank=1,sum=6),
8(Size=6,Rank=3,sum=74),
9(Size=1,Rank=1,sum=9),
15(Size=4,Rank=2,sum=60),
16(Size=1,Rank=1,sum=16),
20(Size=2,Rank=3,sum=36),
