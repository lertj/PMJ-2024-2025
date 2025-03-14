package ro.ase.pmj.classes;

public class GameCharacter extends Entity{
    int healthPoints;
    String name;
    boolean hasWeapon;
    int[] costs;

    public GameCharacter(int healthPoints, String name, boolean hasWeapon, int[] costuri, int id) {
        super(id); // super reprezinta obiectul/clasa mostenita - in cazul de fata Entity
        this.healthPoints = healthPoints;
        this.name = name;
        this.hasWeapon = hasWeapon;

        if(costuri !=null){
            this.costs =new int[costuri.length];
            for(int i=0;i<costuri.length;i++) {
                this.costs[i]=costuri[i];
            }
        }

    }

    GameCharacter(){
        super(0); //suntem nevoiti sa folosim super cu parametri, deoarece in Entity nu avem un constructor default
    }

    public int[] getCosts() {
        int[] copie=new int[this.costs.length];
        for(int i = 0; i< costs.length; i++) {
            copie[i]=this.costs[i];
        }

        return copie;
    }

    @Override
    public String toString() {
        return "Name= " + this.name + "; hp= " +  this.healthPoints + ";";
    }

    @Override
    public void something() {
        System.out.println("I have no purpose...");
    }
}

