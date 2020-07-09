package main;

import java.util.ArrayList;

import item.Type;


public class Main {

    public static void main(String[] args) {
        int typeIDs[] = {34, 35, 36, 37, 38, 39, 40}; 
        String typeNames[] = {"Tritanium", "Pyerite", "Mexallon", "Isogen", "Nocxium", "Zydrine", "Megacyte"};
        
        ArrayList<Type> types = new ArrayList<Type>();
        
        for (int i = 0; i < typeIDs.length; i++){
            types.add(new Type(typeIDs[i], typeNames[i]));
        }
        
        for(Type type: types){
            System.out.printf("%2d  %s\n", type.getID(), type.getName());
        }
        
    }

    
}
