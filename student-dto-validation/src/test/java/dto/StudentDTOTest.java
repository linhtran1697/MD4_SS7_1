package dto;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDTOTest {
    @Test
    void validStudentShouldPass() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            Validator validator = factory.getValidator();
            assertTrue(validator.validate(new StudentDTO("Nguyen Van A", "Information Technology")).isEmpty());
        }
    }

    @Test
    void blankFullNameAndMajorShouldFail() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            Validator validator = factory.getValidator();
            assertEquals(2, validator.validate(new StudentDTO("  ", "  ")).size());
        }
    }

    @Test
    void fullNameOutOfRangeShouldFail() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            Validator validator = factory.getValidator();
            assertFalse(validator.validate(new StudentDTO("Abcd", "IT")).isEmpty());
            assertFalse(validator.validate(new StudentDTO("A".repeat(101), "IT")).isEmpty());
        }
    }
}
