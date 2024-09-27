import java.util.Scanner;

class Topics{
    Scanner scan = new Scanner(System.in);
    int score = 0;
     public void GK(){
        String[] qus = {"How many continets are there in the world?",
                        "What is the largest ocean on Earth?",
                        "Who is paited the monalisa?",
                        "What is the tallest mountain in the world",
                        "Which animal is known as the \"King of the Jungle\"?"};

        String[][] options = {{"Five","Seven","six"},
                             {"Indian Ocean","Pacific Ocean","Artic Ocean"},
                             {"Leonardo da Vinci","Pablo Picasso","Vincent van Gogh"},
                             {"K2","Kangchenjunga","Mount Everst"},
                             {"Tiger","Lion","cheeta"}};
        
        String[] ans = {"Seven","Pacific Ocean","Leonardo da Vinci","Mount Everst","Lion"};

        for (int i = 0; i < qus.length; i++) {
            System.out.println(i+1 + ")  " + qus[i]);
            for(int j = 0; j < options[i].length; j++){
                System.out.println("  "+ (char) ('A'+j) + "." + options[i][j]);
            }
            System.out.print("Enter your answer :  ");

            char select = scan.nextLine().toUpperCase().charAt(0);
            if(select < 'A' || select > 'A'+ options[i].length - 1 ){
                System.out.println("Invalid option. Please select a valid option.");
                continue;
            }
            String Ans = options[i][select - 'A'];

            if(Ans.equals(ans[i])){
                System.out.println("Correct");
                score++;
            }else{
                System.out.println("Your answer is wrong!....Correct answer is :" + ans[i]);
            }
            System.out.println();
        }
        System.out.println("Your score : " + score + "/" + qus.length);
    }

    public void COSMIC(){
        String[] qus = {"What is the smallest planet in our solor system?",
                        "What is the closest star to earth?",
                        "What is the Earth's natural satellite?",
                        "Which planet is known as the \"Morning Star\"?",
                        "What is the second-lorgest planet in our solar system?"};

        String[][] options = {{"Jupiter","Mercury","Venus"},
                              {"The Sun","UY Scuti","OGLE-TR-122b"},
                              {"Ganymede","The Moon"," Titan"},
                              {"Jupiter","Venus","Earth"},
                              {"Uranus","Saturn","Mars"}};

        String[] ans = {"Mercury","The Sun","The Moon","Venus","Saturn"};

        for (int i = 0; i < qus.length; i++) {
            System.out.println(i+1 + ")  " + qus[i]);
            for(int j = 0; j < options[i].length; j++){
                System.out.println("  "+ (char) ('A'+j) + "." + options[i][j]);
            }
            System.out.print("Enter your answer :  ");

            char select = scan.nextLine().toUpperCase().charAt(0);
            if(select < 'A' || select > 'A'+ options[i].length - 1 ){
                System.out.println("Invalid option. Please select a valid option.");
                continue;
            }
            String Ans = options[i][select - 'A'];

            if(Ans.equals(ans[i])){
                System.out.println("Correct");
                score++;
            }else{
                System.out.println("Your answer is wrong!....Correct answer is: " + ans[i]);
            }
            System.out.println();
        }
        System.out.println("Your score : " + score + "/" + qus.length);
    }

    public void LITERATURE(){
        String[] qus = {"Who wrote the play \"Romeo and Juliet\"?",
                        "Who is the father of \"English Literature\"?",
                        "Who is the \"Father of the Essay\"?",
                        "Who is the first bible translater in english?",
                        "Who is the father of \"English Criticism\"?"};
        
        String[][] options = {{"Jane Austen","Charles Dickens","William Shakespeare"},
                              {"Geoffrey Chavcer","Virginia Woolf","John Wycliffe"},
                              {"Charles Dickens","William Shakespeare","Michel de Montaigne"},
                              {"John Wycliffe","Jane Austen","Virginia Woolf"},
                              {"George Eliot","Samuel Johnson","C. S. Lewis"}};

        String[] ans = {"William Shakespeare","Geoffrey Chavcer","Michel de Montaigne","John Wycliffe","Samuel Johnson"};

        for (int i = 0; i < qus.length; i++) {
            System.out.println(i+1 + ")  " + qus[i]);
            for(int j = 0; j < options[i].length; j++){
                System.out.println("  "+ (char) ('A'+j) + "." + options[i][j]);
            }
            System.out.print("Enter your answer :  ");

            char select = scan.nextLine().toUpperCase().charAt(0);
            if(select < 'A' || select > 'A'+ options[i].length - 1 ){
                System.out.println("Invalid option. Please select a valid option.");
                continue;
            }
            String Ans = options[i][select - 'A'];

            if(Ans.equals(ans[i])){
                System.out.println("Correct");
                score++;
            }else{
                System.out.println("Your answer is wrong!....Correct answer is: " + ans[i]);
            }
            System.out.println();
        }
        System.out.println("Your score : " + score + "/" + qus.length);
    }

    public void INDIAN_CONSTITUTION(){
        String[] qus = {"What is the supreme law of India?",
                        "Who is known as the \"Father of the Indian Constitution\"?",
                        "In which year was the Indian Constitution adopted?",
                        "How many schedules are there in the Indian Constitution?",
                        "Which part of the Indian Constitution deals with Fundamental Rights?"};

        String[][] options = {{"The Indian Penal Code","The Constitution of India","The Indian Evidence Act"},
                              {"Jawaharlal Nehru","Sardar Vallabhbhai Patel","Dr. B.R. Ambedkar"},
                              {"1950","1947","1949"},
                              {"8","12","10"},
                              {"Part I","Part III","Part V"}};                

        String[] ans = {"The Constitution of India","Dr. B.R. Ambedkar","1950","12","Part III"};

        for (int i = 0; i < qus.length; i++) {
            System.out.println(i+1 + ")  " + qus[i]);
            for(int j = 0; j < options[i].length; j++){
                System.out.println("  "+ (char) ('A'+j) + "." + options[i][j]);
            }
            System.out.print("Enter your answer :  ");

            char select = scan.nextLine().toUpperCase().charAt(0);
            if(select < 'A' || select > 'A'+ options[i].length - 1 ){
                System.out.println("Invalid option. Please select a valid option.");
                continue;
            }
            String Ans = options[i][select - 'A'];

            if(Ans.equals(ans[i])){
                System.out.println("Correct");
                score++;
            }else{
                System.out.println("Your answer is wrong!....Correct answer is: " + ans[i]);
            }
            System.out.println();
        }
        System.out.println("Your score : " + score + "/" + qus.length);
    }

    public void HISTORY(){
        String[] qus = {"Who was the founder of the Maurya Empire?",
                        "Which Mughal emperor is known for his policy of religious tolerance and the establishment of a centralized administration?",
                        "Which Maratha ruler is renowned for founding the Maratha Empire and his strategic prowess?",
                        "Who was the Indian emperor known for his support of Buddhism and the inscription of edicts on pillars and rocks?",
                        "Which Chola emperor is credited with building the Brihadeeswarar Temple in Thanjavur?"};

        String[][] options = {{"Ashoka","Chandragupta Maurya","Bindusara"},
                              {"Aurangzeb","Shah Jahan","Akbar"},
                              {"Shivaji Maharaj","Balaji Vishwanath","Madhav Rao I"},
                              {"Chandragupta Maurya","Ashoka","Samudragupta"},
                              {"Rajendra Chola I","Vijayalaya Chola","Raja Raja Chola I"}};      
                              
        String[] ans = {"Chandragupta Maurya","Akbar","Shivaji Maharaj","Ashoka","Raja Raja Chola I"};

        for (int i = 0; i < qus.length; i++) {
            System.out.println(i+1 + ")  " + qus[i]);
            for(int j = 0; j < options[i].length; j++){
                System.out.println("  "+ (char) ('A'+j) + "." + options[i][j]);
            }
            System.out.print("Enter your answer :  ");

            char select = scan.nextLine().toUpperCase().charAt(0);
            if(select < 'A' || select > 'A'+ options[i].length - 1 ){
                System.out.println("Invalid option. Please select a valid option.");
                continue;
            }
            String Ans = options[i][select - 'A'];

            if(Ans.equals(ans[i])){
                System.out.println("Correct");
                score++;
            }else{
                System.out.println("Your answer is wrong!....Correct answer is: " + ans[i]);
            }
            System.out.println();
        }
        System.out.println("Your score : " + score + "/" + qus.length);
    }
}