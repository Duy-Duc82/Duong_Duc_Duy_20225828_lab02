package lab02.src;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }
    
    public String getCategory() {
        return category;
    }
   
    public String getDirector() {
        return director;
    }
    
    public int getLength() {
        return length;
    }
   
    public float getCost() {
        return cost;
    }

    // Constructor with only title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    // Constructor with category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor with director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor with director, category, title, length, and cost
    public DigitalVideoDisc(String director, String category, String title, int length, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.length = length;
    }
}
