/**
 * Write a description of class hmm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FryCook extends Staff {

    public static final double FRYCOOK_WAGE = 5.50;
    private BurgerByte workBranch;
    private boolean isGrillReady;

    public FryCook(String name, int age, BurgerByte workBranch) {
        super(name, age);
        super.name = name;
        super.age = age;
        this.workBranch = workBranch;
        isGrillReady = false;
    }
    public BurgerByte getWorkPlace() { return workBranch; }
    public boolean isGrillReady() { return isGrillReady; }
}