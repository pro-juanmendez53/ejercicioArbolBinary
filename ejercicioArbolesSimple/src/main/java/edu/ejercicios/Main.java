package edu.ejercicios;

import edu.ejercicios.ArbolEjercicio.ArbolBinario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArbolBinario arbolPureba = new ArbolBinario();

        arbolPureba.insertarNodo(10);
        arbolPureba.insertarNodo(4);
        arbolPureba.insertarNodo(11);
        arbolPureba.insertarNodo(13);
//        arbolPureba.insertarNodo(6);
//        arbolPureba.insertarNodo(12);
//        arbolPureba.insertarNodo(4);
//        arbolPureba.insertarNodo(7);


        ArbolBinario.mostrarInOrden(arbolPureba.getRoot());



    }
}