package reviewClassesObjects;

public class ClassObject {


            //these are local variables

            String empName;
            int empID;
            String group;


        void employeeDetails(){
            System.out.println("This method shows the details of the employee");


        }

   void employeeGroup() {
        System.out.println("This method shows rhe group of the employee");
    }

    public static void main(String[] args) {
            ClassObject obj= new ClassObject();
           obj.employeeGroup();
           obj.employeeDetails();


    }
}

