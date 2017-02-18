# Augmented-Binary-Tree
Implementation in Java
Store "size" and "sum" of each node
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


postOrder Traversal: 2,1,6,4,9,16,15,25,20,10,8,3,

preOrder Traversal: 3,1,2,8,4,6,10,9,20,15,16,25,

* DELETION *
After deleting node with data=25

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
