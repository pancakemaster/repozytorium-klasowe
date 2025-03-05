public class Point {
    double x;
    double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public String toSvg(){
        return "<svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">\n"+
                "<circle r=\"45\" cx=\"50\" cy=\"50\" fill=\"red\" />\n"+
                "</svg>";
    }
    public void translate(double dx, double dy){
        x+=dx;
        y+=dy;
    }
    public Point translated(double dx, double dy) {
        Point punkt = new Point();

        punkt.x=x+dx;
        punkt.y=y+dy;
        return punkt;
    }



}
