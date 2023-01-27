public class Employeee {
    // constructor same name as class not return type
    // it creates/initialise objects in ram
    //you can use contructor block to initialiaze some default values

    int id;
    String dept;

    public Employeee(int idd, String dep) {
        id = idd;
        dept = dep;
    }

    public static void main(String[] args) {
        Employeee vro = new Employeee(20,"Machine Learning");
        System.out.println(vro.dept);
    }
}
