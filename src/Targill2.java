import java.util.Scanner;

public class Targill2 {
    public static void main(String[] args) {
        String form1 = new String();
        String form2 = new String();
        String form3 = new String();
        String userInput;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number in one of the three forms");
        userInput = scanner.nextLine();
        int formSize = userInput.length();
        if (formSize == 10) {
            form1 = userInput;
        }
        if (formSize == 11) {
            form2 = userInput;
        }
        if (formSize == 12) {
            form3 = userInput;

        }


        fromm1(form1);
        frormm2(form2);
        frormm3(form3);


    }

    public static String fromm1(String form1 ) {
        String numbers = "0123456789";
        String newForm1 = new String();
        boolean bdEka = false;
        for (int i = 0; i < form1.length(); i++) {

                if (form1.charAt(i) == numbers.charAt(i)) {
                    if (form1.charAt(0) == numbers.charAt(0)) {
                        if (form1.charAt(1) == numbers.charAt(5)) {
                            bdEka = true;
                            newForm1 = "05" + form1.charAt(2) + "-" + form1.charAt(3) + form1.charAt(4) + form1.charAt(5) +
                                    form1.charAt(6) + form1.charAt(7) + form1.charAt(8) + form1.charAt(9);
                        }
                    }
                }
            }

        if (bdEka = true) {
            System.out.println(newForm1);
        }else
            System.out.println(newForm1);
        return newForm1;
    }




    public static String frormm2(String form2) {
        String nmbers = "0123456789";
        boolean tshova = false;
        String newform2 = new String();
        String x = "--";
        for (int i = 0; i < 10; i++) {
            for (int k = 4; k < form2.length(); k++) {
                if (nmbers.charAt(i) == form2.charAt(k)) {
                    if (form2.charAt(0) == nmbers.charAt(0)) {
                        if (form2.charAt(1) == nmbers.charAt(5)) {
                            if (form2.charAt(3) == x.charAt(1)) {
                                tshova = true;
                                newform2 = form2;
                            }
                        }
                    }
                }

            }

        }
        if (tshova = true){
            System.out.println(newform2);
        }else
            System.out.println(newform2);

return newform2;
        }



    public static String frormm3(String form3) {
        String newform3 = new String();
        String numbers = "0123456789";
        boolean tshova = false;
        for (int i = 0; i<10;i++){
            for (int k =0;k<form3.length();k++){
                if (form3.charAt(k)==numbers.charAt(i)){
                    if (form3.charAt(0)==numbers.charAt(9)){
                        if (form3.charAt(1)==numbers.charAt(7)){
                            if (form3.charAt(2)==numbers.charAt(2)){
                                tshova = true;
                                newform3= "05"+form3.charAt(4)+"-"+form3.charAt(5)+form3.charAt(6)+form3.charAt(7)+
                                        form3.charAt(8)+form3.charAt(9) + form3.charAt(10) + form3.charAt(11);

                            }
                        }
                    }
                }
            }
        }
        if (tshova=true){
            System.out.println(newform3);
        }else
            System.out.println(newform3);

        return newform3;
    }
    }

