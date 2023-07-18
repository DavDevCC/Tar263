import java.util.ArrayList;

public class User {
  private String names;
  private String lastNames;
  private int personalIdentification;
  private String userName;
  private String password;
  private int phoneNumber;
  private ArrayList<BookCopy> borrowedBooks;
  private double debts;
  private int realizedLoans;

  public User(String names, String lastNames, int personalIdentification, String userName,
      String password, int phoneNumber) {
    this.names = names;
    this.lastNames = lastNames;
    this.personalIdentification = personalIdentification;
    this.userName = userName;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.debts = 0.0 ;
    this.realizedLoans = 0;
  }

  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public String getLastNames() {
    return lastNames;
  }

  public void setLastNames(String lastNames) {
    this.lastNames = lastNames;
  }

  public int getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(int personalIdentification) {
    this.personalIdentification = personalIdentification;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ArrayList<BookCopy> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void setBorrowedBooks(ArrayList<BookCopy> borrowedBooks) {
    this.borrowedBooks = borrowedBooks;
  }

  public double getDebts() {
    return debts;
  }

  public void setDebts(double debts) {
    this.debts = debts;
  }

  public int getRealizedLoans() {
    return realizedLoans;
  }

  public void setRealizedLoans(int realizedLoans) {
    this.realizedLoans = realizedLoans;
  }
}
