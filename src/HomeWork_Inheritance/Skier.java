package HomeWork_Inheritance;

public class Skier extends Sportsman{
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }
    public void Cant () {
        System.out.println("Лыжник на скорости поворачивает кантом");
    }

    @Override
    public void ScoringPoints() {
        super.ScoringPoints();
    }

    @Override
    public void Workout() {
        super.Workout();
    }
}
