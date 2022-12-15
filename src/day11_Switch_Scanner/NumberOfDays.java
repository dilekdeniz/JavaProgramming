package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=2;
        int year=2000;
        if (number>=1 && number<=12) {
            switch (number){
                case 2:
                    if (year %4==0){
                        System.out.println("29 Days");
                    } else {
                        System.out.println("28 Days");
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;

                default:  // numara 2,4,6,11 degilse 31 days print edecek
                    System.out.println("31 Days");
            }


        }else{ // hicbiri degilse invalid print edecek
            System.out.println("Invalid Number");
        }
        System.out.println("---------------------------");
        //second solution
        int year1 = 2000;
        int number2 = 2;
        String resultt = "";
        if (number2 >= 1 && number2<=12) {
            switch (number) {

                case 2:
                resultt = (year1 % 4 == 0) ? "29 Days" : "28 Days";
                break;

                case 4:  case6: case9: case11:
                    resultt = "30 Days";
                    break;
                default:
                    resultt= "31 Days";
            }
        }else {
            resultt = "Invalid Number";
        }
        System.out.println(resultt);

            }
        }





/*

	4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}


 */