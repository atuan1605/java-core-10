import model.Movie;
import model.Serial;
import service.MovieService;
import service.SerialService;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        MovieService service = new MovieService();
//        ArrayList<Movie> list = service.createMovieList();
//        service.sortByRelease(list);
//        service.showAllMovieList(list);
//        System.out.println();
////        service.showAllMovieList(service.getMovieByName(list));
//        service.getTopView(list);


        SerialService serialService = new SerialService();
        ArrayList<Serial> listSerial = serialService.createSerialList();
        serialService.showAllSerial(listSerial);
        serialService.showAllSerial(serialService.getCompleteMovie(listSerial));

    }
}
