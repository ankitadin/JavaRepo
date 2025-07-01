package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionSSort {

    public static void main(String[] args) {
        List<Point> point_list= Arrays.asList(new Point(2,3),new Point(1,7),new Point(0,11));

        //by using Stream
        point_list.stream().sorted(Comparator.comparingInt(x->x.x)).collect(Collectors.toList()).forEach(System.out::println);

        //using comparator class
       /* Collections.sort(point_list,new PintComparator());
        System.out.println(point_list);*/



    }


}
class PintComparator implements Comparator<Point>
{

    @Override
    public int compare(Point o1, Point o2) {
        return o1.x- o2.x ;
    }
}
class Point
{
     int x;
     int y;

    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
