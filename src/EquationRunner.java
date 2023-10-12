import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //User input
        System.out.print("Enter your first coordinate point: ");
        String p1 = s.nextLine();
        System.out.print("Enter your second coordinate point: ");
        String p2 = s.nextLine();


        //Finding the xy values
        String a1 = p1.substring(1, p1.indexOf(","));
        String b1 = p1.substring(p1.indexOf(",") + 1, p1.length()-1);
        String a2 = p2.substring(1, p2.indexOf(","));
        String b2 = p2.substring(p2.indexOf(",") + 1, p2.length()-1);
        int x1 = Integer.parseInt(a1);
        int y1 = Integer.parseInt(b1);
        int x2 = Integer.parseInt(a2);
        int y2 = Integer.parseInt(b2);


        //Solving
        LinearEquation line = new LinearEquation(x1, y1, x2, y2);
        line.calculateAll();
        System.out.print(line);


        //Third point
        System.out.print("Enter a third x value: ");
        String a = s.nextLine();
        double x = Double.parseDouble(a);
        System.out.print("Solved coordinate point is: " + "(" + x + "," + line.solve(x) + ")");
    }
}
