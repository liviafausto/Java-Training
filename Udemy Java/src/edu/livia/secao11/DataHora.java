package edu.livia.secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataHora {
    public static void main(String[] args){
        // 11.1 - Instanciação
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

        // 11.2 - Formatação
        DateTimeFormatter fmtTime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter fmtDateTime = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        DateTimeFormatter fmtDateTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmtWrittenMonth = DateTimeFormatter.ofPattern("MMM dd, yyyy");

        System.out.println("\nIN CONCLUSION ( = in a pretty way):");
        System.out.println("Right now, it's " + fmtDateTimeZone.format(globalDateTime) + " where I live");
        System.out.println("I was born on " + birthDate.format(fmtWrittenMonth) + " at " + birthDate.format(fmtTime));
        System.out.println("I was building this algorithm at " + algorithm.format(fmtDateTime));

    }
}
