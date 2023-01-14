package edu.livia.secao13.ex01;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        int N; // Number of contracts
        Department department = new Department();
        Worker worker = new Worker();

        System.out.print("Enter department's name: ");
        department.setName(read.nextLine());
        worker.setDepartment(department);

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        worker.setName(read.nextLine());
        System.out.print("Level: ");
        worker.setLevel(WorkerLevel.valueOf(read.nextLine()));
        System.out.print("Base Salary: ");
        worker.setBaseSalary(read.nextDouble());

        System.out.print("How many contracts to this worker?: ");
        N = read.nextInt();

        for(int i=0; i<N; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = dateFormat.parse(read.next());
            System.out.print("Value per hour: ");
            Double valuePerHour = read.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = read.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateIncome = read.next();
        Integer month = Integer.parseInt(dateIncome.substring(0, 2));
        Integer year = Integer.parseInt(dateIncome.substring(3));
        Double income = worker.income(year, month);

        // Output
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + dateIncome + ": " + String.format("%.2f", income));

    }
}
