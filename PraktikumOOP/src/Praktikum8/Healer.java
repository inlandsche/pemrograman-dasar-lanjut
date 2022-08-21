package Praktikum8;

public class Healer extends Character {
    public Healer() {
        this.setHP(70);
        this.setAttack(10);
        this.setDefense(10);
    }

    public void heal(){
        System.out.println("Menggunakan skill Heal");

        this.setHP(getHP() + 25);

    }

    @Override
    public boolean attack() {
        int parameter = (int) (Math.random() * 20) + 1;

        if (parameter < 4)
            return false;
        else
            return true;
    }

}
