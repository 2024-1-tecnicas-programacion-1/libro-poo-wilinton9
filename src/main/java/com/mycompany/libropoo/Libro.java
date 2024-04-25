package com.mycompany.libropoo;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int annopublicacion;
    private boolean leido=false;
    
    public Libro( String titulo, String autor, int annopublicacion, boolean leido){
        this.titulo = titulo;
        this.autor = autor;
        this.annopublicacion = annopublicacion;
        this.leido = leido;
    }
    
    public String mostrarInformacion(){
        return "Título: "+titulo+ ", Autor: "+ autor+ ", Año de ¨Publicación: "+annopublicion+", Género:"+genero;
    }
    
    public void marcarLeido(){
        leido=true;
    }

    public boolean esLeido() {
        return leido;
    }

    public boolean esAntiguo(){
        if (annopublicion<1974){
        return true;
        }else{
        return false;
      }
    }   
  }
}
