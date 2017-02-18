import tree.node;
import java.util.*;
public class BT_Mean_Median{
    static int sum;
    static Tree T;
    public static void main(String args[]){
        T=new Tree();
        sum=0;
        insert(3);
        insert(8);
		insert(1);
        insert(4);
        insert(6);
        insert(2);
        insert(10);
        insert(9);
		insert(20);
        insert(25);
        insert(15);
        insert(16);
        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);

        System.out.println("\n\n\n* DELETION *\nAfter deleting node with data=25");
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
    }
    static void insert(int key){
            T.Insert(key);
            System.out.println("Inserting key: "+key);
            mean_median();
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
    public Tree(){
        this.root=null;
    }
   /* public Tree(int data){
        this.root=new node(data);
    }*/


    //Inserting the node in the binary tree
    public void Insert(int n){
        node newNode=new node(n);
        if(root==null){
            root=newNode;
            root.size=1;
            root.sum=n;
            return;
        }
        node current=root;
        
        while(true){
            if(n<current.data){
                current.size+=1;
                current.sum+=n;
                if(current.left!=null)
                {
                    current=current.left;
                }
                else{
                    current.left=newNode;
                    current.left.size=1;
                    current.left.sum=n;
                    //root.sum+=n;
                    return;
                }
            }
            else{
                current.size+=1;
                current.sum+=n;
                if(current.right!=null){
                    current=current.right;
                }
                else{
                    current.right=newNode;
                    current.right.size=1;
                    current.right.sum=n;
                   // root.sum+=n;
                   // updateRanks(root,0);
                    return;
                }
            }
        }
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

//displayTree
    public void displayTree(node n){
        if(n==root){
            System.out.println("\t\t"+n.data);
        }
        if(n!=null){
            if(n.left!=null){
                System.out.print("\t"+n.left.data+"(left of "+n.data+"),");
            }
            if(n.right!=null){
                System.out.print("\t\t "+n.right.data+"(right of "+n.data+"),");
            }
            System.out.println("");
            displayTree(n.left);
            displayTree(n.right);
        }
        /*if(n!=null){
                    System.out.println(n.data+",");

        displayTree(n.left);
        displayTree(n.right);
        }*/
    }

//in-order tree traversal
    public void inOrderTraversal(node n){
        if(n!=null){
            inOrderTraversal(n.left);
            System.out.println(n.data+"(size="+n.size+",sum="+n.sum+"),");
            inOrderTraversal(n.right);
        }
    }
//post-order tree traversal
    public void postOrderTraversal(node n){
        if(n!=null){
            postOrderTraversal(n.left);
            postOrderTraversal(n.right);
            System.out.print(n.data+",");

        }
    }

//pre-order tree traversal
    public void preOrderTraversal(node n){
        if(n!=null){
            System.out.print(n.data+",");
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);

        }
    }
}