package Name;

/**
 * Created by vaisakh on 01/06/17.
 */
public class Name {

    private String first;
    private String middle;
    private String last;


    public Name(String f, String l, String m)
    {
        first = f;
        middle = m;
        last = l;

    }

    public  String toString()
    {
        return first + " " + middle + " " + last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
