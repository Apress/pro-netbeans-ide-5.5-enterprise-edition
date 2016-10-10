
public class NewHire {


    public static void main(String[] args) {

        Employee newemp = new Employee();
        newemp.FirstName = args[0];
        newemp.LastName = args[1];
        saveEmployee(newemp);
    }


}