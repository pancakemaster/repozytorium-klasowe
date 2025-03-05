//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Point fajny = new Point();
    fajny.x = 5.0;

    fajny.y = 4.0;
    System.out.println(fajny.x + " " + fajny.y);
    System.out.println(fajny.toString());

    System.out.println(fajny.toSvg());

    fajny.translate(2138091,318093);
    System.out.println(fajny.toString());
    fajny.translated(3113,123);
    Point fajniejszy = new Point();
    fajniejszy=fajny.translated(1412,211);
    System.out.println(fajniejszy.toString());
    Segment segmentalny = new Segment(new Point(), new Point());
    segmentalny.obiekt1.x = 5.6;
    segmentalny.obiekt1.y = 5.1;
    segmentalny.obiekt2.x = 3.1;
    segmentalny.obiekt2.y = 4.1;
    segmentalny.lenght(segmentalny);
    System.out.println(segmentalny.lenght(segmentalny));

    Segment[] okay= new Segment[3];
    okay[0]= new Segment(new Point(0,0),new Point(0,0));
    okay[1]= new Segment(new Point(1,5),new Point(4,7));
    okay[2]= new Segment(new Point(2,6),new Point(3,8));
    Segment nazwa = Segment.bla(okay);
    System.out.println (nazwa.lenght());






    }
}