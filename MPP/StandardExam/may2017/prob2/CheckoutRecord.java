package may2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<>();

    public List<CheckoutRecordEntry> getCheckoutEntryList() {
        return checkoutEntryList;
    }

    public void addCheckoutEntry(CheckoutRecordEntry entry) {
        this.checkoutEntryList.add(entry);
    }
	
}
