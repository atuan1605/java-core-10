package service;

import model.EnumCategory;
import model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Movie> createMovieList(){
        ArrayList<Movie> listMovie = new ArrayList<>();
        listMovie.add(new Movie(1, "Siêu nhân","sieu-nhan","Directed by Michael A",new EnumCategory[]{EnumCategory.FANTASY,EnumCategory.COMEDY}, LocalDate.of(2022,8,15),1,120));
        listMovie.add(new Movie(2, "The Boys","the-boys","Directed by Superman",new EnumCategory[]{EnumCategory.ACTION}, LocalDate.of(2015,6,30),2000,120));
        listMovie.add(new Movie(3, "The Godfather","the-godfather","Directed by Batman",new EnumCategory[]{EnumCategory.COMEDY}, LocalDate.of(1972,1,9),200000,120));
        listMovie.add(new Movie(4, "The Shawshank Redemption","the-shawshank-redemption","Directed by Flash",new EnumCategory[]{EnumCategory.HORROR,EnumCategory.COMEDY}, LocalDate.of(1994,6,10),600,120));
        listMovie.add(new Movie(5, "Forrest-Gump","forrest-gump","Directed by Aquaman",new EnumCategory[]{EnumCategory.DRAMA}, LocalDate.of(2022,9,20),500,120));
        listMovie.add(new Movie(6, "Se7en","se7en","Directed by Michael B",new EnumCategory[]{EnumCategory.ACTION,EnumCategory.DRAMA}, LocalDate.of(1995,6,20),1500,120));
        listMovie.add(new Movie(7, "The Silence of the Lambs","the-silence-of-the-lambs","Directed by Michael C",new EnumCategory[]{EnumCategory.HORROR}, LocalDate.of(2022,5,25),5000,120));
        listMovie.add(new Movie(8, "American Psycho","american-psycho","Directed by Michael A",new EnumCategory[]{EnumCategory.FANTASY}, LocalDate.of(1960,3,21),100000,120));
        return listMovie;
    }

    public void showAllMovieList(ArrayList<Movie> listMovie){
        listMovie.forEach(System.out::println);
    }

    public void sortByRelease(ArrayList<Movie> listMovie){
        listMovie.sort((d1,d2) ->{
            return d1.getRelease().compareTo(d2.getRelease());
        });
    }

    public ArrayList<Movie> getMovieByName(ArrayList<Movie> listMovie){
        ArrayList<Movie> listName = new ArrayList<>();
        System.out.println("Type name: ");
        String fName = sc.nextLine();
        listMovie.forEach((n) ->{
            if (n.getName().contains(fName)){
                listName.add(n);
            }
        });
        return listName;
    }

    public ArrayList<Movie> getMovieByCategory(ArrayList<Movie> listMovie){
        ArrayList<Movie> listCategory = new ArrayList<>();
        System.out.println("Type category: ");
        String fCate = sc.nextLine().toUpperCase();
        listMovie.forEach((m) -> {
            for (EnumCategory j : m.getCategory()){
                if (EnumCategory.valueOf(fCate).equals(j)){
                    listCategory.add(m);
                }
            }
        });
        return listCategory;
    }

    public void getTopView(ArrayList<Movie> listMovie){

        listMovie.sort((v1,v2) ->{
            return v1.getView()<v2.getView() ? 1:-1;
        });
        int count = 0;
        for (int i = 0; i< listMovie.size(); i++){
            count++;
            if (count > 3){
                break;
            }else {
                System.out.println(listMovie.get(i));
            }
        }
    }


}
