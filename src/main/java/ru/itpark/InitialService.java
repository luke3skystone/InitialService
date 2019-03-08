package ru.itpark;

public class InitialService {
    public String getInitials(String name){
        String[]parts = name.split(" ");
        if(parts.length<2){
            String initials = parts[0].substring(0,1).toUpperCase();
            System.out.println(initials);
        }
        else {
            String initials = parts[0].substring(0,1).toUpperCase()+parts[1].substring(0,1).toUpperCase();
            System.out.println(initials);
        }
        return name;
    }
}
