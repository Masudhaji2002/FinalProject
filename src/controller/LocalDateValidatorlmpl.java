package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateValidatorlmpl implements LocalDateValidator {
    private DateTimeFormatter dateTimeFormatter;

    public LocalDateValidatorlmpl(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public boolean isValid(String dateStr) {
        try {
            LocalDate.parse(dateStr, this.dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
}