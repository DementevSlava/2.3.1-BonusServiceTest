import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    // 1. Первый тест
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку
        assertEquals(expected, actual);
    }

    // 2. второй тест
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку
        assertEquals(expected, actual);
    }

    // 3. третий тест
    @org.junit.jupiter.api.Test
    void shouldCalculateForNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку
        assertEquals(expected, actual);
    }

    // 4. четвертый тест
    @org.junit.jupiter.api.Test
    void shouldCalculateForNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //производим проверку
        assertEquals(expected, actual);
    }
}