import java.util.function.IntConsumer;

/**
 * Author:https://docs.oracle.com/javase/tutorial/collections/streams/reduction.html
 * Created at:2022/6/23
 * Updated at:
 **/
class Averager implements IntConsumer
{
    private int total = 0;
    private int count = 0;

    public double average() {
        return count > 0 ? ((double) total)/count : 0;
    }

    public void accept(int i) { total += i; count++; }
    public void combine(Averager other) {
        total += other.total;
        count += other.count;
    }
}