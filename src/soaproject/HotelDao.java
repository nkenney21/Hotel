

package soaproject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neilkenney
 */
public class HotelDao implements DAOInterface {
    
    private final DBAccessor dbAccess;
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/hotel";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String TABLE = "hotel";
    private static final String HOTELNAME = "hotel_name";
    private static final List<String> COLNAMES = Arrays.asList("hotel_name, street_address,city,state,postal_code,notes");
    private static final String ZIPCODE = "postal_code";
    public HotelDao(){
        dbAccess = new DB_MySql();
    }

    
    @Override
    public List<Hotel> getAllHotels(){
        
        List<Hotel> hotelList = new <Hotel>ArrayList();
        
        try {
            
            
            dbAccess.openConnection(DRIVER, URL, USERNAME, PASSWORD);
            List<Map> hotelListMap = dbAccess.readRecords("Select * from " + TABLE + ";");
            
            for(int x= 0; x < hotelListMap.size(); x++){
                Hotel hotel = new Hotel();
                
                hotel.setHotel_Id((Integer)(hotelListMap.get(x).get("hotel_id")));
                hotel.setHotel_Name((String)(hotelListMap.get(x).get("hotel_name")));
                hotel.setStreet_address((String)(hotelListMap.get(x).get("street_address")));
                hotel.setCity((String)(hotelListMap.get(x).get("city")));
                hotel.setState((String)(hotelListMap.get(x).get("state")));
                hotel.setPostalcode((String)(hotelListMap.get(x).get("postal_code")));
                hotel.setNotes((String)(hotelListMap.get(x).get("notes")));
                hotelList.add(hotel);
                dbAccess.closeConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hotelList;
        
    }
    
    @Override
    public void createHotel(String hotel_name, String street_address, String city, String state, String postal_code, String notes ){
        
        List<Object> colValues = Arrays.asList(hotel_name,street_address,city,state,postal_code,notes);
        
        
        try {
            dbAccess.openConnection(DRIVER, URL, USERNAME, PASSWORD);
            dbAccess.createRecord(TABLE, COLNAMES, colValues);
            dbAccess.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void updateZipcodeByHotelName(String hotelName, String newColValue ){
        try {
            dbAccess.openConnection(DRIVER, URL, USERNAME, PASSWORD);
            dbAccess.updateRecord(TABLE, ZIPCODE, newColValue, HOTELNAME, hotelName);
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void deleteHotelByName(String hotelName){
        
        try {
            dbAccess.openConnection(DRIVER, URL, USERNAME, PASSWORD);
            dbAccess.deleteRecord(TABLE, HOTELNAME, hotelName);
        } catch (SQLException ex) {
            Logger.getLogger(HotelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
//    
//    public static void main(String[] args) {
//        HotelDao db = new HotelDao();
//        db.deleteHotelByName("Hotel Neil");
//        System.out.println(db.getAllHotels());
//    }
}
