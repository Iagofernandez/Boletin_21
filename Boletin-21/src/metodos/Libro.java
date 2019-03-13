/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author X541
 */
public class Libro implements Comparable{
    String titulo, autor, ISBN;

    int precio,unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, int precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.unidades = unidades;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int Unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", nunidades=" + unidades + '}';
    }

 @Override

    public int compareTo(Object o) {

        Libro a=(Libro)o;

        if(this.titulo.compareToIgnoreCase(a.titulo)>0){

            return 1;

        }

        else if(this.titulo.compareToIgnoreCase(a.titulo)<0){

            return -1;

        }

        else {

            return 0;

        }

    }

    

   
    
}
