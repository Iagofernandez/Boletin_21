/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg21;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author X541
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         metodos.Metodos obx=new metodos.Metodos();

        ArrayList<metodos.Libro>libros=new ArrayList<>();

        String opcion,opcion2;

        do{

        opcion=PedirDatos.introducirString("****MENU****\n 1->Añadir\n 2->Visualizar\n 3->Venta\n 4->Dar de baja\n 5->Buscar uno\n 6->Salir\n\nIntroduzca la funcion que desea realizar:");

        switch(opcion.toLowerCase()){

            case "añadir": obx.añadirLibro(libros);

                           break;

            case "visualizar": Collections.sort(libros);

                               opcion2=JOptionPane.showInputDialog(null,"Seleccione modo\n 1->For\n 2->For each\n 3->Iterator\nIntroduzca su opcion:");

                               switch(opcion2.toLowerCase()){

                                    case "for": obx.verFor(libros);

                                                break;

                                    case "for each": obx.verForEach(libros);

                                                break;

                                    case "iterator": obx.verIterator(libros);

                                                break;

                                    default: JOptionPane.showMessageDialog(null,"Opcion no valida.");

                                }

                               break;

            case "venta": obx.vender(libros);

                          break;

            case "dar de baja": obx.darDeBaja(libros);

                                break;

            case "buscar uno": obx.buscarUno(libros);

                               break;

            case "salir":System.exit(0);

            default: opcion=JOptionPane.showInputDialog(null, "Opcion no valida\nDesea volver al menu?");

        

        }

        }while(!"No".equalsIgnoreCase(opcion));

        

    }

    

}
    
    

