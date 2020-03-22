//Parent Class
package Inheritance;

public class Department {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected double salary;

    public Department(String employeeName,
                      int employeeId, String position,
                      double salary)

    {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }
    Department(){
        this.employeeName="temp";
        this.employeeId=999;
        this.position="intern";
        this.salary=1000;
    }

    public void chagePosition(String newPosition){
        this.position=newPosition;
    }
    public void riseSlary(double increase){
        this.salary=increase;
    }

    @Override
    public String toString() {
        return "Department{" +
                "emplyeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
