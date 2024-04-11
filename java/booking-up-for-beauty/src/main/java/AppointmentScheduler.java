import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        // "7/25/2019 13:45:00"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime formato = LocalDateTime.parse(appointmentDateDescription, formatter);
        return formato;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        boolean verify = appointmentDate.isBefore(LocalDateTime.now());
        return verify;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime horaActual = appointmentDate.toLocalTime();
        boolean verify = ((horaActual.equals(LocalTime.of(12, 0, 0)))
                || (horaActual.isAfter(LocalTime.of(12, 0, 0))) && horaActual.isBefore(LocalTime.of(18, 0, 0)));
        return verify;
    }

    public String getDescription(LocalDateTime appointmentDate) {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ENGLISH);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm", Locale.ENGLISH);

        // Construir el mensaje
        String datePart = appointmentDate.format(dateFormatter);
        String timePart = appointmentDate.format(timeFormatter);
        String amPmPart = appointmentDate.getHour() < 12 ? "AM" : "PM";
        String message = String.format("You have an appointment on %s, at %s %s.", datePart, timePart, amPmPart);

        return message;
    }

    public LocalDate getAnniversaryDate() {
        int actualYear = LocalDate.now().getYear();
        LocalDate inicio = LocalDate.of(actualYear, 9 , 15);
        return inicio;
    }
}
