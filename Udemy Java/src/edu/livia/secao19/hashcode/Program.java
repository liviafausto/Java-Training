package edu.livia.secao19.hashcode;

// Como utilizar os métodos hashCode() e equals()

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client ("Alex", "alex@gmail.com");

        System.out.println("Maria - hashCode: " + c1.hashCode());
        System.out.println("Alex - hashCode: " + c2.hashCode());

        boolean comparison;
        if(c1.hashCode() != c2.hashCode())
            comparison = false;
        else
            comparison = c1.equals(c2);

        System.out.println("Maria is the same client as Alex: " + comparison);

        System.out.println();

        List<Client> clientsList = new ArrayList<>();
        clientsList.add(c1);
        clientsList.add(c2);

        Client searchClient = new Client("Maria", "differentmaria@gmail.com");
        Client result = SearchService.findSameObject(clientsList, searchClient);
        if(result != null)
            System.out.println(result + " is the same as " + searchClient);
        else
            System.out.println(searchClient + " does not exist");

        Client searchOther = new Client("Alex", "alex@gmail.com");
        result = SearchService.findSameObject(clientsList, searchOther);
        if(result != null)
            System.out.println(result + " is the same as " + searchOther);
        else
            System.out.println(searchOther + " does not exist");

    }
}
