package com.kodewala.constructors7;

class Content {

	String title;
	String language;
	double rating;

	Content(String title, String language, double rating) {

		this.title = title;
		this.language = language;
		this.rating = rating;
	}
}

class Movie extends Content {

	int duration;

	Movie(String title, String language, double rating, int duration) {

		super(title, language, rating);

		this.duration = duration;
	}
}

class Series extends Content {

	int numberOfSeasons;

	Series(String title, String language, double rating, int numberOfSeasons) {

		super(title, language, rating);

		this.numberOfSeasons = numberOfSeasons;
	}
}

public class Netflix {

	public static void main(String[] args) {

		Movie movie = new Movie("Avengers", "English", 8.5, 180);

		Series series = new Series("Stranger Things", "English", 8.7, 4);

		System.out.println(movie.title);
		System.out.println(movie.duration);

		System.out.println(series.title);
		System.out.println(series.numberOfSeasons);
	}
}
