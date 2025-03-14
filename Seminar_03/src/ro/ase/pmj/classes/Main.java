package ro.ase.pmj.classes;

public class Main {
    public static void main(String[] args) {
        int[] v = {10,20,30}; // avem un id pentru array-ul v
        GameCharacter caracter = new GameCharacter(100, "Alex", true, v, 1 ); // in caracter avem alt id pentru array-ul de costuri

        int[] copie = caracter.getCosts(); // aici primim alt id pentru copie, deoarece avem deep copy atat la nivel de constructor cat si getter

        System.out.println(caracter); // se apeleaza implicit toString

        Warrior warrior = new Warrior(120, "Alex razboinicu'", true, v, "palosh", 2);
        System.out.println(warrior);

        warrior.something();
        warrior.somethingNotAbstract();
    }
}