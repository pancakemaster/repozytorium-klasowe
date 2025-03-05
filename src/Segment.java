public class Segment {
    public Point obiekt1 = new Point();
    public Point obiekt2 = new Point();

    public Segment(Point obiekt1, Point obiekt2) {
        this.obiekt1 = obiekt1;
        this.obiekt2 = obiekt2;
    }

    public double lenght(Segment fajny) {
        double finalowo = Math.sqrt(Math.pow(fajny.obiekt2.x - fajny.obiekt1.x, 2) + Math.pow(fajny.obiekt2.y - fajny.obiekt1.y, 2));
        return finalowo;
    }

    public Segment() {
    }

    ;

    public static Segment bla(Segment[] segments) {
        Segment max = segments[0];
        for(int i=1;i< segments.length;i++){
        if(max.lenght(max) < segments[i].lenght(segments[i]))
            max=segments[i];
        }

    return max;
    }
}



