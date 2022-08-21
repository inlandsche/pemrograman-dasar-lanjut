package Praktikum8;

abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public abstract boolean attack();

    public void receiveDamage(int damage){
        if (this.defense < damage)
            damage -= this.defense;
            this.HP -= damage;

            if (this.HP < 0)
                this.HP = 0;
    }

    public void info(){
        System.out.println("++++++++++++ STATUS ++++++++++++");
        System.out.println("Role\t\t\t: " + this.getClass().getSimpleName());
        System.out.println("HP\t\t\t\t: " + this.getHP() + " ➕");
        System.out.println("Attack Power\t: " + this.getAttack() + " ⚔️");
        System.out.println("Defense\t\t\t: " + this.getDefense() + " \uD83D\uDEE1️");
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
