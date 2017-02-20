import tree.node;
import java.util.*;
public class RB_Tree{
    static int sum;
    static Tree T;
    public static void main(String args[]){
        T=new Tree();
        sum=0;
        insert(1);      // inserting A
        insert(12);     // inserting L
		insert(7);      // inserting G
        insert(15);     // inserting O
        insert(18);     // inserting R
        insert(9);      // inserting I
        insert(20);     // inserting T
        insert(8);      // inserting H
		insert(13);     // inserting M
        insert(19);     // inserting S
        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);

 /*       System.out.println("\n\n\n* DELETION *\nAfter deleting node with data=25");
        T.deletekey(25);
        mean_median();

        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);
        mean_median();

        System.out.println("\n\n\n* DELETION *\nAfter deleting node with data=10");
        T.deletekey(10);
        
        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);
        mean_median();

        System.out.println("\n\n\n* DELETION *\nAfter deleting node with data=3");
        T.deletekey(3);
        
        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);
        mean_median();
        */
    }
    static void insert(int key){
            T.Insert(key);
            System.out.println("Inserting key: "+key);
      //      mean_median();
        }
    static void mean_median(){
            double median=0;
            System.out.print("Mean: "+(double)T.root.sum/T.root.size);
            if(T.root.size%2==0){
                median=T.select(T.root,(T.root.size/2))+T.select(T.root,((T.root.size/2)+1));
                median/=2;
            }
            else{
                median=T.select(T.root,((T.root.size+1)/2));
            }
            System.out.println(",Median:"+median);
    }
}


class Tree{
    public static node root;
    final static node nill=new node(-1);
    public Tree(){
     this.root=nill;
    }
   /* public Tree(int data){
        this.root=new node(data);
    }*/


    //Inserting the node in the Red-Black binary tree
    public void Insert(int n){

        node newNode=new node(n);
//newNode.color="R";
        node current=root;
        node y=nill;

        while(current!=nill){               //checking if its not equal to T.nill

            y=current;
            if(n<current.data){
                current=current.left;
            }
            else{
                current=current.right;
            }
        }
        newNode.parent=y;
        if(y==nill){
            root=newNode;
         //   root.parent=nill;
            root.left=nill;
            root.right=nill;
        //    root.color="B";
        }
        else{
             if(newNode.data<y.data){
                    y.left=newNode;
                }
                else{
                    y.right=newNode;
                }
            newNode.left=nill;
            newNode.right=nill;
            newNode.color="R";
            if(newNode.parent!=nill)
                RB_INSERT_FIXUP(newNode);
        }
        
    }

//Fixing up RB-INSERT so that the tree maintains RB-tree rules
public void RB_INSERT_FIXUP(node n){
    node x=n;
    while(x.color=="R" && x.parent.color=="R"){
        n=x;
        if(n.parent==n.parent.parent.right){             // if the inserted element is on the right side
           // node uncle=n.parent.parent.left;
            if(n.parent.parent.left.color=="R")                        //case 1
            {
                n.parent.parent.left.color="B";
                n.parent.color="B";
                n.parent.parent.color="R";
            }
            else{
                if(n==n.parent.left){                   //case 2
                    Right_Rotate(n.parent);
                    n=n.right;
                }
                n.parent.parent.color="R";              //case 3
                n.parent.color="B";                     //case 3
                Left_Rotate(n.parent.parent);           //case 3
            }
        }
        else{                                           //else if the inserted element is on the left side
         //   node uncle=n.parent.parent.right;
            if(n.parent.parent.right.color=="R")                        //case 1
            {
                n.parent.parent.right.color="B";
                n.parent.color="B";
                n.parent.parent.color="R";
            }
            else{
                if(n==n.parent.right){                   //case 2
                    Left_Rotate(n.parent);
                    n=n.left;
                }
                n.parent.parent.color="R";              //case 3
                n.parent.color="B";                     //case 3
                Right_Rotate(n.parent.parent);           //case 3
            }
        }
        if(n.parent.parent.color=="R" && n.parent.parent.parent!=nill)
           x=n.parent.parent;
    }
    root.color="B";
}

public void Left_Rotate(node x){
    node y=x.right;
    x.right=y.left;                 // turn y's left subtree to x's right subtree
    if(y.left!=nill){
        y.left.parent=x;
    }
    y.parent=x.parent;              //link x's parents to y
    if(x.parent==nill){
        root=y;
    }
    else{
        if(x==x.parent.right){
            x.parent.right=y;
        }
        else{
            x.parent.left=y;
        }
    }
    y.left=x;                       //put x on y's left
    x.parent=y;
}

public void Right_Rotate(node x){
    node y=x.left;
    x.left=y.right;                 // turn y's right subtree to x's left subtree
    if(y.right!=nill){
        y.right.parent=x;
    }
    y.parent=x.parent;              //link x's parents to y
    if(x.parent==nill){
        root=y;
    }
    else{
        if(x==x.parent.right){
            x.parent.right=y;
        }
        else{
            x.parent.left=y;
        }
    }
    y.right=x;                       //put x on y's right
    x.parent=y;
}

//selecting the ith smallest data/key in the tree, useful to find the median

public int select(node n,int pos){
    int r=(n.left==null)?1:n.left.size+1;
    if(pos==r){
        return n.data;
    }else if(pos<r){
        return select(n.left,pos);
    }else{
        return select(n.right,pos-r);
    }
}

/* Delete function to be implemented later
public void deletekey(int key){
    if(root==null){
            System.out.println("Tree empty, no node to be deleted");
        }
    else{
        root=delete(root,key);
    }
}

//deleting the node from binary tree
    public node delete(node n, int key){
        if(key<n.data){
            n.left=delete(n.left,key); // recursive call to search in left subtree
           n.size--;
           n.sum-=key;
        }
        else if(key>n.data){
            n.right=delete(n.right,key);// recursive call to search in right subtree
            n.size--;
            n.sum-=key;
        }
        else{
            // Case 1: node with 0 or 1 child
            if(n.left==null){
                return n.right;
            }
            else if(n.right==null){
                return n.left;
            }

            // Case 2: node with 2 children
            n.data=minValue(n.right);// find minimum value node in right subtree and replace n's value with it
            n.right=delete(n.right,n.data); //delete the minimum value node(the successor)
            n.size--;
            n.sum-=key;
        }
        return n;
    }

    public int minValue(node n){
        int min=n.data;
        while(n.left!=null){
            min=n.left.data;
            n=n.left;
        }
        return min;
    }
//calculating size of the root
    public int size() {
        return(size(root)); 
    }
//calculating size of node n
    private int size(node n) { 
        if (n == null) return(0); 
        else { 
            return(size(n.left) + 1 + size(n.right)); 
        } 
    } 

//calculating sum of root
    public int sum() {
        return(size(root)); 
    }
//calculating sum of node n
    private int sum(node n) { 
        if (n == null) return(0); 
        else { 
            return(sum(n.left) + n.data + sum(n.right)); 
        } 
    }
*/
//in-order tree traversal
    public void inOrderTraversal(node n){
        if(n!=null){
            inOrderTraversal(n.left);
            if(n!=nill)
            {
                if(n==root)
                    System.out.println((char)(64+n.data)+"("+n.color+"),(root)");
                else if(n==n.parent.right)
                    System.out.println((char)(64+n.data)+"("+n.color+"),(right child of "+(char)(64+n.parent.data)+")");
                else
                    System.out.println((char)(64+n.data)+"("+n.color+"),(left child of "+(char)(64+n.parent.data)+")");
            }
            inOrderTraversal(n.right);
        }
    }

}