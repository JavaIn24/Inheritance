package HomeWork_Inheritance;

public class Main {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("Игнат" , "красная плесень" , 25);
        Footballer footballer1 = new Footballer("Ичиго Куросаки" , "Шинигами" , 17);
        System.out.println(footballer.GetName() + " играет за команду " + footballer.GetTeam() + ", возраст этого спортсмена " + footballer.GetAge());
        footballer.ScoringPoints();
        footballer.Workout();
        footballer.scoringGoals();
        System.out.println(footballer1.GetName() + " играет за команду " + footballer1.GetTeam() + ", возраст этого спортсмена " + footballer1.GetAge());
        footballer1.ScoringPoints();
        footballer1.Workout();
        footballer1.scoringGoals();



        HockeyPlayer hockeyPlayer = new HockeyPlayer("Ефрон", "Лимонный снег" , 15);
        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Баржонок", "Кислый на льду", 22);
        System.out.println(hockeyPlayer.GetName() + " играет за команду " + hockeyPlayer.GetTeam() + ", возраст этого спортсмена " + hockeyPlayer.GetAge());
        hockeyPlayer.ScoringPoints();
        hockeyPlayer.Workout();
        hockeyPlayer.Fighting();
        hockeyPlayer1.ScoringPoints();
        hockeyPlayer1.Workout();
        hockeyPlayer1.Fighting();

        Skier skier = new Skier("Жора", "Tornado Energy" , 35);
        Skier skier1 = new Skier("Бублик" , " хейтеры сноубордов", 17);
        System.out.println(skier.GetName() + " играет за команду " + skier.GetTeam() + ", возраст этого спортсмена " + skier.GetAge());
        skier.ScoringPoints();
        skier.Workout();
        skier.Cant();
        skier1.ScoringPoints();
        skier1.Workout();
        skier1.Cant();



    }
}
