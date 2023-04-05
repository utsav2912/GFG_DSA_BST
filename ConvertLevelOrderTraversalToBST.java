// Rest of the code is already given as Driver Code

class GFG 
{
    public Node constructBST(int[] arr)
    {
        int N = arr.length;
        Node root = null;
        for(int i=0;i<N;i++)
            root = insert(root,arr[i]);
            
        return root;
    }
    
    static Node insert(Node root,int x){
        if(root == null)
            return new Node(x);
        
        if(root.data>x)
            root.left = insert(root.left,x);
        else if(root.data<x)    
            root.right = insert(root.right,x);
            
        return root;
    }
}