package ibdb.entities.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import ibdb.entities.address.Address;
import ibdb.entities.feedback.Feedback;
import ibdb.entities.reviews.Review;

@Entity
public class UserAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
	@SequenceGenerator(name = "user_generator", sequenceName = "user_generator", initialValue = 9900, allocationSize = 1)
	private Integer userId;
	private String emailAddress;
	private String lastName;
	private String firstName;
	private String gender;
	private String username;
	private String password;
	private Date birthDate;
	@OneToOne
	private Address address;
	private String image;
	@OneToMany(mappedBy = "userAccount")
	private List<Review> reviews;
	@OneToMany(mappedBy = "sender")
	private List<Feedback> messages;

	// -----------------getters and setters--------------//

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviewss(List<Review> reviews) {
		this.reviews = reviews;
	}

	public String getUsername() {
		return username;
	}

	public void setUsermane(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Feedback> getMessages() {
		return messages;
	}

	public void setMessages(List<Feedback> messages) {
		this.messages = messages;
	}
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	// -------------------constructors--------------//
	public UserAccount() {
		super();
		this.reviews = new ArrayList<Review>();
		this.messages = new ArrayList<Feedback>();
	}

	public UserAccount(Integer userId, String emailAddress, String lastName, String firstName,
			String gender, String username, String password, Date birthDate, Address address, String image, List<Review> reviews) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
		this.address = address;
		this.image = image;
		this.reviews = reviews;
		this.reviews = new ArrayList<Review>();
		this.messages = new ArrayList<Feedback>();
	}

	public UserAccount(Integer userId, String emailAddress, String lastName, String firstName,
			String gender, String username, String password, Date birthDate) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
	}

}
