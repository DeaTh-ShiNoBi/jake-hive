import java.util.ArrayList;

public class Cell {
  protected ArrayList<Tile> cell;

  public Cell() {
    cell = new ArrayList<>();
    cell.add(new Tile());
  }

  public Tile getTile() {
    return cell.get(cell.size() - 1);
  }

  public Tile getTile(int index) {
    return cell.get(index);
  }

  public void add(Tile tile) {
    cell.add(tile);
  }

  public Tile remove() {
    return cell.remove(cell.size() - 1);
  }
}
