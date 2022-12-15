package day31_Constructors.Homework;

public class Task2_AdressTask {
    public int buildingNumber,zipCode;
    public String street,city,state;

    public Task2_AdressTask(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;

    }


    @Override


    public String toString() {
        return "Task2_AdressTask{" +
                "buildingNumber=" + buildingNumber +
                ", zipCode=" + zipCode +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

/*
2. Address Task:
2.1 Create a class named Address
    Attributes:
         buildingNumber, street, city, state,
zipCode;
   Add a constructor to set all the fields
    Actions
            toString: returns the address
                        EX:

7925 Jones Branch Dr

McLean Va, 22012
 */