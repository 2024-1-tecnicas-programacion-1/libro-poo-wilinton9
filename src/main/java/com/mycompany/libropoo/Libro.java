package com.mycompany.libropoo;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int annopublicado;
    private boolean leido=false;
    
    public Libro( String titulo, String autor, int annopublicado, boolean leido){
        this.titulo = titulo;
        this.autor = autor;
        this.aniopubli = aniopubli;
        this.leido = leido;
    }
    
    public String mostrarInformacion(){
        return "Título: "+titulo+ ", Autor: "+ autor+ ", Año de ¨Publicación: "+annopublicacion+", Género:"+genero;
    }
    
    public void marcarLeido(){
        leido=true;
    }

    public boolean esLeido() {
        return leido;
    }

    public boolean esAntiguo(){
        if (annopublicacion<1974){
        return true;
        }else{
        return false;
      }
    } 
  }
}
