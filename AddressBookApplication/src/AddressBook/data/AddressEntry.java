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

    public AddressEntry(){
    }
    /**
     * Default constructor for an Address Entry
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

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n"
                + street + "\n" + city + ","
                + state + " "
                + zip + "\n"
                + email + "\n"
                + phone + "\n";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
