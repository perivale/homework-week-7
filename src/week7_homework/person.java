package week7_homework;

public class person {       //instance variable
    String firstname;
    String lastname;
    int age;

    public String getFirstName() {      //createing fristname method
        return firstname;
    }

    public String getLastName() {       //creating lastname method
        return lastname;
    }

    public int getAge() {           //creating age method
        return age;
    }

    public void setFirstName(String firstName) {        //creating with parameters method
        this.firstname = firstName;
    }

    public void setLastName(String lasrName) {          //creating with parameters method
        this.lastname = lastname;
    }

    public void setAge(int age) {                       //creating with parameters method
        this.age = age;

        if (age <= 0 || age >= 100) {           //parameter
            this.age = 0;
        }
    }

    public boolean isTeen() {           //creating boolean method
        int a = this.age;
        boolean r;
        if (a > 12 && a < 20) {
            r = true;
        } else {
            r = false;
        }
        return r;
    }

    public String getFullName() {               //creating string method
        String fullname;
        String xyz;
        if (firstname.isEmpty() == lastname.isEmpty() == true) {
            xyz = " ";
        } else {
            xyz = firstname.concat(lastname);

        }
        return xyz;
    }

    public static void main(String[] args) {            //creating main method and call method to in main method
        person person = new person();           //first name is set to empty string
        person.setFirstName(" ");           //lastname is set to empty string
        person.setLastName(" ");
        System.out.println("getfirstname =" + person.getFirstName());
        System.out.println("getlastname =" + person.getLastName());
        System.out.println("full name with empty string");
        System.out.println("fullname=" + person.getFullName());
        person.setAge(10);          //age
        System.out.println("teen=" + person.isTeen());
        System.out.println("age" + person.getAge());
        person.setFirstName("john");            //frist name set to john
        person.setAge(18);
        System.out.println("result of age is teen between 12 to 20");
        System.out.println("fullname=" + person.getFullName());
        System.out.println("teen=" + person.getLastName());
        person.setLastName("smith");                    //last name to set smith
        System.out.println("fullname=" + person.getFullName());


    }

}