import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        long max = 300;
        long min = 200;
        long expected = 3;
        long actual = service.calcSqrtRange(min, max);
        System.out.println(actual + "<=>" + expected);
    }
}
