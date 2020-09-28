package kdevelop.repository;

import kdevelop.entities.Address;
import kdevelop.entities.Hotel;
import kdevelop.entities.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    private HotelRepository hotelRepository;

    @Override
    public void run(String... args) throws Exception {
        Hotel hotel1 = new Hotel(
                "Ibis",
                130,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("FlouFlou", 4, true),
                        new Review("ClairClair", 3, true)
                )
        );

        Hotel hotel2 = new Hotel(
                "Sofetel",
                240,
                new Address("London", "England"),
                Arrays.asList(
                        new Review("Peter", 4, true),
                        new Review("Parker", 5, true)
                )
        );

        Hotel hotel3 = new Hotel(
                "Mariot",
                120,
                new Address("Rome", "Itay"),
                Arrays.asList(
                        new Review("Clark", 3, true),
                        new Review("Kent", 4, true)
                )
        );

        //delete all hotels
        hotelRepository.deleteAll();

        //save all hotels
        List<Hotel> hotels = Arrays.asList(hotel1, hotel2,hotel3);
        hotelRepository.saveAll(hotels);
    }
}
