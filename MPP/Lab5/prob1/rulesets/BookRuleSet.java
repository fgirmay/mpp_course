package prob1.rulesets;

import java.awt.Component;
import java.text.DecimalFormat;

import prob1.gui.BookWindow;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {
    private BookWindow bookwindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
        bookwindow = (BookWindow) ob;
        nonemptyRule();
        isbnNumericRule();
        priceRule();


    }

    private void nonemptyRule() throws RuleException {
        if (bookwindow.getIsbnValue().trim().isEmpty() ||
                bookwindow.getTitleValue().trim().isEmpty() ||
                bookwindow.getPriceValue().trim().isEmpty()
                ) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    private void isbnNumericRule() throws RuleException {

        String val = bookwindow.getIsbnValue().trim();
        long newnaumber;
        try {

            if ((val.length() == 10 || val.length() == 13)) {
                newnaumber = Integer.parseInt(val);
            } else {

                throw new RuleException("isbn must be 10 or 13");
            }


        } catch (NumberFormatException e) {
            throw new RuleException("ID must be numeric");
        }
        if (val.length() == 10) {
            if (!(val.charAt(0) == 0) || (val.charAt(0) == 1)) try {

            } catch (NumberFormatException e) {
                throw new RuleException("the first digit must be 0 or 1");
            }


        } else {
            if (val.length() == 13) {
                if (newnaumber / 10000000 != 978 || newnaumber / 10000000 != 979)
                    throw new RuleException("the first digit must be 0 or 1");
            }
        }
    }

    private void priceRule() throws RuleException {
        String val = bookwindow.getPriceValue().trim();
        Float litersOfPetrol = Float.parseFloat(val);

        try {

            DecimalFormat df = new DecimalFormat("0.00");
            df.setMaximumFractionDigits(2);

            litersOfPetrol = Float.parseFloat(df.format(litersOfPetrol));


            //Integer.parseInt(val);
            //val is numeric
        } catch (NumberFormatException e) {
            throw new RuleException("price must be with two decimal places");
        }
        if (litersOfPetrol < 0.49) throw new RuleException("price must be greater than 0.49");
    }


}
