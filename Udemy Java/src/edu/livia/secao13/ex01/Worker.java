package edu.livia.secao13.ex01;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Composition: a worker is associated with 1 department and multiple contracts
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    void addContract(HourContract contract){
        contracts.add(contract);
    }

    void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        Double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int contractsYear = calendar.get(Calendar.YEAR);
            int contractsMonth = 1 + calendar.get(Calendar.MONTH); // The Calendar's month starts on 0, so we add 1

            if(year == contractsYear && month == contractsMonth){
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
