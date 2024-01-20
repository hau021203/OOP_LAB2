package com.mycompany.question3;
import java.util.*;
public class Question3 {

    public static void main(String[] args) {
        Question3 employee = new Question3();
        employee.InputEmployee();
        employee.OutputEmployee();
        employee.highestSalary();   
        employee.sort();
        employee.OutputEmployee();
    }
    ArrayList<Employee> em = new ArrayList<Employee>();
    Question3(){
        
    }
    public void InputEmployee(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of Employee: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            Employee e = new Employee();
            e.Input();
            em.add(e);}
    }
    public void OutputEmployee(){
         for(int i =0;i<em.size();i++){
            em.get(i).Output();
         }
    }
    public void highestSalary(){
        double max=0;
        for(int i =0;i<em.size();i++){
            max = Math.max(max,(em.get(i).getSalary()));
        }
        for(int i =0;i<em.size();i++){
            if(em.get(i).getSalary()==max){
                System.out.print("Highest salary :");
                em.get(i).Output();
                break;
            }
                
        }
        
    }
    public void sort(){
        Comparator<Employee> com  = new Comparator<Employee>(){
            public int compare(Employee e1,Employee e2){
                return  (int) ((e2.getSalary())-(e1.getSalary()));
            }
        };
        em.sort(com);
    }
}
