import java.util.ArrayList;

public class Row {
  protected ArrayList<Cell> row;

  public Row(int rowSize) {
    row = new ArrayList<>();
    if (rowSize == 0) {
      row.add(new Cell());
    } else {
      for (int i = 0; i < rowSize; i++) {
        row.add(new Cell());
      }
    }
  }

  public Cell getCell(int index) {
    return row.get(index);
  }

  public void add(Cell cell) {
    row.add(cell);
  }

  public void add(int index, Cell cell) {
    row.add(index, cell);
  }

  public int size() {
    return row.size();
  }
}
