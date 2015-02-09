/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaproject;

import java.util.List;

/**
 *
 * @author neilkenney
 */
public interface DAOInterface {

    void createHotel(String hotel_name, String street_address, String city, String state, String postal_code, String notes);

    void deleteHotelByName(String hotelName);
    //
    //    public static void main(String[] args) {
    //        HotelDao db = new HotelDao();
    //        db.deleteHotelByName("Hotel Neil");
    //        System.out.println(db.getAllHotels());
    //    }

    List<Hotel> getAllHotels();

    void updateZipcodeByHotelName(String hotelName, String newColValue);
    
}
