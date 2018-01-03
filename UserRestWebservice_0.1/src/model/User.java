package model;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {


	@SerializedName("id")
	@Expose
	private Integer id;

	
	@SerializedName("first_name")
	@Expose
	private String firstname;

	private String lastname;
	@SerializedName("email")
	@Expose
	private String email;
	
	@SerializedName("gender")
	@Expose
	private String gender;
	
	@SerializedName("ipaddress")
	@Expose
	private String ipaddress;

	/**
	 * 
	 * @return The id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * 
	 * @param firstname
	 *            The firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * 
	 * @return The lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * 
	 * @param lastname
	 *            The lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * 
	 * @return The email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 *            The email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return The gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @param gender
	 *            The gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @return The ipaddress
	 */
	public String getIpaddress() {
		return ipaddress;
	}

	/**
	 * 
	 * @param ipaddress
	 *            The ipaddress
	 */
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", gender=" + gender + ", ipaddress=" + ipaddress + "]";
	}

}