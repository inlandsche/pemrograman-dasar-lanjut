public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.sisipDt(4);
        bt.sisipDt(3);
        bt.sisipDt(5);

        BTNode search = bt.search(bt.getRoot(), 4);

        BTNode kiri = search.nodeKiri;
        BTNode kanan = search.nodeKanan;

        System.out.println((kiri.data + kanan.data) - search.data);

    }
}
