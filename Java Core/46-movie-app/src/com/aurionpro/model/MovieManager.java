package com.aurionpro.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	List<Movie> movies;
	static final String filepath = "D:\\SwabhavTechlab\\DEMO\\movie.txt";

	public MovieManager() {// List<Movie> movies) {
		movies = new ArrayList<>();
		// movies.add(new Movie(101, "ANTMAN", 2023, "ACTION"));
		loadMovies();
	}

	public void addMovies(Movie movie) {
		movies.add(movie);
		saveMovie();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	private void loadMovies() {
		try {
			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			movies = (List<Movie>) in.readObject();

			in.close();
			file.close();

			// System.out.println("Student object Deserialized");
			// System.out.println(movies);
		} catch (EOFException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

	private void saveMovie() {
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(movies);
			file.close();

			// System.out.println("Student object serialized");
			// System.out.println(student);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteAllMovies() {
		movies.clear();
		saveMovie();
	}
	
	public boolean deleteMovie(int id) {
		//movies.remove(index-1);
		int index=-1;
		for(int i=0; i<movies.size();i++) {
			if(movies.get(i).getId()==id) {
				index=i;
			}
		}
		if(index!=-1) {
			movies.remove(index);
			saveMovie();
			return true;
		}
		return false;
	}

}
