package Sessao11_Data_hora.a39_calculos_com_data_hora;

import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse(("2022-07-20T01:30:26"));
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");


        //LocalDate
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate pastWeekLocalDate2 = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextWeekLocalDate2 = d04.plusWeeks(1);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("pastWeekLocalDate2 = " + pastWeekLocalDate2);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("nextWeekLocalDate2 = " + nextWeekLocalDate2);

        //LocalDateTime
        LocalDateTime pastDecadeLocalDateTime = d05.minusYears(10);
        LocalDateTime nextDecadeLocalDateTime = d05.plusYears(10);

        System.out.println("pastDecadeLocalDateTime = " + pastDecadeLocalDateTime);
        System.out.println("nextDecadeLocalDateTime = " + nextDecadeLocalDateTime);

        //Instant
        Instant nextHourInstant = d06.plus(1, ChronoUnit.HOURS);
        Instant previousHourInstant = d06.minus(1, ChronoUnit.HOURS);

        System.out.println("nextHourInstant = " + nextHourInstant);
        System.out.println("previousHourInstant = " + previousHourInstant);

        //calculo de durações
        Duration t1 = Duration.between(pastDecadeLocalDateTime, d05);
        Duration t2 = Duration.between(pastWeekLocalDate, d04);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());

    }




}
