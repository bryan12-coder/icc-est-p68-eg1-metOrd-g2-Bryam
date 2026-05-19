package controllers;

import models.Movie;

public class MovieController {
    public void sortByTitle(Movie[] movies){
        int n=movies.length;
        for(int i =1;i<n;i++){
            Movie key=movies[i];
            int j=i-1;



            while(j>=0 && movies[j].getName().compareToIgnoreCase(key.getName())<0){
                movies[j+1]=movies[j];
                j=j-1;



            }
            movies[j+1]=key;
        }
    }
    public  void Imprimir(Movie[] movies) {
        for (Movie m : movies) {
            System.out.println("nombre=" + m.getName()+ "Año=" +  m.getYear());

            
        }
        
    }


}
