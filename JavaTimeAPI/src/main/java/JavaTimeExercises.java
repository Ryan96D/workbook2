import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class JavaTimeExercises {
    static Scanner scanny = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(LocalDate.now()); //1--------
        System.out.println(LocalDate.of(2025,12,25)); //2------------
        System.out.println("Enter a date in yyyy-MM-dd"); //3--------
        String input = scanny.nextLine();
        LocalDate parsedDate = LocalDate.parse(input);
        System.out.println(parsedDate);
        System.out.println(LocalTime.now()); //4------
        System.out.println(LocalTime.of(15,30)); //5------
        System.out.println("Hour: "+LocalTime.now().getHour()); //6--------
        System.out.println("Minute: "+LocalTime.now().getMinute());
        System.out.println(LocalDate.now().atTime(LocalTime.now())); //7------
        System.out.println(LocalDateTime.now()); //8-------
        System.out.println(LocalDate.now().plusWeeks(1)); //9-------
        System.out.println(LocalDate.now().minusDays(3)); //10---------
        System.out.println(LocalTime.now().plusHours(2).plusMinutes(15)); //11-----------
        System.out.println(LocalDateTime.now().plusDays(1)); //12-------------
        String date = "2025-04-01"; //13-----------
        System.out.println(LocalDate.parse(date));
        String time = "09:30"; //14-------------
        System.out.println(LocalTime.parse(time));
        String dateTime = "2025-04-01T09:30"; //15-----------
        System.out.println(LocalDateTime.parse(dateTime));
        DateTimeFormatter ddMMMyyyy = DateTimeFormatter.ofPattern("dd/MMM/yyyy"); //16------------
        System.out.println(LocalDate.now().format(ddMMMyyyy));
        DateTimeFormatter hHmm = DateTimeFormatter.ofPattern("HH:mm"); //17--------------
        System.out.println(LocalTime.now().format(hHmm));
        DateTimeFormatter dateSentenceFormat = DateTimeFormatter.ofPattern("'Today is' MMMM dd, yyyy, 'at time' h:mm a"); //18----------
        System.out.println(LocalDateTime.now().format(dateSentenceFormat)); //18
        System.out.println(LocalDate.of(2024,12,12).isBefore(LocalDate.now())); //19 ----------
        System.out.println(LocalDate.of(2024,12,12).isAfter(LocalDate.now()));
        LocalDate date1 = LocalDate.of(1990,12,12);
        System.out.println(Period.between(LocalDate.of(1212,12,12),LocalDate.now())+" total time between"); //20----
        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(1212, 12, 12), LocalDate.now())+" days between");
        LocalDate date2 = LocalDate.of(1923,5,19);
        System.out.println("Period between the 2 dates: "+Period.between(date1,date2)); //21 -----------
        LocalTime time1 = LocalTime.of(14,27);
        LocalTime time2 = LocalTime.of(2,59);
        System.out.println("Time in between the 2 times: "+Duration.between(time1,time2)); //22 ----------
        System.out.println("What is your birthday? (yyyy-MM-dd)"); //23 --------------
        String birthday = scanny.nextLine();
        LocalDate parsedBirthday = LocalDate.parse(birthday);
        Period howOld = Period.between(parsedBirthday,LocalDate.now());
        System.out.println("You are "+howOld.getYears()+" years old");
        System.out.println("Give me a date of a future event (yyyy-MM-dd)"); //24 -----------
        String event = scanny.nextLine();
        LocalDate parsedEvent = LocalDate.parse(event);
        long daysUntil = ChronoUnit.DAYS.between(LocalDate.now(),parsedEvent); //ChronoUnit returns a long, not an int
        System.out.println("It is "+daysUntil+" days until this date/event!");
        DateTimeFormatter mMMMddyyyyhhmma = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm a"); //25 -----------
        System.out.println("What day we meet ? (yyyy-MM-dd)");
        System.out.println("We will be meeting again at the same time and day every week");
        String meetingDay = scanny.nextLine();
        System.out.println("And what time will we meet? (HH:mm)");
        String meetingTime = scanny.nextLine();
        String meetingDayTime = meetingDay+"T"+meetingTime;
        LocalDateTime parsedMeeting = LocalDateTime.parse(meetingDayTime);
        String formattedMeeting = parsedMeeting.format(mMMMddyyyyhhmma);
        System.out.println();
        System.out.println("We will meet again on: ");
        LocalDateTime variableDate = parsedMeeting; //sets variable date to be overwritten
        for (int i = 0; i < 4; i++ ){
            variableDate = variableDate.plusWeeks(1);
            String formattedVariableDate = variableDate.format(mMMMddyyyyhhmma); // formats the variable
            System.out.println(formattedVariableDate);
        }




    }
}
