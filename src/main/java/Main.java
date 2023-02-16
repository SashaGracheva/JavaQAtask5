import ru.netology.sq.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcNumbersSquaredInRange(200, 300));
    }
}