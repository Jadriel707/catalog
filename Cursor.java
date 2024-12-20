public class Cursor {
    private static int x;
    private static int y;


    public static void uptadePos(int mx, int my) {
        x = mx-8;
        y = my-32;
    }

    public static int x() {
        return x;
    }

    public static int y() {
        return y;
    }

    public static boolean insideRect(int rx, int ry, int rw, int rh) {
        if(x>rx && x<(rx+rw) && y>ry && y<(ry+rh))
            return true;
        return false;
    }

    public static boolean insideRect(MyRect r) {
        if(x>r.getX() && x<(r.getX()+r.getWidth()) && y>r.getY() && y<(r.getY()+r.getHeight()))
            return true;
        return false;
    }

    public static String stringPosition() {
        return "("+Cursor.x+","+Cursor.y+")";
    }
}
