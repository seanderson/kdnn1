public class Kdnn {
 public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("USAGE: Kdnn fileOfDoubles");
            System.exit(-1);
        }
        ArrayList<double[]> dat = null;
        try {
            dat = load(args[0]);
            System.out.println(dat.get(0)[0]);
        } catch (Exception ex) {
            System.err.println(ex);
            System.exit(-1);
        }
    KdTree kdt = new KdTree(dat);

}

}
