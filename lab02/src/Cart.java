package lab02.src;

public class Cart {
    // Maximum number of DVDs allowed in the cart
    public static final int MAX_NUMBERS_ORDERED = 20;

    // Array to store DVDs in the cart
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    // Current quantity of DVDs in the cart
    private int qtyOrdered = 0;

    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DVD \"" + disc.getTitle() + "\" has been added to the cart.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                // Shift elements to fill the gap
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("DVD \"" + disc.getTitle() + "\" has been removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("DVD \"" + disc.getTitle() + "\" does not exist in the cart.");
        }
    }

    // Calculate the total cost of DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Print information of DVDs in the cart
    public void printAllDisc() {
        System.out.println("DVDs in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println("Title: " + disc.getTitle() +
                               ", Category: " + disc.getCategory() +
                               ", Director: " + disc.getDirector() +
                               ", Length: " + disc.getLength() +
                               ", Cost: " + disc.getCost());
        }
    }
}
