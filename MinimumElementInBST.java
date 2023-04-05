// Rest of the code is already given as Driver Code


class Tree
{
    int minValue(Node node)
    {
        if(node == null)
            return -1;
        
        if(node.left == null)
            return node.data;
            
        return minValue(node.left);
    }
}