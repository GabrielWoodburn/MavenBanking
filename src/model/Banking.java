/* Gabriel Woodburn
 * Banking
 * CIS175
 */
package model;

public class Banking {

	// Elements
	private String name;
	private double checking;
	private double savings;
	
	// Default no-arg constructor
	public Banking()
	{
		this.name = "";
		this.checking = 0.0;
		this.savings = 0.0;
	}
	
	// Parameterized constructor
	public Banking(String name)
	{
		this.name = "";
	}
	
	// name getter
	public String getName() {
		return name;
	}
	
	// name setter
	public void setName(String name) {
		this.name = name;
	}
	
	// checking getter
	public double getChecking() {
		return checking;
	}
	
	// checking setter
	public void setChecking(double checking) {
		this.checking = checking;
	}
	
	// savings getter
	public double getSavings() {
		return savings;
	}
	
	// savings setter
	public void setSavings(double savings) {
		this.savings = savings;
	}
	
}
