package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {
    public ArrayList<Movie> getMovieList(){
        ArrayList<Movie> list = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy  file");
        }

        return list;

    }

    public void showAllList(ArrayList<Movie> list){
        for (Movie p : list){
            System.out.println(p);
        }
    }

    public void sortByTitle(ArrayList<Movie> list){

        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    public void sortByLength(ArrayList<Movie> list){

        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength()>o2.getLength() ? 1:-1;
            }
        });
    }

    public void sortByView(ArrayList<Movie> list){

        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() > o2.getView() ? 1:-1;
            }
        });

    }

    public void countTitleInCategory(ArrayList<Movie> list){

        Map<String, Integer> map =new HashMap<>();
        for (Movie m : list){
            if(map.containsKey(m.getCategory())){
                map.put(m.getCategory(), map.get(m.getCategory()) + 1);
            }else {
                map.put(m.getCategory(), 1);
            }
        }

        System.out.println(map);
    }
}
