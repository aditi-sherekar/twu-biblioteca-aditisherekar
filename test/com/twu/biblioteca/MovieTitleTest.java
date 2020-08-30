packapackage com.twu.biblioteca;

import com.twu.biblioteca.MovieTitle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTitleTest {


    @Test
    public void doesGetMovieTitleGetCorrectTitle(){

        MovieTitle title = new movieTitle("Black Panther");

        assertEquals("Black Panther", title.getMovieTitle());

    }

}