package HomeWork_Inheritance;

public class Sportsman {
   private String name;
   private String team;
   private int age;

   public Sportsman(String name, String team, int age) {
         this.name = name;
         this.team = team;
         this.age = age;

   }
   public Sportsman(String name, String team) {
      this.name = name;
      this.team = team;
   }
   public Sportsman(String name) {
      this.name = name;
   }
   public  String GetName(){
      return name;
   }
   public  String GetTeam(){
      return team;
   }
   public int GetAge(){
      return age;
   }
   public void ScoringPoints () {
      System.out.println("Спортсмен " + name + " зарабатывает очки для команды");
   }
   public void Workout () {
      System.out.println("Спортсмен " + name + " тренируется каждый день");
   }

}
