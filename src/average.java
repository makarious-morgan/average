import java.util.Scanner;
public class average
{
    public static void main (String[] args)
    {
        Scanner scanner =new Scanner(System.in) ;

        System.out.println("Enter number of students" );
        int num =scanner.nextInt();
        while (num !=0)
        {
            System.out.println("Enter  your name " );
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter  your 3 scores " );
            double score1=scanner.nextDouble();
            double score2=scanner.nextDouble();
            double score3=scanner.nextDouble();
            double avge = avg(score1,score2,score3);
            char grd = grade(avge);
            System.out.println("Name: "+name+"\n"+"average: "+avge+"\n"+"grade: "+grd  );
            num--;
        }
    }
    public static double avg (double a ,double b , double c)
    {
        return (a+b+c)/3;
    }
    public static char grade (double a)
    {
        if (a>=85)
            return 'A';
        else if (a>=70&&a<=84)
            return 'B';
        else if (a>=50&&a<=69)
            return 'C';
        else if (a<50)
            return 'F';
        return 0;
    }
}
