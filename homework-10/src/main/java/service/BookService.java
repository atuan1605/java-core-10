package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class BookService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<model.Book> getAllList() {
        ArrayList<model.Book> list = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("book.json");
            Type type = new TypeToken<ArrayList<model.Book>>() {
            }.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        }
        return list;
    }

    public void showAllBooks(ArrayList<model.Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }

    public ArrayList<model.Book> getBookByTitle(ArrayList<Book> list) {
        ArrayList<Book> listName = new ArrayList<>();
        System.out.println("Type name: ");
        String fName = sc.nextLine();
        for (Book book : list) {
            if (book.getTitle().contains(fName)) {
                listName.add(book);
            }
        }

        return listName;
    }


        public ArrayList<Book> getBookByCategory(ArrayList<Book> list) {
            ArrayList<Book> listCategory = new ArrayList<>();
            System.out.println("Type Category");
            String fTitle = sc.nextLine();
            for (Book b : list) {
                String[] array = b.getCategory();
                for (String s : array) {
                    if (s.contains(fTitle)) {
                        listCategory.add(b);
                        break;
                    }
                }
            }
            return listCategory;

        }

        public void sortByNumber(ArrayList<Book> list) {
            Collections.sort(list, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getNumber() > o2.getNumber() ? 1 : -1;
                }
            });
        }

        public void sortByRelease(ArrayList<Book> list) {
            Collections.sort(list, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getRelease() > o2.getRelease() ? 1 : -1;
                }
            });
        }



}
