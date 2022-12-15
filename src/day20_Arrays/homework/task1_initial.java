package day20_Arrays.homework;

public class task1_initial {
    public static void main(String[] args) {
        /*
        1. create an array named classmates, and store 10 of your classmates'
full names.print the initials of each classmates in separate lines
         */
        String[] classmates={"Dilek Deniz","Kenan Dogulu", "Beren Saat","Yildiz Tilbe","Sila Gencoglu","Yalin Soyadinibilmem",
                "Mabel Matiz", "Mazhar Fuat","Ozkan Yalnizkaldi","Ajda Pekkan"};
        for (String each:classmates){
            String initial = each.charAt(0)+"."+ each.charAt(  each.indexOf(" ") +1   );
            System.out.println(initial);
        }


    }
}
