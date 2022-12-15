package day36_Inheritance.homework.sports;

public class Sports {
    public String name;
    public int numberOfPlayers,numberOFReferee;

    public Sports(String name, int numberOfPlayers, int numberOFReferee, int numberOfPeriods) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOFReferee = numberOFReferee;
    }
    public void play(){
        System.out.println("Playing "+name);
    }

    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOFReferee=" + numberOFReferee +
                '}';
    }
}
/*
Sports Task:
1. Create a class named Sport
variables:
name, numberOfPlayers, numberOfReferre,
rules
methods:
setInfo()
play()
toString()
2. create the following sub classes of Sport:
1. Basketball
2. Baseball
3. Football
4. AmericanFootball
Add any missing variables or methods
Note: you can search them on google
 */