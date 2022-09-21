package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set의 size 메서드 학습 테스트")
    void sizeTest() {
        assertThat(numbers).hasSize(3);
    }

    @Test
    @DisplayName("Set의 contains 메서드 학습 테스트")
    void containsTest() {
        assertThat(numbers).contains(1, 2, 3);
    }

    @ParameterizedTest(name = "@ParameterizedTest와 @CsvSource 학습 테스트")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void name(int input, boolean result) {
        assertThat(numbers.contains(input)).isEqualTo(result);
    }
}
