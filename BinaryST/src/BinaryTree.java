
public class BinaryTree {
    private BTNode root;
    private boolean isleft=false;

    public BinaryTree(int data){
        root = new BTNode(data);
    }

    public BinaryTree(){}

    public BTNode getRoot() {
        return root;
    }

    public void removeFromParent(int remove){
        if(root == null)
            return;
        else if(root.data == remove){
            if(root.nodeKanan == root.nodeKiri)
                root = null;
            else if(root.nodeKanan == null)
                root = root.nodeKiri;
            else if(root.nodeKiri == null)
                root = root.nodeKanan;
            else{
                BTNode max = getMax(root.nodeKiri);
                removeFromParent(max.data);
                root.data= max.data;
            }
            return;
        }

        BTNode parentRemove = getParentRemove(root,remove);
        BTNode gchild = null;
        if(parentRemove == null)
            return;
        if(isleft){
            if(parentRemove.nodeKiri == parentRemove.nodeKanan)
                parentRemove.nodeKiri = null;
            else if(parentRemove.nodeKiri.nodeKanan==null){
                gchild = parentRemove.nodeKiri.nodeKiri;
            }else if(parentRemove.nodeKiri.nodeKiri == null){
                gchild = parentRemove.nodeKiri.nodeKanan;
            }else{
                BTNode max = getMax(parentRemove.nodeKiri.nodeKiri);
                removeFromParent(max.data);
                parentRemove.nodeKiri.data = max.data;
                return;
            }
            parentRemove.nodeKiri = gchild;
        }else{
            if(parentRemove.nodeKiri == parentRemove.nodeKanan)
                parentRemove.nodeKanan = null;
            else if(parentRemove.nodeKanan.nodeKanan ==null){
                gchild = parentRemove.nodeKanan.nodeKiri;
            }else if(parentRemove.nodeKanan.nodeKiri == null){
                gchild = parentRemove.nodeKanan.nodeKanan;
            }else{
                BTNode max = getMax(parentRemove.nodeKanan.nodeKiri);
                removeFromParent(max.data);
                parentRemove.nodeKanan.data = max.data;
                return;
            }
            parentRemove.nodeKanan = gchild;
        }

    }


    //source : geeksforgeeks
    public void remove(int remove){
        root = removeRec(root,remove);
    }
    private BTNode removeRec(BTNode node, int remove){
        if(node == null)
            return null;
        else if(node.data > remove)
            node.nodeKiri = removeRec(node.nodeKiri,remove);
        else if(node.data < remove)
            node.nodeKanan = removeRec(node.nodeKanan,remove);
        else{
            if(node.nodeKiri == null)
                return node.nodeKanan;
            else if(node.nodeKanan ==null)
                return node.nodeKiri;

            BTNode max = getMax(node.nodeKiri);
            node.data = max.data;
            node.nodeKiri = removeRec(node.nodeKiri,max.data);
        }
        return node;
    }
    //endsource


    private BTNode getMax(BTNode node){
        BTNode pointer = node;
        while(pointer.nodeKanan != null)
            pointer = pointer.nodeKanan;
        return pointer;
    }
    private BTNode getMin(BTNode node){
        BTNode pointer = node;
        while(pointer.nodeKiri != null)
            pointer = pointer.nodeKiri;
        return pointer;
    }

    private BTNode getParentRemove(BTNode node, int remove){
        if(remove < node.data){
            if(node.nodeKiri != null){
                if(node.nodeKiri.data == remove){
                    isleft = true;
                    return node;
                }
                else return getParentRemove(node.nodeKiri,remove);
            }
        }else if(remove > node.data){
            if(node.nodeKanan != null){
                if(node.nodeKanan.data == remove){
                    isleft =false;
                    return node;
                }
                else return getParentRemove(node.nodeKanan,remove);
            }
        }
        return null;
    }

    public BTNode search(BTNode node, int key){
        if(node==null)
            return null;
        if(node.data>key)
            return search(node.nodeKiri,key);
        else if(node.data<key)
            return search(node.nodeKanan,key);
        else return node;
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
}


class BTNode{
    int data;
    BTNode nodeKiri;
    BTNode nodeKanan;
    public BTNode(int dt){
        data = dt;
        nodeKiri = nodeKanan = null;
    }

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

