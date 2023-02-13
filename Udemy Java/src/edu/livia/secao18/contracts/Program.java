package edu.livia.secao18.contracts;

import edu.livia.secao18.contracts.entities.Contract;
import edu.livia.secao18.contracts.entities.Installment;
import edu.livia.secao18.contracts.services.ContractService;
import edu.livia.secao18.contracts.services.PaymentService;
import edu.livia.secao18.contracts.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        final DateTimeFormatter FMT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        final PaymentService PAYMENT_SERVICE = new PaypalService();
        ContractService service = new ContractService(PAYMENT_SERVICE);

        System.out.println("Enter the contract data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scan.next(), FMT_DATE);
        System.out.print("Contract's total value: ");
        double totalValue = scan.nextDouble();
        System.out.print("Enter the number of installments: ");
        int numberOfInstallments = scan.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        service.processContract(contract, numberOfInstallments);


        System.out.println("INSTALLMENTS");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        scan.close();
    }
}
