package com.rodrigofujioka.javabasico.aula10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaClass {


    public static void main(String[] args) {

        List<Cliente> clientes = Arrays.asList(new Cliente(1, "Rodrigo", true),
                new Cliente(2, "Fujioka", true),
                new Cliente(3, "Japa", false));


        clientes.forEach(cliente -> System.out.println(cliente));

        clientes.forEach(System.out::println);

        clientes.stream()
                .filter(c->c.getNome().contains("Fujioka"))
                .forEach(System.out::println);

    }


}
