public class BinaryTree {
    private BTNode root;
    int jumlah;

    public BinaryTree(int data){
        root = new BTNode(data);
    }

    public BinaryTree(){}

    public BTNode getRoot() {
        return root;
    }

    public void sisipDt(int data){
        if(root == null){
            root = new BTNode(data);
        }else{
            root.sisipDt(data);
        }
    }

    public void preorder(BTNode node){
        if(node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.nodeKiri);
        preorder(node.nodeKanan);
    }
    public void inorder(BTNode node){
        if(node == null)
            return;

        inorder(node.nodeKiri);
        System.out.print(node.data+" ");
        inorder(node.nodeKanan);
    }
    public void postorder(BTNode node){
        if(node == null)
            return;

        postorder(node.nodeKiri);
        postorder(node.nodeKanan);
        System.out.print(node.data + " ");
    }
    public void levelorder(){
        Queue q = new Queue();
        if(root!=null){
            q.enqueue(root);
            levelorder(q);
        }
    }
    private void levelorder(Queue q){
        if(q.size != 0){
            BTNode node = (BTNode) q.dequeue();
            System.out.print(node.data + " ");
            if(node.nodeKiri != null)
                q.enqueue(node.nodeKiri);
            if(node.nodeKanan != null)
                q.enqueue(node.nodeKanan);
            levelorder(q);
        }
    }
}
