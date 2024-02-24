package AddressBook.data;

/**
 * The Address Entry class is used to create the individual entries in the Address Book
 * as well as call the constructor and set the values for each of the entries.
 */
public class AddressEntry{
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    int zip;
    String phone;
    String email;

    /**
     * Default constructor for an Address Entry
     */
    public AddressEntry(){
    }
    /**
     * The constructor for an Address Entry in which the fields are passed into the constructor.
     * @param firstName The First Name of the person being added to the address book
     * @param lastName The Last Name of the person being added to the address book
     *                and the part of the entry that will be used to sort the entries.
     * @param street Name of the street for the entry
     * @param city The Name of the City for the entry
     * @param state Name of the state for the entry
     * @param zip Zip code of the entry
     * @param phone Phone number that will be used for the entry
     * @param email Email that is listed with the entry.
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * @return Passes the structure of the Address Entry that will be output.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n"
                + street + "\n" + city + ","
                + state + " "
                + zip + "\n"
                + email + "\n"
                + phone + "\n";
    }

    /**
     * Sets the first name of the address entry.
     * @param firstName The First Name of the Address Entry
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name of the current entry and returns that value.
     * @return the first name of the address entry.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of the address entry
     * @param lastName The Last Name of the Address Entry
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name of the current entry and returns that value.
     * @return the last name of the address entry
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the state for the current address Entry
     * @param state The name of the state for the address entry
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the name of the state for the current address entry
     * @return the name of the state for the address entry
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the city for the current entry
     * @param city The city associated with the current entry
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the name of the city for the entry
     * @return Name of the City for the entry
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the name for the street of the current entry.
     * @param street Name of the street for the current entry
     */

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the name for the street of the current entry.
     * @return Name of the street for the current entry
     */

    public String getStreet() {
        return street;
    }

    /**
     * Gets the Zip Code for the current entry.
     * @return Zip code for the current entry.
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the Zip Code for the current entry.
     * @param zip Zip code for the current entry.
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Sets the phone number for the current entry.
     * @param phone The Phone number for the current entry.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the phone number for the current entry.
     * @return The Phone number for the current entry.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the email address for the current entry.
     * @param email The email address of the current entry.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the email address for the current entry.
     * @return The email address of the current entry.
     */
    public String getEmail() {
        return email;
    }
}
