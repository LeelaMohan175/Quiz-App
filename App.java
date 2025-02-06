import model.Question;
import serivce.AdminService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {

    public static void main(String[] args) {

        ArrayList<Question> questionList = new ArrayList<>();
        questionList.add(new Question(0,"java",new String[]{"php","java"}, "What is your liked language" ));
        questionList.add(new Question(1,"Maths",new String[]{"Scicence","Social","Maths"}, "What is your liked subject" ));

        String user;

        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you? 'ADMIN' or 'USER' ");
        user = sc.next();

        if(user.equals("ADMIN")){
            AdminService admService = new AdminService();
            Question qsn1 = new Question(2,"Banglore",new String[]{"Delhi","Banglore"}, "What is your birth place" );
            while(true) {
                System.out.println("What do you want to do?");
                System.out.println("1) ADD a qsn  2) Remove a qsn  3)Edit a qsn  4) Show all qsns  5) Exit");

                System.out.println("Enter your choice...");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1 ->
                        admService.addQsn(qsn1, questionList);
                    case 2 ->
                        admService.removeQsn(0, questionList);
                    case 3 ->
                        admService.editQsn(questionList,0, "My Custom qsn");
                    case 4 ->
                        admService.display(questionList);
                    case 5 ->
                        exit(0);
                    default ->
                        System.out.println("Invalid response");
                }
            }

        }

        // user
        else if (user.equals("USER")) {
            int score = 0;

            for(Question qsn : questionList){
                System.out.println("Question: " + qsn.getQuestion());
                System.out.println("Enter your answer...");
                String ans = sc.next();

                if(Arrays.asList(qsn.getOptions()).contains(ans)){
                    score++;
                }
            }

            System.out.println("Your score is : " +score);

        }
    }
}
