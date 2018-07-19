package may2017.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {

    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem lendingItem;
    private ItemType itemType;

    public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {

        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.lendingItem = item;
        this.itemType = itemType;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
