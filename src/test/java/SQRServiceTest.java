import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sq.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rangesfortests")
    public void shouldCalculateNumbersSquaredInRange(int expected, int limit1, int limit2) {
        SQRService service = new SQRService();

        int actual = service.calcNumbersSquaredInRange(limit1, limit2);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}