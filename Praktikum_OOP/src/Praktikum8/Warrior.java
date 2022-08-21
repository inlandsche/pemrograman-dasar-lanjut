package Praktikum8;

public class Warrior extends Character{

    public Warrior() {
        this.setHP(80);
        this.setAttack(25);
        this.setDefense(30);
    }

    @Override
    public boolean attack() {
        int parameter = (int) (Math.random() * 10) + 1;

        if (parameter < 5)
            return false;
        else
            return true;
    }

}
