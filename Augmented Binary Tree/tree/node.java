package tree;

public class node{
    public int data;
    public node left,right;
    public int size,sum,rank;
    public node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.size=0;
        this.sum=0;
        this.rank=0;
    }
}