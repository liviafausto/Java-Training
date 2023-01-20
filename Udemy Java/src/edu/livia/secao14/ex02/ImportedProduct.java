package edu.livia.secao14.ex02;

public final class ImportedProduct extends Product{
    private final Double CUSTOMS_FEE;

    public ImportedProduct(String name, Double price, Double CUSTOMS_FEE){
        super(name, price);
        this.CUSTOMS_FEE = CUSTOMS_FEE;
    }

    public Double totalPrice(){
        return price + CUSTOMS_FEE;
    }

    @Override
    public String priceTag(){
        return super.name + " $" + String.format("%.2f", totalPrice())
                + " (Customs fee: $" + String.format("%.2f", CUSTOMS_FEE) + ")";
    }

}
