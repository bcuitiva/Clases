public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private String duracion;

    public Pelicula() {
    }
    public Pelicula(String titulo, String director, String genero, String duracion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }

    public void reproducir(){
        System.out.println("La pelicula " + this.titulo + " se empezo a reproducir.");
    }
    public void detener(){
        System.out.println("La pelicula " + this.titulo + " se detuvo.");
    }
}
