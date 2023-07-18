import java.util.ArrayList;

public class LibraryManager {

  private Library library;
  private LoansManager loansManager;


  public LibraryManager(Library library) {
    this.library = library;
    this.loansManager = new LoansManager();
  }

  public Library getLibrary() {
    return library;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public void borrowBooks(User user, ArrayList<BookCopy> bookCopies) {
    loansManager.addLoan(user, bookCopies);
    for (BookCopy bookCopy : bookCopies) {
      bookCopy.setAvailable(false);
      user.getBorrowedBooks().add(bookCopy);
    }
  }
  public void returnBooks(User user, ArrayList<BookCopy> bookCopies){

  }
}
