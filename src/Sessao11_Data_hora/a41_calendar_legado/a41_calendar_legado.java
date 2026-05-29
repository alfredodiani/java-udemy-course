package Sessao11_Data_hora.a41_calendar_legado;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class a41_calendar_legado {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2026-03-03T10:15:00Z"));

        System.out.println("d = " + sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println("d atualizado = " + sdf.format(d));

        //pegar partes da data pelo calendar
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); //precisa adicionar 1 pois o mês inicial para o calendar é janeiro com índice zero

        System.out.println("minutes: " + minutes);
        System.out.println("month: " + month);

    }
}
