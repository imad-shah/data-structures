package chapter1;
public class Utils
{
    public static <E extends Measurable> double average(E[] objects)
{
    if (objects.length == 0) { return 0; }
    double sum = 0;
    for (E obj : objects)
    {
        sum = sum + obj.getMeasure();
    }
    return sum/objects.length;
}
}   