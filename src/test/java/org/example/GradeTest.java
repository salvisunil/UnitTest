package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void FiftyNineShouldReturnF() {
        Grade grade = new Grade();
        assertEquals('F', grade.determineLetterGrade(59));
    }

    @Test
    void SixtyNineShouldReturnD() {
        Grade grade = new Grade();
        assertEquals('D', grade.determineLetterGrade(69));
    }

    @Test
    void eightyNineShouldReturnB() {
        Grade grade = new Grade();
        assertEquals('B', grade.determineLetterGrade(80));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {
        Grade grade = new Grade();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grade.determineLetterGrade(-1);
                });

    }
}

