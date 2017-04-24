import java.util.ArrayList;

public class Board {
  protected ArrayList<Row> board;

  public Board() {
    board = new ArrayList<>();
    if (board.isEmpty()) {
      board.add(new Row(0));
    } else {
      board.add(new Row(board.get(0).size()));
    }
  }

  public Row getRow(int index) {
    return board.get(index);
  }

  public void growDown() {
    board.add(new Row(board.get(0).size()));
  }

  public void growUp() {
    board.add(0, new Row(board.get(0).size()));
  }

  public void growRight() {
    for (int i = 0; i < board.size(); i++) {
      board.get(i).add(new Cell());
    }
  }

  public void growLeft() {
    for (int i = 0; i < board.size(); i++) {
      board.get(i).add(0, new Cell());
    }
  }

  public void clear() {
    board.clear();
  }
}
