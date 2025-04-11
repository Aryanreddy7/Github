package com.xworkz.Object.Runner;

import com.xworkz.Object.toString.*;

public class Runner {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner("LG", 5, "big");
        System.out.println(airConditioner);
        System.out.println("My Code: " + airConditioner.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(airConditioner));
        System.out.println("======================================");

        Airport airport = new Airport("Heathrow", "London", "Davangere");
        System.out.println(airport);
        System.out.println("My Code: " + airport.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(airport));
        System.out.println("======================================");

        Animal animal = new Animal("Lion", 8, "Savannah");
        System.out.println(animal);
        System.out.println("My Code: " + animal.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(animal));
        System.out.println("======================================");

        Aquarium aquarium = new Aquarium("SeaWorld", 5000, "Good");
        System.out.println(aquarium);
        System.out.println("My Code: " + aquarium.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(aquarium));
        System.out.println("======================================");

        BankAccount bankAccount = new BankAccount("Alice", "987654321", 12000.50);
        System.out.println(bankAccount);
        System.out.println("My Code: " + bankAccount.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(bankAccount));
        System.out.println("======================================");

        Bed bed = new Bed("Queen", "Wood", true);
        System.out.println(bed);
        System.out.println("My Code: " + bed.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(bed));
        System.out.println("======================================");

        Bicycle bicycle = new Bicycle("Hero", "Red", 20);
        System.out.println(bicycle);
        System.out.println("My Code: " + bicycle.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(bicycle));
        System.out.println("======================================");

        Blender blender = new Blender("Philips", 5, false);
        System.out.println(blender);
        System.out.println("My Code: " + blender.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(blender));
        System.out.println("======================================");

        Book book = new Book("The Alchemist", "Paulo Coelho", 208);
        System.out.println(book);
        System.out.println("My Code: " + book.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(book));
        System.out.println("======================================");

        Building building = new Building("Skyscraper", 50, "New York");
        System.out.println(building);
        System.out.println("My Code: " + building.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(building));
        System.out.println("======================================");

        Camera camera = new Camera("Canon", 24, 200000);
        System.out.println(camera);
        System.out.println("My Code: " + camera.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(camera));
        System.out.println("======================================");

        Car car = new Car("BMW", "XM", 2024);
        System.out.println(car);
        System.out.println("My Code: " + car.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(car));
        System.out.println("======================================");

        Chair chair = new Chair("Office", "Black", true);
        System.out.println(chair);
        System.out.println("My Code: " + chair.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(chair));
        System.out.println("======================================");

        Chef chef = new Chef("Gordon Ramsay", "Daal", 10);
        System.out.println(chef);
        System.out.println("My Code: " + chef.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(chef));
        System.out.println("======================================");

        ChefKnife chefKnife = new ChefKnife("Wüsthof", 8, "Gold");
        System.out.println(chefKnife);
        System.out.println("My Code: " + chefKnife.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(chefKnife));
        System.out.println("======================================");

        City city = new City("Tokyo", "Japan", 13900000);
        System.out.println(city);
        System.out.println("My Code: " + city.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(city));
        System.out.println("======================================");

        Clock clock = new Clock("Digital", false, "Black");
        System.out.println(clock);
        System.out.println("My Code: " + clock.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(clock));
        System.out.println("======================================");

        Clothing clothing = new Clothing("T-Shirt", "M", "Cotton");
        System.out.println(clothing);
        System.out.println("My Code: " + clothing.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(clothing));
        System.out.println("======================================");

        CoffeeMachine coffeeMachine = new CoffeeMachine("Nespresso", true, 100);
        System.out.println(coffeeMachine);
        System.out.println("My Code: " + coffeeMachine.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(coffeeMachine));
        System.out.println("======================================");

        Console console = new Console("PlayStation", 5, true);
        System.out.println(console);
        System.out.println("My Code: " + console.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(console));
        System.out.println("======================================");

        Currency currency = new Currency("Dollar", "USD", 1.0);
        System.out.println(currency);
        System.out.println("My Code: " + currency.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(currency));
        System.out.println("======================================");

        Delivery delivery = new Delivery("Order123", "New York", true);
        System.out.println(delivery);
        System.out.println("My Code: " + delivery.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(delivery));
        System.out.println("======================================");

        Desk desk = new Desk("Wooden", "Brown", 3);
        System.out.println(desk);
        System.out.println("My Code: " + desk.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(desk));
        System.out.println("======================================");

        Dishwasher dishwasher = new Dishwasher("Bosch", 12, true);
        System.out.println(dishwasher);
        System.out.println("My Code: " + dishwasher.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(dishwasher));
        System.out.println("======================================");

        Drone drone = new Drone("DJI", 25, 6);
        System.out.println(drone);
        System.out.println("My Code: " + drone.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(drone));
        System.out.println("======================================");

        Employee employee = new Employee("Bob", "Sales", 45000.0);
        System.out.println(employee);
        System.out.println("My Code: " + employee.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(employee));
        System.out.println("======================================");

        Fan fan = new Fan("Usha", 3, true);
        System.out.println(fan);
        System.out.println("My Code: " + fan.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(fan));
        System.out.println("======================================");

        Festival festival = new Festival("Diwali", "India", "October");
        System.out.println(festival);
        System.out.println("My Code: " + festival.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(festival));
        System.out.println("======================================");

        Flashlight flashlight = new Flashlight("Eveready", 1000, true);
        System.out.println(flashlight);
        System.out.println("My Code: " + flashlight.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(flashlight));
        System.out.println("======================================");

        Flight flight = new Flight("AI202", "Delhi", "Mumbai");
        System.out.println(flight);
        System.out.println("My Code: " + flight.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(flight));
        System.out.println("======================================");

        Furniture furniture = new Furniture("Table", "Oak", 2);
        System.out.println(furniture);
        System.out.println("My Code: " + furniture.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(furniture));
        System.out.println("======================================");

        Game game = new Game("Minecraft", "Sandbox", 9.5);
        System.out.println(game);
        System.out.println("My Code: " + game.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(game));
        System.out.println("======================================");

        Grill grill = new Grill("Weber", 10, true);
        System.out.println(grill);
        System.out.println("My Code: " + grill.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(grill));
        System.out.println("======================================");

        GroceryItem groceryItem = new GroceryItem("Rice", 5, "Kg");
        System.out.println(groceryItem);
        System.out.println("My Code: " + groceryItem.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(groceryItem));
        System.out.println("======================================");

        HairDryer hairDryer = new HairDryer("Panasonic", 1800, true);
        System.out.println(hairDryer);
        System.out.println("My Code: " + hairDryer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(hairDryer));
        System.out.println("======================================");

        Heater heater = new Heater("Orient", 1500, true);
        System.out.println(heater);
        System.out.println("My Code: " + heater.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(heater));
        System.out.println("======================================");

        Hospital hospital = new Hospital("Apollo", 250, "Bangalore");
        System.out.println(hospital);
        System.out.println("My Code: " + hospital.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(hospital));
        System.out.println("======================================");

        IceCream iceCream = new IceCream("Vanilla", "Amul", 100);
        System.out.println(iceCream);
        System.out.println("My Code: " + iceCream.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(iceCream));
        System.out.println("======================================");

        Juicer juicer = new Juicer("Sujata", true, 100);
        System.out.println(juicer);
        System.out.println("My Code: " + juicer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(juicer));
        System.out.println("======================================");

        Kettle kettle = new Kettle("Prestige", 1.8, true);
        System.out.println(kettle);
        System.out.println("My Code: " + kettle.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(kettle));
        System.out.println("======================================");

        Laptop laptop = new Laptop("HP", "Ryzen 5", 16);
        System.out.println(laptop);
        System.out.println("My Code: " + laptop.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(laptop));
        System.out.println("======================================");

        LightBulb lightBulb = new LightBulb("Philips", 9, "Balck");
        System.out.println(lightBulb);
        System.out.println("My Code: " + lightBulb.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(lightBulb));
        System.out.println("======================================");

        Microwave microwave = new Microwave("Samsung", 1000, true);
        System.out.println(microwave);
        System.out.println("My Code: " + microwave.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(microwave));
        System.out.println("======================================");

        Mirror mirror = new Mirror("Oval", "Glass", true);
        System.out.println(mirror);
        System.out.println("My Code: " + mirror.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(mirror));
        System.out.println("======================================");

        Mixer mixer = new Mixer("Bajaj", 3, true);
        System.out.println(mixer);
        System.out.println("My Code: " + mixer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(mixer));
        System.out.println("======================================");

        Mouse mouse = new Mouse("Logitech", true, 1200);
        System.out.println(mouse);
        System.out.println("My Code: " + mouse.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(mouse));
        System.out.println("======================================");

        Movie movie = new Movie("Interstellar", "Christopher Nolan", 169);
        System.out.println(movie);
        System.out.println("My Code: " + movie.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(movie));
        System.out.println("======================================");

        Museum museum = new Museum("Louvre", "Paris", 2);
        System.out.println(museum);
        System.out.println("My Code: " + museum.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(museum));
        System.out.println("======================================");

        MusicAlbum musicAlbum = new MusicAlbum("Thriller", "Michael Jackson", 1982);
        System.out.println(musicAlbum);
        System.out.println("My Code: " + musicAlbum.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(musicAlbum));
        System.out.println("======================================");

        Oven oven = new Oven("LG", 2000, true);
        System.out.println(oven);
        System.out.println("My Code: " + oven.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(oven));
        System.out.println("======================================");

        Painter painter = new Painter("Vincent", "Van Gogh", 10);
        System.out.println(painter);
        System.out.println("My Code: " + painter.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(painter));
        System.out.println("======================================");

        PainterTool painterTool = new PainterTool("Brush", "Synthetic", 100);
        System.out.println(painterTool);
        System.out.println("My Code: " + painterTool.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(painterTool));
        System.out.println("======================================");

        Pet pet = new Pet("Dog", "Beagle", 3);
        System.out.println(pet);
        System.out.println("My Code: " + pet.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(pet));
        System.out.println("======================================");

        Phone phone = new Phone("Samsung", "S23", 799.99);
        System.out.println(phone);
        System.out.println("My Code: " + phone.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(phone));
        System.out.println("======================================");

        Planet planet = new Planet("Earth", 1, 20);
        System.out.println(planet);
        System.out.println("My Code: " + planet.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(planet));
        System.out.println("======================================");

        Podcast podcast = new Podcast("TechTalk", "John", 10);
        System.out.println(podcast);
        System.out.println("My Code: " + podcast.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(podcast));
        System.out.println("======================================");

        PodcastEpisode podcastEpisode = new PodcastEpisode("AI in 2025", "Aryan", 10);
        System.out.println(podcastEpisode);
        System.out.println("My Code: " + podcastEpisode.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(podcastEpisode));
        System.out.println("======================================");

        Printer printer = new Printer("Canon", "B/W", true);
        System.out.println(printer);
        System.out.println("My Code: " + printer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(printer));
        System.out.println("======================================");

        Refrigerator refrigerator = new Refrigerator("LG", 310, true);
        System.out.println(refrigerator);
        System.out.println("My Code: " + refrigerator.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(refrigerator));
        System.out.println("======================================");

        Restaurant restaurant = new Restaurant("Domino's", "Italian", 4);
        System.out.println(restaurant);
        System.out.println("My Code: " + restaurant.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(restaurant));
        System.out.println("======================================");

        RiceCooker riceCooker = new RiceCooker("Panasonic", 10, true);
        System.out.println(riceCooker);
        System.out.println("My Code: " + riceCooker.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(riceCooker));
        System.out.println("======================================");

        Smartwatch smartwatch = new Smartwatch("Apple", false, 5);
        System.out.println(smartwatch);
        System.out.println("My Code: " + smartwatch.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(smartwatch));
        System.out.println("======================================");

        Sofa sofa = new Sofa("Leather", 3, true);
        System.out.println(sofa);
        System.out.println("My Code: " + sofa.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(sofa));
        System.out.println("======================================");

        SpaceMission spaceMission = new SpaceMission("Apollo 11", "NASA", 365);
        System.out.println(spaceMission);
        System.out.println("My Code: " + spaceMission.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(spaceMission));
        System.out.println("======================================");

        Speaker speaker = new Speaker("Boat", 50, true);
        System.out.println(speaker);
        System.out.println("My Code: " + speaker.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(speaker));
        System.out.println("======================================");

        Student student = new Student("John", 20, "Physics");
        System.out.println(student);
        System.out.println("My Code: " + student.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(student));
        System.out.println("======================================");

        Sunglasses sunglasses = new Sunglasses("Ray-Ban", "Brown", true);
        System.out.println(sunglasses);
        System.out.println("My Code: " + sunglasses.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(sunglasses));
        System.out.println("======================================");

        Tablet tablet = new Tablet("iPad", 10.2, 0);
        System.out.println(tablet);
        System.out.println("My Code: " + tablet.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(tablet));
        System.out.println("======================================");

        Teacher teacher = new Teacher("Mrs. Smith", "Science", 12);
        System.out.println(teacher);
        System.out.println("My Code: " + teacher.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(teacher));
        System.out.println("======================================");

        Television television = new Television("Sony", 55, true);
        System.out.println(television);
        System.out.println("My Code: " + television.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(television));
        System.out.println("======================================");

        Thermometer thermometer = new Thermometer("Glass", 42.0, false);
        System.out.println(thermometer);
        System.out.println("My Code: " + thermometer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(thermometer));
        System.out.println("======================================");

        Ticket ticket = new Ticket("Concert", "VIP", 299.99);
        System.out.println(ticket);
        System.out.println("My Code: " + ticket.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(ticket));
        System.out.println("======================================");

        Toaster toaster = new Toaster("Morphy", 2, true);
        System.out.println(toaster);
        System.out.println("My Code: " + toaster.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(toaster));
        System.out.println("======================================");

        Train train = new Train("Rajdhani", 5, "Mumbai");
        System.out.println(train);
        System.out.println("My Code: " + train.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(train));
        System.out.println("======================================");

        Tree tree = new Tree("Mango", 15, 25);
        System.out.println(tree);
        System.out.println("My Code: " + tree.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(tree));
        System.out.println("======================================");

        TV tv = new TV("LG", 43, true);
        System.out.println(tv);
        System.out.println("My Code: " + tv.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(tv));
        System.out.println("======================================");

        TVShow tvShow = new TVShow("Friends", 10, "Horror");
        System.out.println(tvShow);
        System.out.println("My Code: " + tvShow.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(tvShow));
        System.out.println("======================================");

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Dyson", "Big", 1200);
        System.out.println(vacuumCleaner);
        System.out.println("My Code: " + vacuumCleaner.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(vacuumCleaner));
        System.out.println("======================================");

        Volunteer volunteer = new Volunteer("Sam", "CleanUp Drive", 5);
        System.out.println(volunteer);
        System.out.println("My Code: " + volunteer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(volunteer));
        System.out.println("======================================");

        Wallet wallet = new Wallet("Leather", 6, "White");
        System.out.println(wallet);
        System.out.println("My Code: " + wallet.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(wallet));
        System.out.println("======================================");

        Wardrobe wardrobe = new Wardrobe(2, "Vialot", true);
        System.out.println(wardrobe);
        System.out.println("My Code: " + wardrobe.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(wardrobe));
        System.out.println("======================================");

        WashingMachine washingMachine = new WashingMachine("IFB", 7.0, true);
        System.out.println(washingMachine);
        System.out.println("My Code: " + washingMachine.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(washingMachine));
        System.out.println("======================================");

        Watch watch = new Watch("Fossil", "Metal", 10000);
        System.out.println(watch);
        System.out.println("My Code: " + watch.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(watch));
        System.out.println("======================================");

        WeatherReport weatherReport = new WeatherReport("Sunny", 32, "Hyderabad");
        System.out.println(weatherReport);
        System.out.println("My Code: " + weatherReport.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(weatherReport));
        System.out.println("======================================");

        YogaMat yogaMat = new YogaMat("Decathlon", 20, "Blue");
        System.out.println(yogaMat);
        System.out.println("My Code: " + yogaMat.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(yogaMat));
        System.out.println("======================================");

        System.out.println("======================================");
        System.out.println("======================================");



    }
}
