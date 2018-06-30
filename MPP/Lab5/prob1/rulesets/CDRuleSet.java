package prob1.rulesets;

import java.awt.Component;
import java.text.DecimalFormat;

import prob1.gui.CDWindow;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
    private CDWindow cdwindow;
	@Override
	public void applyRules(Component ob) throws RuleException {
	 cdwindow = (CDWindow)ob;
		nonemptyRule();
		//isbnNumericRule();
		priceRule();
		
		
	}
	private void nonemptyRule() throws RuleException {
		if(cdwindow.getArtistValue().trim().isEmpty() ||
				cdwindow.getTitleValue().trim().isEmpty() ||
				cdwindow.getPriceValue().trim().isEmpty() 
				) {
			
			throw new RuleException("All fields must be non-empty!");
		}
	}private void priceRule() throws RuleException {
		String val = cdwindow.getPriceValue().trim();
		Float litersOfPetrol = Float.parseFloat(val);
		try {
			

			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);

			litersOfPetrol = Float.parseFloat(df.format(litersOfPetrol));			
			
	
			//Integer.parseInt(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("price must be with two decimal places");
		}
		if(litersOfPetrol<0.49) throw new RuleException("price must be greater than 0.49");
	}

}
