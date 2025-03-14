package ro.ase.pmj.classes.interfaces;

public interface Attackable {
    public abstract void attack(); // metodele din interfete sunt by default: public abstract
    public static final int MIN_HITPOINTS = 0; // variabilele din interfete sunt by default: public static final
}
