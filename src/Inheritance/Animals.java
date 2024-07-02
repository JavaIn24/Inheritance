package Inheritance;

public class Animals {
    String name;
    int number;
    String view;

    public Animals(String name, int number, String view) {
        this.name = name;
        this.number = number;
        this.view = view;
    }
    public  void eating () {
        System.out.println("Животное кушает");
    }
    public void sleeping (){
        System.out.println("Животное спит");
    }
}
