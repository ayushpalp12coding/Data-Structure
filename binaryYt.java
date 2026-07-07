

public class binaryYt{
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data ){
            this.data=data;
            this.left=this.right=null;
        }
    }
         static class Binarytree {
              static int idx=-1;
            public static Node buildTree(int arr[]){
              
                idx++;
                if(arr[idx]==-1) return null;
                
                Node nweNode=new Node(arr[idx]);
                nweNode.left=buildTree(arr);
            nweNode.right=buildTree(arr);
            return nweNode;


            }
        }
         public static void main(String[] args) {
        int [] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root = tree.buildTree(arr);
         System.out.println(root.data);   
         System.out.println(root.left.data);  
         System.out.println(root.left.right.data);  
         System.out.println(root.left.left.data);  
        //  System.out.println(root.left.left.data);  
        //  System.out.println(root.left.left.left.data);  
            }
        }