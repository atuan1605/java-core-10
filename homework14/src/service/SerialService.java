package service;

import model.EnumCategory;
import model.Movie;
import model.Serial;
import model.Status;

import java.time.LocalDate;
import java.util.ArrayList;

public class SerialService {
    public ArrayList<Serial> createSerialList(){
        ArrayList<Serial> listSerial = new ArrayList<>();
        listSerial.add(new Serial(1, "Siêu nhân","sieu-nhan","Directed by Michael A",new EnumCategory[]{EnumCategory.FANTASY,EnumCategory.COMEDY},LocalDate.of(2022,8,15),1,Status.COMPLETE,1));
        listSerial.add(new Serial(2, "The Boys","the-boys","Directed by Superman",new EnumCategory[]{EnumCategory.ACTION}, LocalDate.of(2015,6,30),2000,Status.COMPLETE,25));
        listSerial.add(new Serial(3, "The Godfather","the-godfather","Directed by Batman",new EnumCategory[]{EnumCategory.COMEDY}, LocalDate.of(1972,1,9),200000,Status.INCOMPLETE,30));
        listSerial.add(new Serial(4, "The Shawshank Redemption","the-shawshank-redemption","Directed by Flash",new EnumCategory[]{EnumCategory.HORROR,EnumCategory.COMEDY}, LocalDate.of(1994,6,10),600,Status.COMPLETE,5));
        listSerial.add(new Serial(5, "Forrest-Gump","forrest-gump","Directed by Aquaman",new EnumCategory[]{EnumCategory.DRAMA}, LocalDate.of(2022,9,20),500,Status.COMPLETE,28));
        listSerial.add(new Serial(6, "Se7en","se7en","Directed by Michael B",new EnumCategory[]{EnumCategory.ACTION,EnumCategory.DRAMA}, LocalDate.of(1995,6,20),1500,Status.INCOMPLETE,6));
        listSerial.add(new Serial(7, "The Silence of the Lambs","the-silence-of-the-lambs","Directed by Michael C",new EnumCategory[]{EnumCategory.HORROR}, LocalDate.of(2022,5,25),5000,Status.INCOMPLETE,48));
        listSerial.add(new Serial(8, "American Psycho","american-psycho","Directed by Michael A",new EnumCategory[]{EnumCategory.FANTASY}, LocalDate.of(1960,3,21),100000,Status.COMPLETE,100));
        return listSerial;
    }

    public void showAllSerial(ArrayList<Serial> listSerial){
        listSerial.forEach(System.out::println);

    }

    public ArrayList<Serial> getCompleteMovie(ArrayList<Serial> listSerial){
        ArrayList<Serial> listComplete = new ArrayList<>();
        listSerial.forEach((n)->{
            if(n.getStatus()==Status.COMPLETE){
                listComplete.add(n);
            }
        });
        return listComplete;
    }




}
