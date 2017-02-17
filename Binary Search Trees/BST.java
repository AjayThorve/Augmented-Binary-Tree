import tree.node;
import java.util.*;
public class BST{
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

    public int size() {
        return(size(root)); 
        }
    private int size(node n) { 
        if (n == null) return(0); 
        else { 
            return(size(n.left) + 1 + size(n.right)); 
        } 
    } 

    public int sum() {
        return(size(root)); 
        }
    private int sum(node n) { 
        if (n == null) return(0); 
        else { 
            return(sum(n.left) + n.data + sum(n.right)); 
        } 
    }


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
    public void inOrderTraversal(node n){
        if(n!=null){
            inOrderTraversal(n.left);
            System.out.println(n.data+"(size="+n.size+",sum="+n.sum+"),");
            inOrderTraversal(n.right);
        }
    }
    public void postOrderTraversal(node n){
        if(n!=null){
            postOrderTraversal(n.left);
            postOrderTraversal(n.right);
            System.out.print(n.data+",");

        }
    }
    public void preOrderTraversal(node n){
        if(n!=null){
            System.out.print(n.data+",");
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);

        }
    }
}