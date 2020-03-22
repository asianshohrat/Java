package Inheritance;

public class DepartmentTest {

        public static void main (String[]args){
            Department myEmp = new Department("Rumeysa", 123, "QA", 120000);
            System.out.println(myEmp.toString());
            ITDepartment myIt = new ITDepartment("mehmet", 124, "Testing", 120000, "Selenium");
            System.out.println(myIt.toString());
            myIt.addSkillSet("SQL");
            System.out.println(myIt.toString());
            AccountingDepartment myAcc = new AccountingDepartment("inci",125,"QA",120000,17 );
            System.out.println(myAcc.toString());
            myAcc.addExperienceYears(2);
            System.out.println(myAcc.toString());
        }
    }
