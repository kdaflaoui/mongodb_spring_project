package kdevelop.controller;

import kdevelop.entities.Hotel;
import kdevelop.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hotels")
public class HotelContrroller {
    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/all")
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }
}
