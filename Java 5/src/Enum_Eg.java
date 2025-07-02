public class Enum_Eg {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        Month thisMonth = Month.JUNE;
        Gender gender = Gender.MALE;
    }
}

enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

enum Gender {MALE, FEMALE, NA}
