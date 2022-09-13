import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList =new ArrayList<>();
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Beijing");
        cityList.add("Shanghai");
        cityList.add("Seoul");
        cityList.add("Changsha");

        System.out.println("List的大小"+cityList.size());
        System.out.println("Changsha是最后一个吗"+cityList.contains("Changsha"));
        System.out.println("London在列表的位置"+cityList.indexOf("London"));

        cityList.add(2,"Xian");
        System.out.println(cityList.toString());

        for(int i=cityList.size()-1;i>=0;i--){
            System.out.println(cityList.get(i)+" ");
            System.out.println();
        }

        ArrayList<Circle> list =new ArrayList<Circle>();
        list.add(new Circle(2));
        list.add(new Circle(3));

        System.out.println("圆的面积："+list.get(0).getArea());
        System.out.println("圆的面积："+list.get(1).getArea());

    }

}
