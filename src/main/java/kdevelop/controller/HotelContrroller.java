package kdevelop.controller;

import kdevelop.entities.Hotel;
import kdevelop.repository.HotelRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hotels")
public class HotelContrroller {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HotelRepository.class);


    private final HotelRepository hotelRepository;

    @Autowired
    public HotelContrroller(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll(){

        if(hotelRepository.findAll() == null) {
            LOGGER.error("Hotels don't exist");
        }
        return hotelRepository.findAll();
    }

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable(name = "id") String id){

        if(hotelRepository.findById(id).get() == null){
            LOGGER.error("Hotel not found");
        }
        LOGGER.info("Hotel is found");
        return hotelRepository.findById(id).get();

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
