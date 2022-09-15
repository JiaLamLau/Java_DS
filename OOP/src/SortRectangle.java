import java.util.Arrays;

public class SortRectangle {
    public static void main(String[] args) {
        ComparableRectangle[] recctangles={
        new ComparableRectangle(3.4,3.5),
        new ComparableRectangle(13.4,13.5),
        new ComparableRectangle(13.4,53.5),
        new ComparableRectangle(13.4,23.5)};
      //  new ComparableRectangle(3.4,3.5);
        Arrays.sort(recctangles);
        for(Rectangle rectangle:recctangles){
            System.out.println(rectangle+" ");
            System.out.println();
        }
    }
}
