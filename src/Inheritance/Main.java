package Inheritance;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(" Буреша" , 3445, "Корова");
        System.out.println(cow.view + " по кличке" + cow.name + " с инвентарным номером " + cow.number);
        cow.eating();
        cow.sleeping();
        cow.GetMilk();

        Horse horse = new Horse(" Машка" , 1, "Лошадь");
        System.out.println(horse.view + " по кличке" + horse.name + " с инвентарным номером " + horse.number);
        horse.eating();
        horse.sleeping();
    }
}
