package HomeWork_Inheritance;

public class Footballer extends Sportsman {
    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void scoringGoals (){
        System.out.println("Проффесиональный нападающий по имени  в футболе хорошо забивает голы");
    }


    @Override
    public void Workout() {
        super.Workout();
    }

    @Override
    public void ScoringPoints() {
        super.ScoringPoints();
    }
}
