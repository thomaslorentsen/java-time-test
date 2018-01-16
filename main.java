import java.util.Calendar;

public class main
{
    public static void main(String[] args) {
        System.out.println("hello world");

        int seconds = Calendar.getInstance().get(Calendar.SECOND);

        System.out.println("seconds now: " + seconds);
    }
}