import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        boolean game1=false, play = false, game2=false, play2=false;
        Scanner scannerAnswer = new Scanner(System.in);

        System.out.print("Играем в 1 или во 2 игру?: ");
        int gameAnswer = scannerAnswer.nextInt();
        // scannerAnswer.close();
        if (gameAnswer==1){
            game1 = true; play = true;
        } else {
            game2=true; play2=true;
        }
        //1
        while (game1) {
            int attemps = 3, secretNumber = (int) (Math.random() * 10), answerNumber;
            while (play) {
                while (attemps > 0) {
                    System.out.print("Попыток осталось: " + attemps + "\n Введите число: ");
                    Scanner scanner1 = new Scanner(System.in);
                    answerNumber = scanner1.nextInt();
                    // scanner1.close();
                    if (answerNumber > secretNumber) System.out.println("Загаданное число меньше");
                    else if (answerNumber < secretNumber) System.out.println("Загаданное число больше");
                    else{
                        System.out.println("Вы победли!");
                        attemps=0;
                    }
                    attemps--;
                }
                play = false;
            }
            System.out.println("Повторить игру еще раз? (1-да/0-нет): ");
            Scanner scanner2 = new Scanner(System.in);
            int answer = scanner2.nextInt();
            //scanner2.close(); при закрытии любого из сканнеров программа крашится, нужно объяснение
            if (answer != 1) game1=false;
            else play = true;

        }
        //2
        while (game2){
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                    "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                    "pineapple", "pumpkin", "potato"};
            String secretWord= words[((int) (Math.random() * 100)) % (words.length-1)];
            while(play2){
                System.out.println("Введите слово: ");
                Scanner game2scanner = new Scanner(System.in);
                String answerWord = game2scanner.next();
                if(secretWord.equals(answerWord)){
                    System.out.println("Вы победили!");
                    play2 = false; game2=false;
                } else {
                    System.out.println(stringResult(answerWord, secretWord));
                }
            }

        }

    }

    public static String stringResult (String answer, String ask) {
        String result="",reshetki="";
        int minLenghtWord;
        if (answer.length() < ask.length()) minLenghtWord=answer.length();
        else minLenghtWord= ask.length();

        for(int i=0; i < minLenghtWord ; i++){
            if(answer.charAt(i) == ask.charAt(i)) result+=ask.charAt(i);
            else result+="#";
        }

        for(int k = 0; k < (15 - result.length()); k++){
            reshetki+= "#";//пришлось создать доп переменную т.к. в result больше 10# не записывалось
            //  нужно пояснение
        }
        result+=reshetki;

        return result;
    }

}
