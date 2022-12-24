import java.util.Random;
import java.util.Scanner;

public class Targil7 {
    public static void main(String[]args)
    {
        Random random = new Random();
        int pass= random.nextInt(1000,9999);
        int choose;
        int guess=0;
        boolean falg=true;
        int num;
        System.out.println("enter 1 for 20 chances, eneter 2 for 15 chanse ,enetr 3 for 10 chance , enetr 4 for suprise chances  ");
        Scanner  scanner = new Scanner(System.in);
        choose=scanner.nextInt();
        while (falg)
        {
            switch (choose) {
                case 1:
                    guess = 20;
                    falg=false;
                    break;
                case 2:
                    guess = 15;
                    falg=false;
                    break;
                case 3:
                    guess = 10;
                    falg =false;
                    break;
                case 4:
                    guess = random.nextInt(5, 25);
                    falg=false;
                    break;
                default:
                    System.out.println("uncorrect number choose 1-4") ;
                    choose=scanner.nextInt();


            }
        }
        int correcrt;
        boolean good;
        for (int i=0;i<guess;i++)
        {
            System.out.println("Enter password");
            num=scanner.nextInt();
            correcrt=validpas(num);
            good=nottwice(num);
            if(!good)
            {
                guess = guess-2;
            }
            if(good&&correcrt==1)
            {
                guss(pass,num);
            }
            else
            {
                System.out.println("uncorrect number ") ;
            }

        }
    }

   public static void guss(int pas,int num)
    {
        int num1=num;
        for(int i=0;i<4;i++)
        {
            num=num1;
            for(int j=0;j<4;j++)
            {
                if(pas%10==num%10)
                {
                    if(i==j)
                    {
                        System.out.println("nihush medoyak");
                        break;
                    }
                    else
                    {
                        System.out.println("nihush  not medoyak");
                        break;
                    }
                } else
                {
                    System.out.println("lo nihashta");
                }
                num =num/10;
            }
            pas=pas/10;
        }


    }

  public static  int validpas(int num)
    {
        int count=1;
        boolean bl=true;
        while(bl&&num>0)
        {
            if(num%10<1||num%10>6)
            {
                bl=false;
                return -1;
            }
            num=num/10;
            count++;
        }
        if (bl&&count==4)
        {
            return 1;
        }
        return  -1;
    }

    public static  boolean nottwice (int num)
    {
        int a=num%10;
        num=num/10;
        int b=num%10;
        num=num/10;
        int c=num%10;
        num=num/10;
        int d=num%10;
        num=num/10;
        if(a==b||a==c||a==d)
            return false;
        if(b==c||b==d)
            return false;
        if(c==d)
            return false;
        return true;
    }




}


