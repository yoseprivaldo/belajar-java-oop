package com.enigmacamp.exception;

public class App {

    public static void main(String[] args) {
        // Penanganan Error dengan try-catch
        try{
            System.out.println(1/0);
        } catch (ArithmeticException e){
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Ini juga dijalankan
        System.out.println("Ini juga dijalankan");

        try {
             validateAge(10);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass().getSimpleName());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{

            if(age < 18){
                throw new InvalidAgeException("Umur minimal 18 tahun");
            } else {
                System.out.println("Umur valid untuk mendaftar silahkan untuk mengikuti langkah-langkah berikutnya");
            }

    }
}
