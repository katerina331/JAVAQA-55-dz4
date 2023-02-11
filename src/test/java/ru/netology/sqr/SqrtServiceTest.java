package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SqrtServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200, 300, 3",
            "100, 9801, 88",
            "122, 143, 0",
            "0, 1000, 22",
            "1, 100, 0",
            "9802, 10000, 0"
    })
    public void testSearchSqrtInexact(long minSQ, long maxSQ, long expected) {
        SQRService service = new SQRService();

        long actual = service.calcSqrtRange(minSQ, maxSQ);

        Assertions.assertEquals(expected, actual);
    }
}
