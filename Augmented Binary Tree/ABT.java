import tree.node;
import java.util.*;
public class ABT{
    static int sum;
    public static void main(String args[]){
        Tree T=new Tree();
        sum=0;
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
        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);
        System.out.print("\npostOrder Traversal: ");
        T.postOrderTraversal(T.root);
        System.out.print("\npreOrder Traversal: ");
        T.preOrderTraversal(T.root);

        System.out.println("\n\n\n* DELETION *\nAfter deleting node with data=3");
        T.deletekey(3);
        System.out.println("\nInorder Traversal:element(node-size): ");
        T.inOrderTraversal(T.root);
       // T.displayTree(T.root);
       // System.out.println("\nCount:"+T.root.count);
      //  System.out.println("\nSum:"+T.root.sum);
      //  System.out.println("\nMean:"+T.root.sum/T.root.count);
      // System.out.println(T.size());

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

    
public void deletekey(int key){
    root=delete(root,key);
}

//deleting the node from binary tree
    public node delete(node n, int key){
        if(n==null){
            System.out.println("Tree empty, no node to be deleted");
            return n;
        }
        if(key<n.data){
            n.left=delete(n.left,key); // recursive call to search in left subtree
        }
        else if(key>n.data){
            n.right=delete(n.right,key);// recursive call to search in right subtree
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