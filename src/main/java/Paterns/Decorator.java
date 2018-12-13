package Paterns;

public class Decorator {

    public static void main(String ... args) {

        Troll st = new SimpleTroll();
        st.attack();

        Troll ct = new ClubbedTroll(st);
        ct.attack();

    }
}

interface Troll {
    void attack();
    int getAttackPower();
    void fleeBattle();
}

class SimpleTroll implements Troll {

    @Override
    public void attack() { System.out.println("The troll tries to grab you!"); }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }

}

class ClubbedTroll implements Troll {

    private Troll decorated;

    public ClubbedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }

    // My new method
    public void saveMiddleEarth() {
        System.out.println("I will save middle earth!");
    }

}