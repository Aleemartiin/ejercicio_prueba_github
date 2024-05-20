package ejercicio1examen;

public class Pelicula {

	private String titulo;
	private String director;
	private int anio;
	private String genero;

	public Pelicula(String titulo, String director, int anio, String genero) {
		if (titulo.length() > 30) {
			this.titulo = null;
		} else {
			this.titulo = titulo;
		}
		this.director = director;
		if (anio < 1900) {
			this.anio = 1900;
		} else {
			this.anio = anio;
		}
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() > 30) {
			this.titulo = null;
		} else {
			this.titulo = titulo;
		}
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if (anio < 1900) {
			this.anio = 1900;
		} else {
			this.anio = anio;
		}
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void addGenero(String genero) {
		if (!(this.genero.contains(genero))) {
			this.genero = this.genero + "/" + genero;
		}
	}
}
