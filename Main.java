import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Skriv in lösendord");

        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        String choice;

        if ( password() ) {
            System.out.println("Skriv in två tal");
                int a = s.nextInt();
                int b = s.nextInt();

                            while(true){

                                System.out.println("Vad vill du göra med talen?\n" +
                                        "1. Addera \n" +
                                        "2. Multiplicera\n" +
                                        "3. Avsluta programmet"
                                );

                                   choice = sc.nextLine();

                                    if (choice.equals("1")) {

                                        System.out.println("adding " + add(a, b));

                                    }
                                    else if (choice.equals("2")) {
                                        System.out.println("multiplicera " + multiplicera(a, b));

                                    }
                                    else if (choice.equals("3")){
                                        System.out.println("Avslutar program");
                                        break;

                                    }

                                    else if (choice.equals("3")) {
                                        System.out.println("Du valde avsluta programmet");
                                        break;
                              }
                            }
                                
        }else {
            System.out.println("Fel lösenord");
        }

    }

    private static boolean password(){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        return pass.equals("RobinHood");
    }
    private static int add(int a, int b){
        return a + b;
    }
     static  int multiplicera(int a, int b){
        return a * b;
    }
}