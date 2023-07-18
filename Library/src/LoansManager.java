import java.time.LocalDate;
import java.util.ArrayList;

public class LoansManager {

  private ArrayList<Loan> pendientLoans;
  private final int timeToReturnBook = 15;
  private final double dailyCashPenalty = 4.5;

  public ArrayList<Loan> getPendientLoans() {
    return pendientLoans;
  }

  public void setPendientLoans(ArrayList<Loan> pendientLoans) {
    this.pendientLoans = pendientLoans;
  }

  public int getTimeToReturnBook() {
    return timeToReturnBook;
  }

  public double getDailyCashPenalty() {
    return dailyCashPenalty;
  }

  public void addLoan(User user, ArrayList<BookCopy> bookCopies){
    this.pendientLoans.add(new Loan(user, LocalDate.now().plusDays(timeToReturnBook), bookCopies));
  }

}
