package edu.livia.secao11;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args){
        // 11.1 - Instanciação
        System.out.println("------------------------------------------------------------");
        System.out.println("11.1 - Instanciação");

        // Data (agora) -> Data-hora
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date/time right now: " + dateTime);

        Instant globalDateTime = Instant.now();
        System.out.println("Date/time in London right now: " + globalDateTime);

        // Texto ISO 8601 -> Data-hora
        LocalDateTime birthDate = LocalDateTime.parse("2003-04-03T19:23");
        System.out.println("I was born on " + birthDate);

        // Texto formato customizado -> Data-hora
        DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate college = LocalDate.parse("25/03/2022", fmtDate);
        System.out.println("I got accepted in college on " + college);

        // dia, mês, ano, [horário] -> Data-hora local
        LocalDateTime algorithm = LocalDateTime.of(2023, 1, 3, 18, 45);
        System.out.println("I am building this algorithm at " + algorithm);
        System.out.println();

        // 11.2 - Formatação
        System.out.println("------------------------------------------------------------");
        System.out.println("11.2 - Formatação\n");

        DateTimeFormatter fmtTime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter fmtDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmtDateTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmtWrittenMonth = DateTimeFormatter.ofPattern("MMM dd, yyyy");

        System.out.println("Right now, it's " + fmtDateTimeZone.format(globalDateTime) + " where I live");
        System.out.println("I was born on " + birthDate.format(fmtWrittenMonth) + " at " + birthDate.format(fmtTime));
        System.out.println("I was building this algorithm at " + algorithm.format(fmtDateTime));

        System.out.println();

        // 11.3 - Operações com Data-Hora
        System.out.println("------------------------------------------------------------");
        System.out.println("11.3 - Operações com Data-Hora\n");

        // Converter data-hora global para local
        int availableZoneIds = 0;
        for (String timeZone: ZoneId.getAvailableZoneIds()) {
            //System.out.println(timeZone); // These are the time zones available
            availableZoneIds++;
        }
        System.out.println("There are " + availableZoneIds + " different available time zones.");

        LocalDateTime nowLosAngeles = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Los_Angeles"));
        System.out.println("It's currently " + nowLosAngeles.format(fmtDateTime) + " in L.A.");

        Duration timeDifference = Duration.between(LocalDateTime.now(), nowLosAngeles);
        System.out.println("There is a " + timeDifference.toHours() + " hours difference between where I live and L.A.");

        System.out.println();
    }
}
