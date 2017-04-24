public class Tile {
  // Fields
  private String color;
  private Bug bug;
  private boolean isEmpty;

  public Tile() {
    this.color = null;
    this.bug = null;
    this.isEmpty = true;
  }

  public Tile(String color, Bug bug) {
    this.color = color;
    this.bug = bug;
    this.isEmpty = false;
  }
}
