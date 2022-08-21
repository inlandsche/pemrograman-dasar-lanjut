package Praktikum8;

public class Titan extends Character {

    public Titan() {
        this.setHP(200);
        this.setAttack(45);
        this.setDefense(0);
    }

    @Override
    public boolean attack() {
        int parameter = (int) (Math.random() * 10) + 1;

        if (parameter < 5)
            return true;
        else
            return false;
    }

}
