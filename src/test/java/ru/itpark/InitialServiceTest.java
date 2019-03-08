package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {
    @Test
    public String getInitials(String name){
        String[]parts = "Ivan Petrov Rodriges".split(" ");
        System.out.println(parts[0].substring(0,1).toUpperCase()+parts[1].substring(0,1).toUpperCase());
      return name;

    }

   }