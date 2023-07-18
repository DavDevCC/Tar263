import java.util.Objects;

public class BookCopy {
  private Book copyContent;
  private boolean isAvailable;

  private boolean isReserved;

  public BookCopy(Book copyContent) {
    this.copyContent = copyContent;
    this.isAvailable = true;
    this.isReserved = false;
  }

  public Book getCopyContent() {
    return copyContent;
  }

  public void setCopyContent(Book copyContent) {
    this.copyContent = copyContent;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean available) {
    isAvailable = available;
  }

  public boolean isReserved() {
    return isReserved;
  }

  public void setReserved(boolean reserved) {
    isReserved = reserved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookCopy bookCopy = (BookCopy) o;
    return isAvailable() == bookCopy.isAvailable() && Objects.equals(getCopyContent(),
        bookCopy.getCopyContent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCopyContent(), isAvailable());
  }
}
