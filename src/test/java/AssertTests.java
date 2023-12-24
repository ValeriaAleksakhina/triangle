import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api. *;

public class AssertTests {
    // тут вообще хуй знает, что писать. Я хочу сказать, что если getTrue получил true - значит это треугольник и тест проходит
    // а если getTrue получил false, то тест должен упасть
    @Test
    @DisplayName("Проверка на треугольник")
    void isTriangle() {
        //given
        final boolean triangle;
        //when
        final boolean = getTrue();
        //then
        Assertions.assertTrue(getTrue());

    }
    private boolean getFalse() {
        return false;
    }

    private boolean getTrue() {
        return true;
    }

}
