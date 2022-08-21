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