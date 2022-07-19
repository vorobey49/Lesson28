public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        {  System.out.println("Exersice 1");}
        int years = 4;
        int salary = 10000;
        int newSalary = 0;
        if (years >= 1 && years < 3) {
            System.out.println("Salary without bonus");
            newSalary = (salary + salary * 10 / 100);
            System.out.println(newSalary);
        }
        if (years >= 3) {
            System.out.println("Salary without bonus");
            newSalary = (salary + salary * 20 / 100);
            System.out.println(newSalary);}
        int newSalary1;
        if (newSalary < 4000) {
            System.out.println("Salarybonus");
            newSalary1 = (newSalary + 1000);
            System.out.println(newSalary1);
        }
        if (newSalary > 4000) {
            System.out.println("Salarybonus");
            newSalary1 = (newSalary + 500);
            System.out.println(newSalary1);
        }
        {  System.out.println("Exersice 2");}

        int age = 19;
        if(age<0)
            System.out.println("Incorrect");
        if(age>=0&&age<=18)
            System.out.println("Child");
        if(age>18)
            System.out.println("Adult");


        {  System.out.println("Exersice 3");}

        int myArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,
                34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);

    }}
