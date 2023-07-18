package activity_1;

public class QuadrantSelector {

  public int selectQuadrant(int x, int y) {
    int result = 0;
    if (validateInput(x) && validateInput(y)) {
      result = calculateCuadrant(x, y);
    }
    return result;

  }

  private boolean validateInput(int number) {
    boolean result = false;
    if (number != 0) {
        if (number >= -1000 && number <= 1000) {
            result = true;
        }
    }
    return result;
  }

  public int calculateCuadrant(int x, int y) {
    int result = 1;
    if (x > 0) {
        if (y > 0) {
            result = 2;
        } else {
            result = 4;
        }
    } else if (y > 0) {
        result = 1;
    } else {
        result = 3;
    }
    return result;
  }
}
