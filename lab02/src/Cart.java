package lab02.src;

public class Cart {
    // Giới hạn số lượng DVD tối đa trong giỏ hàng
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    // Mảng lưu trữ các DVD trong giỏ hàng
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    // Số lượng DVD hiện có trong giỏ hàng
    private int qtyOrdered = 0;
    
    // Thêm một DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("CD \"" + disc.getTitle() + "\" da duoc them vao gio.");
        } else {
            System.out.println("Gio hang day.");
        }
    }
    
    // Xóa một DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                // Di chuyển các phần tử phía sau lên để lấp đầy khoảng trống
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("CD \"" + disc.getTitle() + "\" Da duoc xoa khoi gio hang.");
                break;
            }
        }
        if (!found) {
            System.out.println("CD \"" + disc.getTitle() + "\" Khong ton tai trong gio hang.");
        }
    }
    
    // Tính tổng chi phí của các DVD trong giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
