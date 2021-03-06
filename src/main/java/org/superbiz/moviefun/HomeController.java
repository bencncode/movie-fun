package org.superbiz.moviefun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    private MoviesBean moviesBean;

    public HomeController(MoviesBean moviesBean) {
        this.moviesBean = moviesBean;
    }

    @RequestMapping("/")
    public String showIndexPage(){
        return "index";
    }

    @RequestMapping("/setup")
    public String showSetupPage(Map<String, Object> model){
       /* List<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(new Movie("Wedding Crashers", "David Dobkin", "Comedy", 7, 2005));
        listOfMovies.add(new Movie("Shanghai Knights", "David Dobkin", "Action", 6, 2003));
        listOfMovies.add(new Movie("I-Spy", "Betty Thomas", "Adventure", 5, 2002));
        listOfMovies.add(new Movie("Starsky & Hutch", "Todd Phillips", "Action", 6, 2004));
        listOfMovies.add(new Movie("The Royal Tenenbaums", "Wes Anderson", "Comedy", 8, 2001));
        listOfMovies.add(new Movie("Zoolander", "Ben Stiller", "Comedy", 6, 2001));
        listOfMovies.add(new Movie("Shanghai Noon", "Tom Dey", "Comedy", 7, 2000));*/

        moviesBean.addMovie(new Movie("Wedding Crashers", "David Dobkin", "Comedy", 7, 2005));
        moviesBean.addMovie(new Movie("Shanghai Knights", "David Dobkin", "Action", 6, 2003));
        moviesBean.addMovie(new Movie("I-Spy", "Betty Thomas", "Adventure", 5, 2002));
        moviesBean.addMovie(new Movie("Starsky & Hutch", "Todd Phillips", "Action", 6, 2004));
        moviesBean.addMovie(new Movie("The Royal Tenenbaums", "Wes Anderson", "Comedy", 8, 2001));
        moviesBean.addMovie(new Movie("Zoolander", "Ben Stiller", "Comedy", 6, 2001));
        moviesBean.addMovie(new Movie("Shanghai Noon", "Tom Dey", "Comedy", 7, 2000));
        moviesBean.addMovie(new Movie("Wedding Crashers", "David Dobkin", "Comedy", 7, 2005));

        model.put("movies", moviesBean.getMovies());
        //moviesBean.setMovies(listOfMovies);
        return "setup";
    }
}
