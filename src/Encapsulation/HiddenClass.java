package Encapsulation;

public class HiddenClass {

    private String job;
    private String fullName;
    private int age;

    //setter for all variables
    public void setAll(String name, int myAge, String myJob) {
        fullName = name;
        age = myAge;
        job = myJob;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;  // points to instance variable
    }

    public String getName() {
        return fullName;

    }

    public int getAge() {
        return age;
    }

    //same class in non-static method
    public static void main(String[] args) {
        HiddenClass h = new HiddenClass();
        h.setAll("Anar", 33, "engineer");
        System.out.println(h.getName());
    }


    public void myData() {
        System.out.println("My name " + fullName);
        System.out.println("My age " + age);

    }


}
