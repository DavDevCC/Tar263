import java.util.ArrayList;
import java.util.Objects;

public class Book {
  private String bookName;
  private String autorName;
  private String description;
  private  UsersValoration usersValoration;

  public Book(String bookName, String autorName, String description) {
    this.bookName = bookName;
    this.autorName = autorName;
    this.description = description;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAutorName() {
    return autorName;
  }

  public void setAutorName(String autorName) {
    this.autorName = autorName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UsersValoration getUsersValoration() {
    return usersValoration;
  }

  public void setUsersValoration(UsersValoration usersValoration) {
    this.usersValoration = usersValoration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(getBookName(), book.getBookName()) && Objects.equals(
        getAutorName(), book.getAutorName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBookName(), getAutorName());
  }

  @Override
  public String toString() {
    return
        "Book Name: '" + bookName + '\'' +
        ", AutorName: '" + autorName + '\'' +
        ", Description: '" + description + '\'';
  }
}
