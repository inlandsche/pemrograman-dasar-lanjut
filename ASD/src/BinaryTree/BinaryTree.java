package BinaryTree;

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
            q.enqueqeue(root);
            levelorder(q);
        }
    }
    private void levelorder(Queue q){
        if(q.size != 0){
            BTNode node = (BTNode) q.dequeue();
            System.out.print(node.data + " ");
            if(node.nodeKiri != null)
                q.enqueque(node.nodeKiri);
            if(node.nodeKanan != null)
                q.enqueque(node.nodeKanan);
            levelorder(q);
        }
    }
}


class BTNode{
    int data;
    BTNode nodeKiri;
    BTNode nodeKanan;
    public BTNode(int dt){
        data = dt;
        nodeKiri = nodeKanan = null;
    }

    //saat ini 20
    public void sisipDt(int dtSisip ){
        if (dtSisip < data){
            if(nodeKiri == null)
                nodeKiri = new BTNode( dtSisip );
            else nodeKiri.sisipDt( dtSisip );
        }
        else if(dtSisip > data){
            if ( nodeKanan == null )
                this.nodeKanan = new BTNode(dtSisip);
            else nodeKanan.sisipDt(dtSisip);
        }
    }
}

