package edu.livia.secao14.ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private final Date MANUFACTURE_DATE;

    public UsedProduct(String name, Double price, Date manufactureDate){
        super(name, price);
        this.MANUFACTURE_DATE = manufactureDate;
    }

    @Override
    public String priceTag(){
        return name + " (used) $" + String.format("%.2f", price)
                + " (Manufacture date: " + dateFormat.format(MANUFACTURE_DATE) + ")";
    }

}
