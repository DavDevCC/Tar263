import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Loan {
  private User user;
  private int loanId;
  private LocalDate loanDay;
  private LocalDate returnDay;


  private ArrayList<BookCopy> bookCopies;

  public Loan(User user, LocalDate returnDay, ArrayList<BookCopy> bookCopies) {
    this.user = user;
    this.returnDay = returnDay;
    this.returnDay = LocalDate.now();
    this.bookCopies = bookCopies;
    this.loanId = user.getRealizedLoans() + 1;
  }

  public User getUser() {
    return user;
  }

  public LocalDate getLoanDay() {
    return loanDay;
  }

  public LocalDate getReturnDay() {
    return returnDay;
  }

  public ArrayList<BookCopy> getBookCopies() {
    return bookCopies;
  }

  public void setBookCopies(ArrayList<BookCopy> bookCopies) {
    this.bookCopies = bookCopies;
  }

  public int getLoanId() {
    return loanId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loan loan = (Loan) o;
    return getLoanId() == loan.getLoanId() && Objects.equals(getUser(), loan.getUser());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUser(), getLoanId());
  }
}
