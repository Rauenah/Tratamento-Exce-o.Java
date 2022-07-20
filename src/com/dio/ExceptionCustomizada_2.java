package com.dio;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {10, 9, 8, 7};
        int[] denominador = {1, 3, 0, 2, 3};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");
    }

    private static class DivisaoNaoExataException extends Throwable {
        public DivisaoNaoExataException(String s, int i, int i1) {
        }
    }
}


