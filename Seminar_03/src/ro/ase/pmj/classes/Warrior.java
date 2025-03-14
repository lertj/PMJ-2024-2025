package ro.ase.pmj.classes;

import ro.ase.pmj.classes.interfaces.Attackable;

public class Warrior extends GameCharacter implements Attackable {
                    // extends -> is a

    Weapon weapon; // has a

    public Warrior(int healthPoints, String name, boolean hasWeapon, int[] costs, String weaponName, int id) {
        super(healthPoints, name, hasWeapon, costs, id); // super reprezinta obiectul/clasa mostenita - in cazul de fata GameCharacter
        this.weapon = new Weapon(weaponName);
    }

    public Warrior(){
        // putem sa omitem apelarea constructorului cu super, deoarece este apelat implicit constructorul default din GameCharacter - super()
    }

    @Override
    public String toString() {
        return super.toString() + " I am using the weapon: " + this.weapon.name;
    }

    @Override
    public void attack() {
        System.out.println("Atttaaaack!");
    }
}
