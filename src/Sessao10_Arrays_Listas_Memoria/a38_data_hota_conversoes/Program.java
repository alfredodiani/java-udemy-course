package Sessao10_Arrays_Listas_Memoria.a38_data_hota_conversoes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2005-05-21");
        LocalDateTime d05 = LocalDateTime.parse(("1998-09-28T20:30:00"));
        Instant d06 = Instant.parse("2023-03-18T06:00:00Z");

        for (String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

        //convertendo um instant para uma data local no fuso do systema operacional
        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime

        System.out.println("r1 = " +  r1);
        System.out.println("r2 = " +  r2);
    }
}
