package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testSearchSqrtInexact(long minSQ, long maxSQ, long expected) {
        SQRService service = new SQRService();

        long actual = service.calcSqrtRange(minSQ, maxSQ);

        Assertions.assertEquals(expected, actual);
    }
}
