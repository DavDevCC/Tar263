import java.util.ArrayList;

public class Library {
  private String libraryName;
  private String libraryDirection;
  private ArrayList<BookCopy> copyInventory;
  private ArrayList<Book> booksInventory;


  public Library(String libraryName, String libraryDirection) {
    this.libraryName = libraryName;
    this.libraryDirection = libraryDirection;
  }

  public String getLibraryName() {
    return libraryName;
  }

  public void setLibraryName(String libraryName) {
    this.libraryName = libraryName;
  }

  public String getLibraryDirection() {
    return libraryDirection;
  }

  public void setLibraryDirection(String libraryDirection) {
    this.libraryDirection = libraryDirection;
  }

  public ArrayList<BookCopy> getCopyInventory() {
    return copyInventory;
  }

  public void setCopyInventory(ArrayList<BookCopy> copyInventory) {
    this.copyInventory = copyInventory;
  }

  public ArrayList<Book> getBooksInventory() {
    return booksInventory;
  }

  public void setBooksInventory(ArrayList<Book> booksInventory) {
    this.booksInventory = booksInventory;
  }

  public void addBook(Book book){getBooksInventory().add(book);
  }
  public void deleteBook(Book book){
    getBooksInventory().remove(book);
  }

  public boolean bookExist(String bookName, String bookAutor){
    Book searchedBook = new Book(bookName, bookAutor, "");

    return this.getBooksInventory().contains(searchedBook);
  }
  public Book searchBook(String bookName, String bookAutor){
    Book searchedBook = new Book(bookName, bookAutor, "");

    int bookIndex = this.getBooksInventory().indexOf(searchedBook);
    return this.getBooksInventory().get(bookIndex);
  }

  public boolean isBookCopyAvailable(Book searchedBook){
    ArrayList<BookCopy> copyInventory = this.getCopyInventory();
    int availableCopies = 0;
    for (BookCopy copy: copyInventory) {
      if (copy.getCopyContent().equals(searchedBook)) {
        if (copy.isAvailable()) availableCopies++;
      }
    }
    return availableCopies > 0;

  }

  public BookCopy getBookCopy(Book searchedBook){

    int copyIndex = this.getCopyInventory().indexOf(searchedBook);
    return this.getCopyInventory().get(copyIndex);
  }


}
