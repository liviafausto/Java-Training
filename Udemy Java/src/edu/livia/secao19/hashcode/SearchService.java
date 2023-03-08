package edu.livia.secao19.hashcode;

// Como utilizar os métodos hashCode() e equals() em uma busca extensa

import java.util.List;

public class SearchService {

    public static <T> T findSameObject(List<T> list, T other){
        for(T obj : list){
            if(obj.hashCode() == other.hashCode()){
                if(obj.equals(other))
                    return obj;
            }
        }
        return null;
    }

}
