/**
 *
 */

/**
 * @author aj
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private String companyName;
	private String shiftTime;
	private Boolean employed;
	private String signature;
	private Boolean multipleSite;

	/**
	 * @param firstName
	 * @param lastName
	 * @param companyName
	 * @param shiftTime
	 * @param employed
	 * @param signature
	 * @param multipleSite
	 */
	public Employee(String firstName, String lastName, String companyName, String shiftTime, Boolean employed,
			String signature, Boolean multipleSite) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.shiftTime = shiftTime;
		this.employed = employed;
		this.signature = signature;
		this.multipleSite = multipleSite;
	}

	/**
	 *
	 */
	public Employee(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the shiftTime
	 */
	public String getShiftTime() {
		return shiftTime;
	}

	/**
	 * @param shiftTime the shiftTime to set
	 */
	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}

	/**
	 * @return the employed
	 */
	public Boolean getEmployed() {
		return employed;
	}

	/**
	 * @param employed the employed to set
	 */
	public void setEmployed(Boolean employed) {
		this.employed = employed;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the multipleSite
	 */
	public Boolean getMultipleSite() {
		return multipleSite;
	}

	/**
	 * @param multipleSite the multipleSite to set
	 */
	public void setMultipleSite(Boolean multipleSite) {
		this.multipleSite = multipleSite;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
