package part_5.task_3;


import java.time.Month;

/*
Создать класс Календарь с внутренним классом,
с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
*/
class MyCalendar {
    final static int year = 2022;
    Month month;
    int day;

    public MyCalendar(Month month, int day) {
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Year " + year + " ");
        string.append("Month " + month + " ");
        string.append("Day " + day + " ");
        string.append("This is working day");
        return string.toString();
    }

    class DayOff {
        final static String dayOff = "This is day off";
        @Override
        public String toString() {
            StringBuilder string = new StringBuilder();
            string.append("Year " + year + " ");
            string.append("Month " + month + " ");
            string.append("Day " + day + " ");
            string.append(dayOff);
            return string.toString();
        }
    }
}
