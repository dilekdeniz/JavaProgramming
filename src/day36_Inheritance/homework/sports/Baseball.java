package day36_Inheritance.homework.sports;

public class Baseball extends Sports{
    public Baseball(String name, int numberOfPlayers, int numberOFReferee, int numberOfPeriods) {
        super(name, numberOfPlayers, numberOFReferee, numberOfPeriods);
    }
    public void players(){
        System.out.println(name+ " players are so strong");
    }
}
