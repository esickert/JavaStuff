public class Student    {
    private int id;
    private Birthdate birthdate;

    public Student(int ssn, int year, int month, int day)   {
        id = ssd;
        birthdate = new Birthdate(year, month, day);
    }

    public int getId()  {
        return id;
    }

    public BirthDate getBirthDate()  {
        return birthDate;
    }
} // end of class Student

public class BirthDate  {
    private int year;
    private int month;
    private int day;

    public BirthDate(int newYear, int newMonth, int newDay) {
        year = newYear;
        month = newMonth;
        day = newDay;
    } // end of method BirthDate

    public void setYear(int newYear)    {   
        year = newYear;
    } // end of setYear

} // end of class BirthDate


