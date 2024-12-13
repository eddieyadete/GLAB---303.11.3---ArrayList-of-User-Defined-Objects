import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AddDataToArrayList bookInfo = new AddDataToArrayList();
        ArrayList<Book> myBooks = bookInfo.bookdetails();
        for (Book book : myBooks){
            System.out.println(book.toString());
        }

    }
}