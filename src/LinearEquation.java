
public class LinearEquation {
    private int point1_x;
    private int point1_y;
    private int point2_x;
    private int point2_y;
    private String slope;
    private double numSlope;
    private String form;
    private double yIntercept;
    private double distance;

    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        point1_x = x1;
        point1_y = y1;
        point2_x = x2;
        point2_y = y2;
    }

    public void calculateAll()
    {
        slope();
    }

    void slope()
    {
        int numerator = point2_y - point1_y;
        int denominator = point2_x - point1_x;
        this.slope = numerator + "/" + denominator;
        yInt();
    }

    void yInt()
    {
        numSlope = ((double)point2_y - point1_y) / ((double)point2_x - point1_x);
        yIntercept = point1_y - numSlope * point1_x;
        form();
    }

    void form()
    {
        form = slope + "x" + " + " + yIntercept;
        distance();
    }

    void distance()
    {
        distance = Math.sqrt(Math.pow(((double) point2_x - point1_x), 2) + Math.pow(((double) point2_y - point1_y), 2));
    }

    public double solve(double x)
    {
        return numSlope * x + yIntercept;
    }
    public String toString()
    {
       String s = "First Pair: (" + point1_x + "," +  point1_y + ") \n"
               + "Second Pair: (" + point2_x + "," + point2_y + ") \n"
               + "Slope of line: " + numSlope + "\n"
               + "Y - intercept: " + yIntercept + "\n"
               + "Slope intercept form: " + form + "\n"
               + "Distance between points: " + String.format("%.2f",distance) + "\n";
       return s;
    }
}
