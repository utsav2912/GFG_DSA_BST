// Rest of the code is already given as Driver Code

Node* LCA(Node *root, int n1, int n2)
{
  if(root == NULL)
     return NULL;
    if(root->data <n1 && root->data <n2)
        return LCA(root->right, n1, n2);
    else if(root->data > n1 && root->data > n2)
        return LCA(root->left, n1, n2);
    return root;
}
