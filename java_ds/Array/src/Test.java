
public class Test {
    public static void main(String[] args) {
        double[] r = new double[100];
        for(int i=0;i<r.length;i++){
            r[i] = Math.random()*10;
            System.out.println(r[i]);
        }
    }
}
