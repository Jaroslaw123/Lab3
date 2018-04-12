package japplet; 
public class Vector2D {   //utworzenie klasy Vector2D

  public float x; //publiczne pole współrzędnej x
  public float y; //publiczne pole współrzędnej y
  public Vector2D(){ //konstruktor domyślny
    this.x=0;
    this.y=0;
    }
  public Vector2D(float X,float Y){ //konstruktor z parametrami
      this.x=X;
      this.y=Y;
  }
public Vector2D Suma(Vector2D v) // metode zwracająca sumę dwóch wektorów
{
        Vector2D vektor = new Vector2D(this.x + v.x, this.y+v.y);
        return vektor;
    }
public Vector2D Roznica(Vector2D v)//metoda zwracająca różnicę dwóch wektorów
    {
       Vector2D vektor = new Vector2D(this.x -v.x, this.y-v.y);
       return vektor;
    }
public Vector2D Iloczyn(float m){ //metoda zwracająca lioczyn wektora i pewnej stałej 
    Vector2D vektor = new Vector2D(this.x*m, this.y*m);
               return vektor;
}
public float modul() // metoda obliczająca długość wektora 
{
        return (float) Math.sqrt(this.x*this.x+this.y*this.y);
}
public Vector2D znormalizowany(){ // metoda normalizująca wektor 
    Vector2D vektor = new Vector2D(this.x/modul(),this.y/modul());
    return vektor;
}
}

    