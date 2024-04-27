package edu.ejercicios.ArbolEjercicio;

public class ArbolBinario {

    Nodo root;

    public ArbolBinario(){root =null;}

    public boolean arbolVacio(){return root==null;}

// <dependency>
//  <groupId>io.quarkus</groupId>
//  <artifactId>quarkus-smallrye-openapi</artifactId>
//</dependency>


    public void insertarNodo(int dato)
    {
        Nodo nuevoN = new Nodo(dato);
        if(arbolVacio())
        {
            root = nuevoN;
        }
        else
        {
            Nodo auxiliar;
            auxiliar=root;
            Nodo padre;
            while (true)
            {
                padre=root;
                if (dato < auxiliar.dato)
                {
                    auxiliar= auxiliar.izquierda;
                }
                if (auxiliar==null)
                {
                    padre.izquierda=nuevoN;
                    return;
                }
                else
                {
                    auxiliar=auxiliar.derecha;
                }
                if (auxiliar==null)
                {
                    padre.derecha= nuevoN;
                    return;
                }
            }
        }

    }

    public static void mostrarInOrden(Nodo nodo)
    {
        if (nodo != null)
        {
            mostrarInOrden(nodo.izquierda);
            System.out.println(nodo.dato + " ");
            mostrarInOrden((nodo.derecha));
        }

    }

    public static void mostrarPreOrden(Nodo nodo)
    {
        if (nodo !=null)
        {
            System.out.println(nodo.dato + " ");
            mostrarPreOrden(nodo.izquierda);
            mostrarPreOrden(nodo.derecha);
        }
    }

    public static void mostarPostOrden(Nodo nodo)
    {
        if (nodo != null)
        {
            mostarPostOrden(nodo.izquierda);
            mostarPostOrden(nodo.derecha);
            System.out.println(nodo.dato + " ");
        }
    }

    public Nodo getRoot() {
        return root;
    }
}
