package ar.com.meli;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class SubjectTest {
    @Test
    public void testSubjectAttributes() {
        Integer age = 18;
        Integer height = 180;
        Integer weight = 80;
        Subject testSubject = new Subject(age, height, weight);
        Assertions.assertThat(testSubject.getAge()).isEqualTo(age);
        Assertions.assertThat(testSubject.getHeight()).isEqualTo(height);
        Assertions.assertThat(testSubject.getWeight()).isEqualTo(weight);
    }
}
