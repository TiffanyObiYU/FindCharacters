public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Find Words Containing Character
        System.out.println();
        System.out.println("Find Words Containing Character");

        //for this example we will pre-populate the word array and create a Character variable
        //keep in mind that on Leet Code there can be more than 50 words in the word array
        String[] wordArr = new String[4];
        wordArr[0]="abc";
        wordArr[1]="bcd";
        wordArr[2]="aaaa";
        wordArr[3]="cbc";



        for(Integer index: FindCharacters.findWordsContaining(wordArr, 'a')){
            System.out.println(index);
        }
    }
}