package Sessao11_Data_hora.a40_date_legado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //por padrão as datas são impressas no fuso horário da máquina local então vamos criar um sdf para imprimir
        // no horário GMT
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //configura o sdf3 para imprimir no horário GMT


        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        Date x1 = new Date(); //cria com a data atual
        Date x2 = new Date(System.currentTimeMillis()); //outra maneira de criar com a data atual
        Date x3 = new Date(0L); //cria passando 0 milissegundos
        Date x4 = new Date(1000L * 60 * 60 * 5); //cria uma data passando 5 horas em milissegundos

        Date y3 = Date.from(Instant.parse("2026-03-03T09:00:32Z"));

        System.out.println("------------------------");
        System.out.println("No horário do sistema local");
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

        System.out.println("y1 formated = " + sdf2.format(y1));
        System.out.println("y2 formated = " + sdf2.format(y2));

        System.out.println("x1 = " + sdf2.format(x1));
        System.out.println("x2 = " + sdf2.format(x2));
        System.out.println("x3 = " + sdf2.format(x3));
        System.out.println("x4 = " + sdf2.format(x4));

        System.out.println("y3 = " + sdf2.format(y3));

        System.out.println("------------------------");
        System.out.println("No horario de GMT");

        System.out.println("y1 formated = " + sdf3.format(y1));
        System.out.println("y2 formated = " + sdf3.format(y2));
        System.out.println("x1 = " + sdf3.format(x1));
        System.out.println("x2 = " + sdf3.format(x2));
        System.out.println("x3 = " + sdf3.format(x3));
        System.out.println("x4 = " + sdf3.format(x4));
        System.out.println("y3 = " + sdf3.format(y3));

    }
}
