

package soaproject;

import java.util.Objects;

/**
 *
 * @author neilkenney
 */
public class Hotel {

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private int hotel_Id;
    private String hotel_Name;
    private String street_address;
    private String state;
    private String city;
    private String postalcode;
    private String notes;

    public int getHotel_Id() {
        return hotel_Id;
    }

    public void setHotel_Id(int hotel_Id) {
        this.hotel_Id = hotel_Id;
    }

    public String getHotel_Name() {
        return hotel_Name;
    }

    public void setHotel_Name(String hotel_Name) {
        this.hotel_Name = hotel_Name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotel_Id=" + hotel_Id + ", hotel_Name=" + hotel_Name + ", street_address=" + street_address + ", state=" + state + ", postalcode=" + postalcode + ", notes=" + notes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.hotel_Id;
        hash = 89 * hash + Objects.hashCode(this.hotel_Name);
        hash = 89 * hash + Objects.hashCode(this.street_address);
        hash = 89 * hash + Objects.hashCode(this.state);
        hash = 89 * hash + Objects.hashCode(this.postalcode);
        hash = 89 * hash + Objects.hashCode(this.notes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (this.hotel_Id != other.hotel_Id) {
            return false;
        }
        if (!Objects.equals(this.hotel_Name, other.hotel_Name)) {
            return false;
        }
        if (!Objects.equals(this.street_address, other.street_address)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.postalcode, other.postalcode)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
