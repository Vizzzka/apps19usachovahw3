package ua.edu.ucu;


// import com.sun.org.apache.xpath.internal.operations.Bool;

class Student{

    private double GPA;
    private int year;
    private String name;
    private String surname;

    public Student(String name, String surname, double GPA, int year) {
        this.GPA = GPA;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname + ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object o2){
        if (!(o2 instanceof Student))
            return false;
        return this.name.equals(((Student)o2).name) && this.surname.equals(((Student)o2).surname);
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + this.surname.hashCode();
    }

}
