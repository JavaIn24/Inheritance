package HomeWork_Inheritance;

public class HockeyPlayer extends Sportsman{
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }
    public void Fighting () {
        System.out.println("Хокейст умеет бить лица во время и вне игры");
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
