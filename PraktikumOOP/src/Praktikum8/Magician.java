package Praktikum8;

public class Magician extends Character{

    public Magician() {
        this.setHP(100);
        this.setAttack(60);
        this.setDefense(10);
    }

    @Override
    public boolean attack() {
        int parameter = (int) (Math.random() * 20) + 1;

        if (parameter < 8)
            return true;
        else
            return false;
    }
}
