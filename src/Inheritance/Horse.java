package Inheritance;

public class Horse extends Animals {
    public Horse(String name, int number, String view) {
        super(name, number, view);
    }

    @Override
    public void eating() {
        System.out.println("Лошадки кушают овес");
    }

    @Override
    public void sleeping() {
        System.out.println("Лошадки спят");
    }
}
