package edu.livia.secao18.contracts.services;

import edu.livia.secao18.contracts.entities.Contract;
import edu.livia.secao18.contracts.entities.Installment;

import java.time.LocalDate;
import java.util.List;

public class ContractService {
    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getAmountPerInstallment(months);

        for(int i=1; i <= months; i++){
            // Generate a date for the installment
            LocalDate dueDate = contract.getDate().plusMonths(i);

            // Calculate the quota of each installment
            double interest = paymentService.interest(basicQuota, i);
            double fee = paymentService.paymentFee(basicQuota + interest);
            double quota =  basicQuota + interest + fee;

            contract.addInstallment(new Installment(dueDate, quota));
        }
    }

}
