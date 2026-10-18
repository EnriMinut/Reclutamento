package org.example;

import net.datafaker.Faker;

public class Reclutatore{

    private Faker faker;

    public Reclutatore(){
        this.faker = new Faker();
    }

    public void recluta(int difficolta) throws EroeNonIdoneoException{

        String Eroe = faker.superhero().name();
        int potenza = faker.number().numberBetween(1,101);

        IO.println("Recluta: " + Eroe + " | Potere: " + potenza);

        if(potenza < difficolta){
            throw new EroeNonIdoneoException(Eroe, potenza);
        }else{
            IO.println("Idoneo");
        }

    }

}
