import java.util.Scanner;
public class GradeTracker {
    static void avg(int n, double[] marks){
        double sum = 0, high = 0, low = 100;

        for (int i = 0; i < n; i++) {
            sum += marks[i];
            if(marks[i] > high){
                high = marks[i];
            }
            if (marks[i] < low){
                low = marks[i];
            }
        }
        System.out.println("Average Score: "+ (sum/n));
        System.out.println("Highest Score: "+ high);
        System.out.println("Lowest Score: "+ low);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n========== Student Grade Tracker ===========");
        System.out.print("Enter Number of Students: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];

        for (int i=0; i < n; i++){
            System.out.print("\nEnter Name of Students "+(i+1)+":");
            names[i] = scanner.next();
            System.out.print("Enter marks of "+names[i]+":");
            marks[i] = scanner.nextDouble();
//            if(marks[i] < 0 || marks[i] > 100){
//                System.out.println("The Marks Range should be between 0 and 100");
//                break;
//            }
        }

        System.out.println("\n========== Student Grade Report ===========");
        System.out.println("S.No\tName\tMarks");
        System.out.println("------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"\t\t"+names[i]+"\t"+marks[i]);
        }
        System.out.println("------------------------");
        avg(n, marks);
//        System.out.println("Average Score:"+avg(marks));
//        System.out.println("");
    }
}