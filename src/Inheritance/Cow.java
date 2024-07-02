package Inheritance;

public class Cow  extends  Animals {

    public Cow(String name, int number, String view) {
        super(name, number, view);
    }
    public void GetMilk () {
        System.out.println("Корова дает молоко");
    }
    @Override
    public void eating() {
        System.out.println("Коровы кушают сочные корма");
    }

    @Override
    public void sleeping() {
        System.out.println("Коровы не спят");
    }
}
