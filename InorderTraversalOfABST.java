// Rest of the code is already given as Driver Code

class Tree 
{
    ArrayList<Integer> inOrder(Node root) 
    {
        ArrayList<Integer> q=new  ArrayList<Integer>();
        if(root==null)
        return q;
        
          ArrayList<Integer> r=new  ArrayList<Integer>();
         
        if(root!=null){
             q= inOrder(root.left);
             r= inOrder(root.right);
        }
        q.add(root.data);
        for(int x:r)
        q.add(x);
        return q;
    }
}