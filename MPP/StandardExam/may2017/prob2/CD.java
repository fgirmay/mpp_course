package may2017.prob2;

public class CD extends LendingItem {

    private String productId;
    private String title;
    private String company;

    public CD(String productId, String title, String company) {
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof CD)) {
            return false;
        }

        CD cd = (CD)obj;

        if (this.productId.equals(cd.productId)
                && this.title.equals(cd.title)
                && this.company.equals(cd.company)) {
            return true;

        }

        return false;
    }

}
