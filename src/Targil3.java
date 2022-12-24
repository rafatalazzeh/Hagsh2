import java.util.Arrays;

public class Targil3 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,1,8,9,2,1,3,8,0};

       phan(arr);




    }

    public static int[] phan(int[] arr) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            flag=true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;

                }
            }
            if (flag) {
                count++;
            }
        }
        int []arr2=new int [count];
        int index2=0;
        for (int i = 0; i < arr.length; i++) {
            flag=true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;

                }
            }
            if (flag) {
                arr2[index2]=arr[i];
                index2++;
            }
        }


        for(int k =0;k<index2;k++){
            System.out.println(arr2[k]);

        }
        return arr2;
    }


}



