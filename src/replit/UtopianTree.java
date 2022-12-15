package replit;

public class UtopianTree {
    public static void main(String[] args) {
        int year= 1;
        int  treeSize=0;
        while ( year != 11){
            if (year <=3){
                treeSize ++;

                System.out.println("year " + year+ " - growth 1 cm" +"\n"+ "tree size: "+treeSize+ " cm");
                year++;

            }

            else if(year<=10)  {

                treeSize= treeSize+2;
                System.out.println("year " + year+ " - growth 2 cm" +"\n"+ "tree size: "+treeSize+ " cm");
                year ++;

            }

        }
    }
}

