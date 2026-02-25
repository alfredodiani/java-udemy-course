package Sessao11_Data_hora.a37_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println("LocalDate = " + d01);
        System.out.println("LocalDateTime = " + d02);
        System.out.println("Instant =  " + d03);  //GMT

        LocalDate d04 = LocalDate.parse("2026-02-15");
        System.out.println("LocalDate from string = " + d04 );

        LocalDateTime d05 = LocalDateTime.parse("2026-02-02T16:34:30");
        System.out.println("LocalDateTime from string = " + d05);

        Instant d06 = Instant.parse("2026-02-02T16:36:25.457896Z");
        System.out.println("Instant from string = " + d06);

        Instant d07 = Instant.parse("2026-02-02T10:00:00.1000-03:00");
        System.out.println("Instant different timezone from string = " + d07);


        //Date from custom formatter
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("01/12/2010", fmt1);
        System.out.println("Date from formater: " + d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d09 = LocalDateTime.parse("01/12/2010 14:30:05", fmt2);
        System.out.println("Date from formater: " + d09);

        LocalDate d10 = LocalDate.of(2025,10,29);
        System.out.println("Date of separate data: " + d10);

        LocalDateTime d11 = LocalDateTime.of(2010,10,26,13,55);
        System.out.println("DateTime of separate data: " + d11);


        //Format Date-Time to Custom strings

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println("d04 = " + d04.format(fmt3));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));


        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        System.out.println("d05 = " + d05.format(fmt3));
        System.out.println("d05 = " + d05.format(fmt4));


        //printing an Instant on custom format

        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d06 = " + fmt5.format(d06));


        //using ready-to-use formaters

        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d06 = " + fmt6.format(d06));
        System.out.println(("d06 = " + d06.toString()));

    }
}
