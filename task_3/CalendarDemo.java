package part_5.task_3;


import java.time.Month;

/*
Создать класс Календарь с внутренним классом,
с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
*/
 class CalendarDemo {
    public static void main(String[] args) {
        /*
        на январь 2022
        */
        MyCalendar.DayOff dayOff1=new MyCalendar(Month.JANUARY,1).new DayOff();
        MyCalendar.DayOff dayOff2=new MyCalendar(Month.JANUARY,2).new DayOff();
        MyCalendar.DayOff dayOff3=new MyCalendar(Month.JANUARY,7).new DayOff();
        MyCalendar.DayOff dayOff4=new MyCalendar(Month.JANUARY,8).new DayOff();
        MyCalendar.DayOff dayOff5=new MyCalendar(Month.JANUARY,9).new DayOff();
        MyCalendar.DayOff dayOff6=new MyCalendar(Month.JANUARY,15).new DayOff();
        MyCalendar.DayOff dayOff7=new MyCalendar(Month.JANUARY,16).new DayOff();
        MyCalendar.DayOff dayOff8=new MyCalendar(Month.JANUARY,22).new DayOff();
        MyCalendar.DayOff dayOff9=new MyCalendar(Month.JANUARY,23).new DayOff();
        MyCalendar.DayOff dayOff10=new MyCalendar(Month.JANUARY,29).new DayOff();
        MyCalendar.DayOff dayOff11=new MyCalendar(Month.JANUARY,30).new DayOff();

        MyCalendar day1=new MyCalendar(Month.JANUARY,3);
        MyCalendar day2=new MyCalendar(Month.JANUARY,4);
        MyCalendar day3=new MyCalendar(Month.JANUARY,5);
        MyCalendar day4=new MyCalendar(Month.JANUARY,6);
        MyCalendar day5=new MyCalendar(Month.JANUARY,10);
        MyCalendar day6=new MyCalendar(Month.JANUARY,11);
        MyCalendar day7=new MyCalendar(Month.JANUARY,12);
        MyCalendar day8=new MyCalendar(Month.JANUARY,13);
        MyCalendar day9=new MyCalendar(Month.JANUARY,14);
        MyCalendar day10=new MyCalendar(Month.JANUARY,17);
        MyCalendar day11=new MyCalendar(Month.JANUARY,18);
        MyCalendar day12=new MyCalendar(Month.JANUARY,19);
        MyCalendar day13=new MyCalendar(Month.JANUARY,20);
        MyCalendar day14=new MyCalendar(Month.JANUARY,21);
        MyCalendar day15=new MyCalendar(Month.JANUARY,24);
        MyCalendar day16=new MyCalendar(Month.JANUARY,25);
        MyCalendar day17=new MyCalendar(Month.JANUARY,26);
        MyCalendar day18=new MyCalendar(Month.JANUARY,27);
        MyCalendar day19=new MyCalendar(Month.JANUARY,28);
        MyCalendar day20=new MyCalendar(Month.JANUARY,31);

        System.out.println(day2.toString());
        System.out.println(dayOff7.toString());
        System.out.println(day13.toString());
        System.out.println(dayOff6.toString());
    }
}
