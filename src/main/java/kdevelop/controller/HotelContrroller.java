package kdevelop.controller;

import kdevelop.entities.Hotel;
import kdevelop.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/hotels")
public class HotelContrroller {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelContrroller(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll(){
        return hotelRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody  Hotel hotel){
        this.hotelRepository.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel){
        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        this.hotelRepository.deleteById(id);
    }
}
