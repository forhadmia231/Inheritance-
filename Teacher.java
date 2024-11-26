
package inheritance;

public class Teacher extends Person {
    String qualification ;
    int age;
    void displayinformation2(){
        displayinfromation1();
        System.out.println("Name :"+ name);
        String age = null;
        System.out.println("Age :"+ age);
        System.out.println("Qualifaction "+qualification);
    }

    private void displayinfromation1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
