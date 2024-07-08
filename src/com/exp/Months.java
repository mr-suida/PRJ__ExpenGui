

package com.exp;

class Months {
     public static int getNumber(String name) {
       
        if (name.length() > 0 ) {
            switch(name){
                case "Janeiro"   -> {return 0;}
                case "Fevereiro" -> {return 1;}
                case "Março"     -> {return 2;}
                case "Abril"     -> {return 3;}
                case "Maio"      -> {return 4;}
                case "Junho"     -> {return 5;}
                case "Julho"     -> {return 6;}
                case "Agosto"    -> {return 7;}
                case "Setembro"  -> {return 8;}
                case "Outubro"   -> {return 9;}
                case "Novembro"  -> {return 10;}
                case "Dezembro"  -> {return 11;}
            }
        }
       
        return -1;
    }
}
