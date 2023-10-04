public class LinearEquation {
    private int point1_x;
    private int point1_y;
    private int point2_x;
    private int point2_y;
    private String slope;
    private double numSlope;
    private String form;
    private double yIntercept;

    public LinearEquation(int x1, int x2, int y1, int y2)
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
    }

    void yInt()
    {
        numSlope = (point2_y - point1_y) / (point2_x - point1_x);
        double yIntercept = -1 * (numSlope * point2_x);
    }

    void form()
    {
        String form = slope + "x " + "+ " + yIntercept;
    }

    public String toString()
    {
       String s = "First Pair: (" + point1_x + "," +  point1_y + ") \n"
               + "Second Pair: (" + point2_x + ", " + point2_y + ") \n"
               + "Slope of line: " + numSlope;
       return s;
    }
}
