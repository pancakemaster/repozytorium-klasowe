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
    Segment segmentalny = new Segment();
    segmentalny.obiekt1.x = 5.6;
    segmentalny.obiekt1.y = 5.1;
    segmentalny.obiekt2.x = 3.1;
    segmentalny.obiekt2.y = 4.1;
    segmentalny.lenght(segmentalny);
    System.out.println(segmentalny.lenght(segmentalny));






    }
}