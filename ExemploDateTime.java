// Date and Time API

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ExemploDateTime {
    public static void main(String[] args) {
        // Exemplo 1: Usando LocalDate para representar apenas a data
        LocalDate dataAtual = LocalDate.now();  // Data atual
        System.out.println("Data Atual: " + dataAtual);

        // Exemplo 2: Usando LocalTime para representar apenas o horário
        LocalTime horaAtual = LocalTime.now();  // Hora atual
        System.out.println("Hora Atual: " + horaAtual);

        // Exemplo 3: Usando LocalDateTime para combinar data e hora
        LocalDateTime dataHoraAtual = LocalDateTime.now();  // Data e hora atual
        System.out.println("Data e Hora Atual: " + dataHoraAtual);

        // Exemplo 4: Usando ZonedDateTime com fuso horário
        ZonedDateTime dataHoraComFuso = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e Hora com Fuso Horário: " + dataHoraComFuso);

        // Exemplo 5: Formatando a data para um formato específico
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatador);
        System.out.println("Data Formatada: " + dataFormatada);
    }
}