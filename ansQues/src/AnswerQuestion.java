import java.util.Scanner;

public class AnswerQuestion {

        final static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Let's test your programming knowledge.");
            System.out.println("Why do we use methods?");
            System.out.println("1. To repeat a statement multiple times.");
            System.out.println("2. To decompose a program into several small subroutines.");
            System.out.println("3. To determine the execution time of a program.");
            System.out.println("4. To interrupt the execution of a program.");

            test();
            end();

        }//mainMethod


        static void test() {
            int answer = 2;
            int inputOfUser = scanner.nextInt();
            if (inputOfUser != answer) {
                System.out.println("Please, try again.");
                test();
            }//if
        }//test

        static void end() {
            System.out.println("Correct!");
        }//end

    }//class

