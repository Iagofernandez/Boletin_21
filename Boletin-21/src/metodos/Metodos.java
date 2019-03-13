/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author X541
 */
public class Metodos {
  

    public void añadirLibro(ArrayList<Libro>libros){

        String titulo,autor,ISBN;

        int precio,nlibros;

        titulo=PedirDatos.introducirString("Introduzca el Titulo:");

        autor=PedirDatos.introducirString("Introduzca el Autor");

        ISBN=PedirDatos.introducirString("Introduzca el ISBN");

        precio=PedirDatos.enteiro("Introduzca el precio");

        nlibros=PedirDatos.enteiro("Introduzca el numero de libros");

        Libro tomo=new Libro(titulo,autor,ISBN,precio,nlibros);

        if(libros.isEmpty()==true){

            libros.add(tomo);

        }

        else{

            for(Libro ele:libros){

                    if(ele.getISBN().equals(ISBN)){

                        if(ele.autor.equals(autor)){

                            if(ele.titulo.equals(titulo)){

                                ele.setUnidades(ele.getUnidades()+nlibros);

                            }

                            else{

                                JOptionPane.showMessageDialog(null,"El ISBN del libro no corresponde con el titulo");

                            }

                        }

                        else{

                            JOptionPane.showMessageDialog(null,"El ISBN del libro no se corresponde con el autor");

                        }

                    }

                    else{

                        libros.add(tomo);

                        break;

                    }

            }

        }

    }

    public void verFor(ArrayList<Libro>libro){

        if(libro.isEmpty()==true){

            JOptionPane.showMessageDialog(null, "No contiene libros");

        }

        else{

            for(int i=0;i<libro.size();i++){

            System.out.println(libro.get(i));

        }

        }

    }

    public void verForEach(ArrayList<Libro>libro){

        if(libro.isEmpty()==true){

            JOptionPane.showMessageDialog(null, "No contiene libros");

        }

        else{

        for(Libro ele:libro){

            System.out.println(ele);

        }

        }

    }

    public void verIterator(ArrayList<Libro>libro){

        if(libro.isEmpty()==true){

            JOptionPane.showMessageDialog(null, "No contiene libros");

        }

        else{

        Iterator it=libro.iterator();

        while(it.hasNext()){

            System.out.println(it.next());

        }

        }

    }

    public void vender(ArrayList<Libro>libro){

        String ISBN;

        int vender;

        if(libro.isEmpty()==true){

        JOptionPane.showMessageDialog(null, "No contiene libros");

        }

        else{

            ISBN=PedirDatos.introducirString("Introduzca el ISBN del libro a vender");

        for(Libro ele:libro){

            if(ele.getISBN().equalsIgnoreCase(ISBN)){

                if(ele.getUnidades()>0){

                    vender=PedirDatos.enteiro("Introduzca las unidades a vender");

                    if(vender>ele.getUnidades()){

                        JOptionPane.showMessageDialog(null,"No dispone de tal cantidad de unidades de libros");

                    }

                    else{

                        ele.setUnidades(ele.getUnidades()-vender);

                    }

                }

                else{

                    JOptionPane.showMessageDialog(null,"No dispone de unidades de ese libro");

                }

            }

        }

        }

    }

    public void darDeBaja(ArrayList<Libro>lista){

        Libro libro=new Libro();

        Iterator it=lista.iterator();

        if(lista.isEmpty()==true){

            JOptionPane.showMessageDialog(null, "No contiene libros");

        }

        else{

            while(it.hasNext()){

            libro=(Libro)it.next();

            if(libro.getUnidades()==0){

                lista.remove(libro);

                break;

            }

            }

        }

    }

    public void buscarUno(ArrayList<Libro>libro){

    Iterator it=libro.iterator();

    Libro lib=new Libro();

    String ISBN;

    if(libro.isEmpty()==true){

        JOptionPane.showMessageDialog(null, "No contiene libros");

    }

    else{

        ISBN=PedirDatos.introducirString("Introduzca el ISBN del libro a vender");

        while(it.hasNext()){

            lib=(Libro)it.next();

            if(ISBN.equals(lib.ISBN))

                System.out.println(lib);

        }

    }

    }

}



