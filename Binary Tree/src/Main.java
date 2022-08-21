import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.sisipDt(50);
        bt.sisipDt(40);
        bt.sisipDt(53);
        bt.sisipDt(45);
        bt.sisipDt(51);
        bt.sisipDt(41);
        bt.sisipDt(52);

        System.out.print("Pre-order\t: ");
        bt.preorder(bt.getRoot());
        System.out.println();
        System.out.print("In-order\t: ");
        bt.inorder(bt.getRoot());
        System.out.println();
        System.out.print("Post-order\t: ");
        bt.postorder(bt.getRoot());
        System.out.println();
        System.out.print("Level-order\t: ");
        bt.levelorder();

    }

}
