class Doctor {
    void Doctor_Details() {
     System.out.println("Doctor Details...");
    }

    void DriveCar() {
        String car = getCar();
        System.out.println("Driving"+car);

    }

    String getCar() {
        return "BMW";
    }
   }
   
   class Surgeon extends Doctor {
    void Surgeon_Details() {
     System.out.println("Surgen Detail...");
    }

    String getCar() {
        return "Honda";
    }    

   }
   
   public class Hospital {
    public static void main(String args[]) {
     Surgeon s = new Surgeon();
     s.Doctor_Details();
     s.Surgeon_Details();
     s.DriveCar();
    }
   }
   