

package soaproject;

import java.util.List;

/**
 *
 * @author neilkenney
 */
public class HotelService {
    
    DAOInterface dao = new HotelDao();
    
    
    public List<Hotel> returnAllRecords(String tableName){
        return dao.getAllHotels();
    }
    
    public void deleteRecordByName(String name){
        dao.deleteHotelByName(name);
    }
    
    public void updateZipcode(String hotelName, String newZipCode){
        dao.updateZipcodeByHotelName(hotelName, newZipCode);
    }
    
    public void createRecord(String hotel_name, String street_address, String city, String state, String postal_code, String notes){
        dao.createHotel(hotel_name, street_address,city,state,postal_code,notes);
    }

}
