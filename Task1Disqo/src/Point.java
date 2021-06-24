public class Point {
   private int x;
   private int y;

   public Point(int x, int y){
       this.x = x;
       this.y = y;
   }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int distance(){
        return (int) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

    }
    public int distance(Point secondPoint ){

        return (int) Math.sqrt(Math.pow((secondPoint.x-this.x),2)+Math.pow((secondPoint.y - this.y),2));
    }

}


