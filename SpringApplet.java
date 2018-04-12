
package japplet;

import javax.swing.JApplet; //zaimportowanie klasy JApplet 


public class SpringApplet extends JApplet { //utworzenie klasy pochodnej od klasy JApplet
   
    @Override
    public void init(){ // przeciążenie metody init

    }
    public void paint(){ // przeciążenie metody paint
        }
   public static void main(String[] args) {
        Vector2D vektor_1 =new Vector2D(1,2);// utworzenie obiektów za pomocą
        Vector2D vektor_2 =new Vector2D(5,2);// konstruktora z parametrami
        Vector2D vektor_3 = vektor_1.Suma(vektor_2);// obliczanie sumy wektorów
        Vector2D vektor_4 = vektor_1.Roznica(vektor_2);//obliczanie różnicy wektorów
        Vector2D vektor_5 = vektor_1.znormalizowany(); // oblicznie wektorów 
        Vector2D vektor_6 = vektor_2.znormalizowany(); // znormalizowanych 
        float dl_1 = vektor_1.modul(); // obliczanie długości
        float dl_2 = vektor_2.modul();//  wektorów
        Vector2D vektor_7=vektor_1.Iloczyn(4); // obliczenie lioczynu pewnej stałej i wektora 
   
    System.out.println("Współrzędna x wektora nr 1 wynosi:  "+vektor_1.x); // wyświetlenie współrzędnych 
    System.out.println("Współrzędna y wektora nr 1 wynosi:  "+vektor_1.y); // wektorów
    System.out.println("Współrzędna x wektora nr 2 wynosi:  "+vektor_2.x); //
    System.out.println("Współrzędna y wektora nr 2 wynosi:  "+vektor_2.y); //
    System.out.println("Współrzędna x sumy wektora nr 1 oraz nr 2 wynosi:  "+vektor_3.x);   // wyświetlenie  
    System.out.println("Współrzędna y sumy wektora nr 1 oraz nr 2 wynosi:  "+vektor_3.y);   //współrzędnych sumy wektorów 
    System.out.println("Współrzędna x różnicy wektora nr 1 oraz nr 2 wynosi:  "+vektor_4.x);// wyświetlenie 
    System.out.println("Współrzędna y różnicy wektora nr 1 oraz nr 2 wynosi:  "+vektor_4.y);//współrzędnych różnicy wektorów
    System.out.println("Współrzędna x znormalizowanego wektora nr 1 wynosi:  "+vektor_5.x); // wyświetlenie
    System.out.println("Współrzędna y znormalizowanego wektora nr 1 wynosi:  "+vektor_5.y); //współrzędnych znormalizowanych wektorów
    System.out.println("Współrzędna x znormalizowanego wektora nr 2 wynosi:  "+vektor_6.x); //
    System.out.println("Współrzędna y znormalizowanego wektora nr 2 wynosi:  "+vektor_6.y); //
    System.out.println("Długość wektora nr 1 wynosi:  "+dl_1);                              // wyświetlenie
    System.out.println("Długość wektora nr 2 wynosi:  "+dl_2);                              // długości wektorów 
    System.out.println("Współrzędna x iloczynu wektora_1 oraz stałej 4 wynosi: " +vektor_7.x);     // wyświetlenie iloczynu stałej
    System.out.println("Współrzędna y iloczynu wektora_1 oraz stałej 4 wynosi: " +vektor_7.y);     // oraz wektora
    }
    }

