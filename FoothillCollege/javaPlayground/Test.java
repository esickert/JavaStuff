public class Test   {
    public static void main(String[] aregs) {
        Student student = new Student(123, 1970,5, 3);
        Birthdate date = student.getBirthDate();
        date.setYear(2010); //student birth year changed
    }
}
