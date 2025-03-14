package ro.ase.pmj.classes;

public abstract class Entity {
    public int id;

    public Entity(int id) {
        this.id = id;
    }

    public abstract void something(); // "pure virtual" -> abstract

    public void somethingNotAbstract(){
        System.out.println("I have no concrete purpose..."); // putem avea si metode non-abstracte
    }
}
