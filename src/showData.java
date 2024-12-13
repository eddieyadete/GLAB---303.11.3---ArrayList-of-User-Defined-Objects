import java.util.ArrayList;

public class showData {

    public void showDataList(){

    AddDataToArrayList b = new AddDataToArrayList();
    ArrayList<Book> myBookList = b.bookdetails();
        for(Book showValue: myBookList){
            System.out.println(showValue.
                    getNumber()
                    + " " + showValue.getName()
                    + " " +showValue.getCategory()
                    + " " + showValue.getAuthor());

    }
    }
}
