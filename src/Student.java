public class Student {

    //COMPLETE THIS CLASS BEFORE MathStudent and ScienceStudent classes as they will be subclasses of Student class

    public Student() {}


    //HERE! Create a 5 args constructor

    public Student(String firstName, String lastName, int age, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    /*
    HERE!
    Create private instance variables as below
    firstName
    lastName
    age
    gender
    className
    NOTE: only age will be int and others are String
     */

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String className;


    /*
    HERE!
    Provide public getter method for className only
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    /*
        HERE!
        Override toString() method that returns Student object information
        It should be dynamic considering child classes that inherits
     */

    @Override
    public String toString() {
        if (className.equalsIgnoreCase("MATH")) {
            return "MathStudent{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", className='" + className + '\'' +
                    '}';
        }
        else return "ScienceStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
