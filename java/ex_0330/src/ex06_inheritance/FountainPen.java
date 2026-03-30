package ex06_inheritance;

public class FountainPen extends BallPen{
    private String color; //볼펜의 색
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}

}
