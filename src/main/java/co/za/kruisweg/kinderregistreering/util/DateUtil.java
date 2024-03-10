package co.za.kruisweg.kinderregistreering.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String getTodaysDate(){
        // Get today's date
        LocalDate today = LocalDate.now();

        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        // Format today's date using the formatter
        String formattedDate = today.format(formatter);

        // Return the formatted date
        return formattedDate;
    }

}
