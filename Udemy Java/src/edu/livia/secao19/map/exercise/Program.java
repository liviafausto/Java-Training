package edu.livia.secao19.map.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> election = new HashMap<>();

        for(int i=0; i<9; i++){
            System.out.print("Candidate's name: ");
            String name = scan.nextLine();
            System.out.print("Votes: ");
            Integer votes = scan.nextInt();
            scan.nextLine();

            if(!election.containsKey(name))
                election.put(name, votes);
            else{
                int votesSoFar = election.get(name);
                election.put(name, votesSoFar + votes);
            }
        }

        for(String key : election.keySet())
            System.out.println(key + ": " + election.get(key));

        scan.close();
    }
}

/* Input:
* Alex Blue 15
* Maria Green 22
* Bob Brown 21
* Alex Blue 30
* Bob Brown 15
* Maria Green 27
* Maria Green 22
* Bob Brown 25
* Alex Blue 31
 * */