public class Targil4 {
    public static void main(String[]args){
        int [] arr = {1,3,6,11,10,9,4,2,0};
        int tshova=pisga(arr);
        System.out.println( "index" + tshova );




    }
    public static int pisga(int[]arr){
        int max = arr[0];
        int index2=0;
        int index3=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                index2 = i;
                index3=i;


            }
        }




        for (int i=0;i<index2-1;i++){
            if (arr[i]>arr[i+1]){
                return -1;

            }

        }
        for(int i = index2+1 ; i<arr.length-1;i++){
            if (arr[i] <arr[i+1]){
                return -1;
            }
        }



        return index3;
    }
}
