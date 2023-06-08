package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource(

            value = {
                    "4 5 7 1 3;7 1",
                    "6 3 -2 7 9;9 -2",
                    "3 7 4 8 -2 -5;8 -5"

            },
            delimiter = ";"
    )
    void isStringFiltertHighestAndLowest(String input, String expected){
        //GIVEN
        String actual = Main.highAndLow(input);

        assertEquals(expected,actual);

    }

}