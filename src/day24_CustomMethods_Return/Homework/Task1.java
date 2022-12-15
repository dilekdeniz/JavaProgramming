package day24_CustomMethods_Return.Homework;

public class Task1 {
    public static void main(String[] args) {
        /*
        Tasks
1.  create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
         */
        String sentence = "Java java java python python";
        sentence = sentence.toLowerCase();
        int frequency = frequencyOfWord(sentence, "java");
        System.out.println(frequency);
    }
    public static int frequencyOfWord (String sentence, String word){
        int count=0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

    }
