public class NextDayCalculator {
    public String nextDayCalculator(String dayToCalculator) {
        String [] arrayDayMonthYear = dayToCalculator.split("/");
        int day = Integer.parseInt(arrayDayMonthYear[0]);
        int month = Integer.parseInt(arrayDayMonthYear[1]);
        int year = Integer.parseInt(arrayDayMonthYear[2]);
        int firstDayOfMonth = 1;
        int lastDayOfMonth = 31;
        int firstMonth = 1;
        int lastMonth = 12;
        boolean isLeapYear = year % 4 == 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
            case 2:
                if(isLeapYear == true) lastDayOfMonth = 29;
                else  lastDayOfMonth = 28;
                break;
        }
        if(day == lastDayOfMonth) {
            day = firstDayOfMonth;
            if (month == lastMonth) {
                month = firstMonth;
                year += 1;
            }
            else month += 1;
        }
        else day += 1;
        String nextDayCalculator = day + "/" + month + "/" + year;
        return nextDayCalculator;
    }
}
