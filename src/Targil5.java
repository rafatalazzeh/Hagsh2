import java.util.Scanner;

public class Targil5 {
    public static void main(String[] args) {
        char[]arr=new char[9];
        int count =0;
        int place1=0;
        int place2 = place1;
        boolean flag = false;
        while (!flag){
            place1=getpositionFromuser(arr);
            place2=place1;
            if (count%2==0){
                flag=placesYnbolonboard(arr,place2,'x');
            }
            if (count%2==1){
                flag=placesYnbolonboard(arr,place2,'0');
            }
            count ++;

        }



    }


    public static void printboard(char[] arr) {
        String arr1 = "" + arr[0] + arr[1] + arr[2];
        String arr2 = "" + arr[3] + arr[4] + arr[5];
        String arr3 = "" + arr[6] + arr[7] + arr[8];
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);

    }


    public static boolean isavailabe(char[] arr, int place) {
        if (arr[place-1] == 'x' || arr[place-1] == '0') {
            return true;
        }
        return false;


    }

    public static int getpositionFromuser(char[]arr) {
        int number=0;
        //for (int i = 0; i < 9; i++) {
            System.out.println("Enter place of ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            while (number < 1 || number > 9) {
                System.out.println("Plase emter curect num from 1-9");
                number = scanner.nextInt();

            }
            while (arr[number-1]=='x'||arr[number-1]=='0'){
                System.out.println("This place not empaty please enter another number");
                number = scanner.nextInt();
            }



        //}
        return number;
    }

    public static char chekWiner(char []arr){
        if (arr[0] == arr[1] && arr[1]==arr[2])
        {
            return arr[0];
        }
        if (arr[3] == arr[4] && arr[4]==arr[5])
        {
            return arr[4];
        }
        if (arr[6] == arr[7] && arr[7]==arr[8])
        {
            return arr[6];
        }
        if (arr[0] == arr[3] && arr[3]==arr[6])
        {
            return arr[6];
        }
        if (arr[1] == arr[7] && arr[4]==arr[7])
        {
            return arr[7];
        }
        if (arr[2] == arr[5] && arr[5]==arr[8])
        {
            return arr[2];
        }
        if (arr[0] == arr[4] && arr[4]==arr[8])
        {
            return arr[8];
        }
        if (arr[2] == arr[4] && arr[4]==arr[6])
        {
            return arr[6];
        }
        return '-';


    }
    public static boolean placesYnbolonboard(char[]game , int place , char synbol){
        game[place-1]=synbol;
        printboard(game);
      char winer =  chekWiner(game);

      if (winer=='x' || winer == '0'){
          System.out.println("The winer is " + winer);
          return true;
      }
      return false;


    }
}




