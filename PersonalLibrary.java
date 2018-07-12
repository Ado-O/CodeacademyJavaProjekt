import java.util.HashMap;
/**
 * I create a simple Library tool to help analyze 
 * completed books in a small, personal library.
 *  I store the books and their completion status in a HashMap.
 */
public class Library{
  public Library() {
}

public void getFinishedBooks(HashMap<String, Boolean> library) {
    if (library.size() < 1) {
        System.out.println("HashMap is empty.");
    } else {
        for (String book : library.keySet()) {
            if (library.get(book) == true) {
                System.out.println("\nThis book has been completed: " + book);
            }
        }
    }
}

public static void main(String[] args) {
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();

    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);

    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
}
}

/**
 * OUTPUT:
 * This book has been completed: TimeIn
 * This book has been completed: Road Down The Funnel
 */