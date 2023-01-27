//Sanidhya Sharma
//12016372
// dynamic polymorphism overriding
abstract class Doctor {
    abstract void treatPatient();
}

class Physician extends Doctor {

    @Override
    void treatPatient() {
        System.out.println("im Physician");
    }
}

class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("im surgeon");
    }
}
public class polyoverload {
    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("press 1 for Physician 2 for surgeon");
        int choice = new java.util.Scanner(System.in).nextInt();
        Doctor doc;

        switch (choice) {
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }
}