package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        // && and
        String name = "Steven";
        int age= 19;
        String citizen = "UK";
        boolean isEligible =  age>=18 && citizen == "USA";
                           //    19 >= 18 && "UK" == "USA"
                            //   True      && false  result going to be false. Both of the expression should be true.
        String name2= "Aaron";
        int age2= 18;
        String citizen2 = "USA";
        boolean isEligible2 = age2>=18 && citizen2 == "USA";
        System.out.println(name2+ " is elegibile to vote :" + isEligible2); //true

        String name3 = "Josh";
        int creditScore = 720;
        int age3 = 23;
        int income = 40000;
                                // true           true           false
        boolean isEligible3 = creditScore >=700 && age3 >=21 && income >=60000;
        System.out.println ( name3 + "is Eligible for loan: "+ isEligible3); //false

    //  || or
String name4= "Shay";
int age4 = 21;
char gender = 'F';
boolean isEligible4= age4 >=18 && (gender== 'M' || gender== 'F');
                // 21>18  f //true

        String name5 = "James";
        String countryBirth = "USA";
        boolean marriedToCitizen = false;
        boolean isEligible5 = countryBirth=="USA"|| marriedToCitizen ==true;
        System.out.println(name5 + " is eligible to apply for Usa citizenShip: " +isEligible5); //true
        //------------------
        String student= "Anna";            // Ali
        double gpa=3.5;                   // 2.5
        int familyIncome = 100000;        // 50000 biri dogru biri yanlis . or dedigi icin true.
        boolean isEligibile = gpa >=3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible for scolarship: " + isEligibile);


        //-----------------------
        boolean result2 = true;
        System.out.println("result2 = " + result2); // true
        boolean result3 = !result2;
        System.out.println("result3 = " + result3); //false

        int score =85;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("failed = " + failed); //false
        System.out.println("passed = " + passed); // true








        }



    }

