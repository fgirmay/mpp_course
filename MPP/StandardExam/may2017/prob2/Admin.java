package may2017.prob2;

import java.util.*;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        //implement

        List<CheckoutRecordEntry> entries;

        for (LibraryMember libraryMember : members) {

            libraryMember.getCheckoutRecord().getCheckoutEntryList().contains(item);

            entries = libraryMember.getCheckoutRecord().getCheckoutEntryList();

            for (CheckoutRecordEntry checkoutRecordEntry : entries) {

                if (item.equals(checkoutRecordEntry.getLendingItem())) {

                    phoneNums.add(libraryMember.getPhone());
                }
            }

        }

        Collections.sort(phoneNums);

        return phoneNums;
    }
}
