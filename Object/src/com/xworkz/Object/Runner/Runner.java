package com.xworkz.Object.Runner;

import com.xworkz.Object.toString.*;

public class Runner {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner("LG", 5, "big");
        System.out.println(airConditioner);
        System.out.println("My Code: " + airConditioner.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(airConditioner));
        AirConditioner airConditioner2 = new AirConditioner("Sony", 5, "big");
        boolean check = airConditioner.equals(airConditioner2);
        System.out.println("Same?? : " + check);
        System.out.println("======================================");

        Airport airport = new Airport("Heathrow", "London", "Davangere");
        System.out.println(airport);
        System.out.println("My Code: " + airport.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(airport));
        Airport airport1 = new Airport("Heathrow", "London", "Davangere");
        boolean checkAirport = airport.equals(airport1);
        System.out.println("Same?? : " + checkAirport);
        System.out.println("======================================");

        Animal animal = new Animal("Lion", 8, "Savannah");
        System.out.println(animal);
        System.out.println("My Code: " + animal.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(animal));
        Animal animal1 = new Animal("Tiger", 10, "Jungle");
        boolean checkAnimal = animal.equals(animal1);
        System.out.println("Same?? : " + checkAnimal);
        System.out.println("======================================");

        Aquarium aquarium = new Aquarium("SeaWorld", 5000, "Good");
        System.out.println(aquarium);
        System.out.println("My Code: " + aquarium.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(aquarium));
        Aquarium aquarium1 = new Aquarium("OceanPark", 6000, "Good");
        boolean checkAquarium = aquarium.equals(aquarium1);
        System.out.println("Same?? : " + checkAquarium);
        System.out.println("======================================");

        BankAccount bankAccount = new BankAccount("Alice", "987654321", 12000.50);
        System.out.println(bankAccount);
        System.out.println("My Code: " + bankAccount.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(bankAccount));
        BankAccount bankAccount1 = new BankAccount("Alice", "987654321", 15000.50);
        boolean checkBankAccount = bankAccount.equals(bankAccount1);
        System.out.println("Same?? : " + checkBankAccount);
        System.out.println("======================================");

        Bed bed = new Bed("Queen", "Wood", true);
        System.out.println(bed);
        System.out.println("My Code: " + bed.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(bed));
        Bed bed1 = new Bed("King", "Metal", true);
        boolean checkBed = bed.equals(bed1);
        System.out.println("Same?? : " + checkBed);
        System.out.println("======================================");

        Bicycle bicycle = new Bicycle("Hero", "Red", 20);
        System.out.println(bicycle);
        System.out.println("My Code: " + bicycle.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(bicycle));
        Bicycle bicycle1 = new Bicycle("Trek", "Blue", 25);
        boolean checkBicycle = bicycle.equals(bicycle1);
        System.out.println("Same?? : " + checkBicycle);
        System.out.println("======================================");

        Blender blender = new Blender("Philips", 5, false);
        System.out.println(blender);
        System.out.println("My Code: " + blender.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(blender));
        Blender blender1 = new Blender("Philips", 5, false);
        boolean checkBlender = blender.equals(blender1);
        System.out.println("Same?? : " + checkBlender);
        System.out.println("======================================");

        Book book = new Book("The Alchemist", "Paulo Coelho", 208);
        System.out.println(book);
        System.out.println("My Code: " + book.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(book));
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 208);
        boolean checkBook = book.equals(book1);
        System.out.println("Same?? : " + checkBook);
        System.out.println("======================================");

        Building building = new Building("Skyscraper", 50, "New York");
        System.out.println(building);
        System.out.println("My Code: " + building.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(building));
        Building building1 = new Building("Bungalow", 10, "London");
        boolean checkBuilding = building.equals(building1);
        System.out.println("Same?? : " + checkBuilding);
        System.out.println("======================================");

        Camera camera = new Camera("Canon", 24, 200000);
        System.out.println(camera);
        System.out.println("My Code: " + camera.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(camera));
        Camera camera1 = new Camera("Nikon", 50, 150000);
        boolean checkCamera = camera.equals(camera1);
        System.out.println("Same?? : " + checkCamera);
        System.out.println("======================================");

        Car car = new Car("BMW", "XM", 2024);
        System.out.println(car);
        System.out.println("My Code: " + car.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(car));
        Car car1 = new Car("BMW", "XM", 2024);
        boolean checkCar = car.equals(car1);
        System.out.println("Same?? : " + checkCar);
        System.out.println("======================================");

        Chair chair = new Chair("Office", "Black", true);
        System.out.println(chair);
        System.out.println("My Code: " + chair.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(chair));
        Chair chair1 = new Chair("Office", "Black", true);
        boolean checkChair = chair.equals(chair1);
        System.out.println("Same?? : " + checkChair);
        System.out.println("======================================");

        Chef chef = new Chef("Gordon Ramsay", "Daal", 10);
        System.out.println(chef);
        System.out.println("My Code: " + chef.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(chef));
        Chef chef1 = new Chef("Jamie Oliver", "Pizza", 15);
        boolean checkChef = chef.equals(chef1);
        System.out.println("Same?? : " + checkChef);
        System.out.println("======================================");

        ChefKnife chefKnife = new ChefKnife("Wüsthof", 8, "Gold");
        System.out.println(chefKnife);
        System.out.println("My Code: " + chefKnife.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(chefKnife));
        ChefKnife chefKnife1 = new ChefKnife("Global", 10, "Silver");
        boolean checkChefKnife = chefKnife.equals(chefKnife1);
        System.out.println("Same?? : " + checkChefKnife);
        System.out.println("======================================");

        City city = new City("Tokyo", "Japan", 13900000);
        System.out.println(city);
        System.out.println("My Code: " + city.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(city));
        City city1 = new City("Tokyo", "Japan", 13900000);
        boolean checkCity = city.equals(city1);
        System.out.println("Same?? : " + checkCity);
        System.out.println("======================================");

        Clock clock = new Clock("Digital", false, "Black");
        System.out.println(clock);
        System.out.println("My Code: " + clock.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(clock));
        Clock clock1= new Clock("Analog", true, "White");
        boolean checkClock = clock.equals(clock1);
        System.out.println("Same?? : " + checkClock);
        System.out.println("======================================");

        Clothing clothing = new Clothing("T-Shirt", "M", "Cotton");
        System.out.println(clothing);
        System.out.println("My Code: " + clothing.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(clothing));
        Clothing clothing1 = new Clothing("Shirt", "L", "Wool");
        boolean checkClothing = clothing.equals(clothing1);
        System.out.println("Same?? : " + checkClothing);
        System.out.println("======================================");

        CoffeeMachine coffeeMachine = new CoffeeMachine("Nespresso", true, 100);
        System.out.println(coffeeMachine);
        System.out.println("My Code: " + coffeeMachine.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(coffeeMachine));
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("DeLonghi", true, 200);
        boolean checkCoffeeMachine = coffeeMachine.equals(coffeeMachine1);
        System.out.println("Same?? : " + checkCoffeeMachine);
        System.out.println("======================================");

        Console console = new Console("PlayStation", 5, true);
        System.out.println(console);
        System.out.println("My Code: " + console.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(console));
        Console console1 = new Console("Xbox", 3, false);
        boolean checkConsole = console.equals(console1);
        System.out.println("Same?? : " + checkConsole);
        System.out.println("======================================");

        Currency currency = new Currency("Dollar", "USD", 1.0);
        System.out.println(currency);
        System.out.println("My Code: " + currency.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(currency));
        Currency currency1 = new Currency("Euro", "EUR", 1.2);
        boolean checkCurrency = currency.equals(currency1);
        System.out.println("Same?? : " + checkCurrency);
        System.out.println("======================================");

        Delivery delivery = new Delivery("Order123", "New York", true);
        System.out.println(delivery);
        System.out.println("My Code: " + delivery.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(delivery));
        Delivery delivery1 = new Delivery("Order124", "Los Angeles", false);
        boolean checkDelivery = delivery.equals(delivery1);
        System.out.println("Same?? : " + checkDelivery);
        System.out.println("======================================");

        Desk desk = new Desk("Wooden", "Brown", 3);
        System.out.println(desk);
        System.out.println("My Code: " + desk.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(desk));
        Desk desk1 = new Desk("Metal", "Black", 4);
        boolean checkDesk = desk.equals(desk1);
        System.out.println("Same?? : " + checkDesk);
        System.out.println("======================================");

        Dishwasher dishwasher = new Dishwasher("Bosch", 12, true);
        System.out.println(dishwasher);
        System.out.println("My Code: " + dishwasher.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(dishwasher));
        Dishwasher dishwasher1 = new Dishwasher("Whirlpool", 15, false);
        boolean checkDishwasher = dishwasher.equals(dishwasher1);
        System.out.println("Same?? : " + checkDishwasher);
        System.out.println("======================================");

        Drone drone = new Drone("DJI", 25, 6);
        System.out.println(drone);
        System.out.println("My Code: " + drone.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(drone));
        Drone drone1 = new Drone("Parrot", 20, 4);
        boolean checkDrone = drone.equals(drone1);
        System.out.println("Same?? : " + checkDrone);
        System.out.println("======================================");

        Employee employee = new Employee("Bob", "Sales", 45000.0);
        System.out.println(employee);
        System.out.println("My Code: " + employee.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(employee));
        Employee employee1 = new Employee("Alice", "HR", 55000.0);
        boolean checkEmployee = employee.equals(employee1);
        System.out.println("Same?? : " + checkEmployee);
        System.out.println("======================================");

        Fan fan = new Fan("Usha", 3, true);
        System.out.println(fan);
        System.out.println("My Code: " + fan.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(fan));
        Fan fan1 = new Fan("Havells", 4, false);
        boolean checkFan = fan.equals(fan1);
        System.out.println("Same?? : " + checkFan);
        System.out.println("======================================");

        Festival festival = new Festival("Diwali", "India", "October");
        System.out.println(festival);
        System.out.println("My Code: " + festival.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(festival));
        Festival festival1 = new Festival("Christmas", "USA", "December");
        boolean checkFestival = festival.equals(festival1);
        System.out.println("Same?? : " + checkFestival);
        System.out.println("======================================");

        Flashlight flashlight = new Flashlight("Eveready", 1000, true);
        System.out.println(flashlight);
        System.out.println("My Code: " + flashlight.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(flashlight));
        Flashlight flashlight1 = new Flashlight("Philips", 1200, false);
        boolean checkFlashlight = flashlight.equals(flashlight1);
        System.out.println("Same?? : " + checkFlashlight);
        System.out.println("======================================");

        Flight flight = new Flight("AI202", "Delhi", "Mumbai");
        System.out.println(flight);
        System.out.println("My Code: " + flight.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(flight));
        Flight flight1 = new Flight("AI203", "Delhi", "Bangalore");
        boolean checkFlight = flight.equals(flight1);
        System.out.println("Same?? : " + checkFlight);
        System.out.println("======================================");

        Furniture furniture = new Furniture("Table", "Oak", 2);
        System.out.println(furniture);
        System.out.println("My Code: " + furniture.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(furniture));
        Furniture furniture1 = new Furniture("Chair", "Pine", 1);
        boolean checkFurniture = furniture.equals(furniture1);
        System.out.println("Same?? : " + checkFurniture);
        System.out.println("======================================");

        Game game = new Game("Minecraft", "Sandbox", 9.5);
        System.out.println(game);
        System.out.println("My Code: " + game.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(game));
        Game game1 = new Game("Fortnite", "Battle Royale", 9.0);
        boolean checkGame = game.equals(game1);
        System.out.println("Same?? : " + checkGame);
        System.out.println("======================================");

        Grill grill = new Grill("Weber", 10, true);
        System.out.println(grill);
        System.out.println("My Code: " + grill.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(grill));
        Grill grill1 = new Grill("CharBroil", 8, false);
        boolean checkGrill = grill.equals(grill1);
        System.out.println("Same?? : " + checkGrill);
        System.out.println("======================================");

        GroceryItem groceryItem = new GroceryItem("Rice", 5, "Kg");
        System.out.println(groceryItem);
        System.out.println("My Code: " + groceryItem.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(groceryItem));
        GroceryItem groceryItem1 = new GroceryItem("Wheat", 3, "Kg");
        boolean checkGroceryItem = groceryItem.equals(groceryItem1);
        System.out.println("Same?? : " + checkGroceryItem);
        System.out.println("======================================");

        HairDryer hairDryer = new HairDryer("Panasonic", 1800, true);
        System.out.println(hairDryer);
        System.out.println("My Code: " + hairDryer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(hairDryer));
        HairDryer hairDryer1 = new HairDryer("Philips", 1500, false);
        boolean checkHairDryer = hairDryer.equals(hairDryer1);
        System.out.println("Same?? : " + checkHairDryer);
        System.out.println("======================================");

        Heater heater = new Heater("Orient", 1500, true);
        System.out.println(heater);
        System.out.println("My Code: " + heater.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(heater));
        Heater heater1 = new Heater("Bajaj", 2000, false);
        boolean checkHeater = heater.equals(heater1);
        System.out.println("Same?? : " + checkHeater);
        System.out.println("======================================");


        Hospital hospital = new Hospital("Apollo", 250, "Bangalore");
        System.out.println(hospital);
        System.out.println("My Code: " + hospital.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(hospital));
        Hospital hospital1 = new Hospital("Fortis", 300, "Mumbai");
        boolean checkHospital = hospital.equals(hospital1);
        System.out.println("Same?? : " + checkHospital);
        System.out.println("======================================");

        IceCream iceCream = new IceCream("Vanilla", "Amul", 100);
        System.out.println(iceCream);
        System.out.println("My Code: " + iceCream.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(iceCream));
        IceCream iceCream1 = new IceCream("Chocolate", "Kwality", 120);
        boolean checkIceCream = iceCream.equals(iceCream1);
        System.out.println("Same?? : " + checkIceCream);
        System.out.println("======================================");

        Juicer juicer = new Juicer("Sujata", true, 100);
        System.out.println(juicer);
        System.out.println("My Code: " + juicer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(juicer));
        Juicer juicer1 = new Juicer("Philips", false, 120);
        boolean checkJuicer = juicer.equals(juicer1);
        System.out.println("Same?? : " + checkJuicer);
        System.out.println("======================================");

        Kettle kettle = new Kettle("Prestige", 1.8, true);
        System.out.println(kettle);
        System.out.println("My Code: " + kettle.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(kettle));
        Kettle kettle1 = new Kettle("Borosil", 1.5, false);
        boolean checkKettle = kettle.equals(kettle1);
        System.out.println("Same?? : " + checkKettle);
        System.out.println("======================================");

        Laptop laptop = new Laptop("HP", "Ryzen 5", 16);
        System.out.println(laptop);
        System.out.println("My Code: " + laptop.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(laptop));
        Laptop laptop1 = new Laptop("Dell", "Intel i7", 32);
        boolean checkLaptop = laptop.equals(laptop1);
        System.out.println("Same?? : " + checkLaptop);
        System.out.println("======================================");

        LightBulb lightBulb = new LightBulb("Philips", 9, "Black");
        System.out.println(lightBulb);
        System.out.println("My Code: " + lightBulb.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(lightBulb));
        LightBulb lightBulb1 = new LightBulb("Syska", 12, "White");
        boolean checkLightBulb = lightBulb.equals(lightBulb1);
        System.out.println("Same?? : " + checkLightBulb);
        System.out.println("======================================");

        Microwave microwave = new Microwave("Samsung", 1000, true);
        System.out.println(microwave);
        System.out.println("My Code: " + microwave.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(microwave));
        Microwave microwave1 = new Microwave("LG", 1200, false);
        boolean checkMicrowave = microwave.equals(microwave1);
        System.out.println("Same?? : " + checkMicrowave);
        System.out.println("======================================");

        Mirror mirror = new Mirror("Oval", "Glass", true);
        System.out.println(mirror);
        System.out.println("My Code: " + mirror.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(mirror));
        Mirror mirror1 = new Mirror("Round", "Plastic", false);
        boolean checkMirror = mirror.equals(mirror1);
        System.out.println("Same?? : " + checkMirror);
        System.out.println("======================================");

        Mixer mixer = new Mixer("Bajaj", 3, true);
        System.out.println(mixer);
        System.out.println("My Code: " + mixer.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(mixer));
        Mixer mixer1 = new Mixer("Bajaj", 3, true);
        boolean checkMixer = mixer.equals(mixer1);
        System.out.println("Same?? : " + checkMixer);
        System.out.println("======================================");

        Mouse mouse = new Mouse("Logitech", true, 1200);
        System.out.println(mouse);
        System.out.println("My Code: " + mouse.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(mouse));
        Mouse mouse1 = new Mouse("HP", true, 1600);
        boolean checkMouse = mouse.equals(mouse1);
        System.out.println("Same?? : " + checkMouse);
        System.out.println("======================================");

        Movie movie = new Movie("Interstellar", "Christopher Nolan", 169);
        System.out.println(movie);
        System.out.println("My Code: " + movie.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(movie));
        Movie movie1 = new Movie("Arya2", "Aryan", 1600);
        boolean checkMovie = movie.equals(movie1);
        System.out.println("Same?? : " + checkMouse);
        System.out.println("======================================");

        Museum museum = new Museum("Louvre", "Paris", 2);
        System.out.println(museum);
        System.out.println("My Code: " + museum.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(museum));
        Museum museum1 = new Museum("Louvre", "Paris", 2);
        boolean checkMuseum = museum.equals(museum1);
        System.out.println("Same?? : " + checkMuseum);
        System.out.println("======================================");

        MusicAlbum musicAlbum = new MusicAlbum("Thriller", "Michael Jackson", 1982);
        System.out.println(musicAlbum);
        System.out.println("My Code: " + musicAlbum.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(musicAlbum));
        MusicAlbum musicAlbum1 = new MusicAlbum("Back in Black", "AC/DC", 1980);
        boolean checkMusicAlbum = musicAlbum.equals(musicAlbum1);
        System.out.println("Same?? : " + checkMusicAlbum);
        System.out.println("======================================");

        Oven oven = new Oven("LG", 2000, true);
        System.out.println(oven);
        System.out.println("My Code: " + oven.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(oven));
        Oven oven1 = new Oven("LG", 2000, true);
        boolean checkOven = oven.equals(oven1);
        System.out.println("Same?? : " + checkOven);
        System.out.println("======================================");

        Painter painter = new Painter("Vincent", "Van Gogh", 10);
        System.out.println(painter);
        System.out.println("My Code: " + painter.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(painter));
        Painter painter1= new Painter("Pablo", "Picasso", 15);
        boolean checkPainter = painter.equals(painter1);
        System.out.println("Same?? : " + checkPainter);
        System.out.println("======================================");

        PainterTool painterTool = new PainterTool("Brush", "Synthetic", 100);
        System.out.println(painterTool);
        System.out.println("My Code: " + painterTool.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(painterTool));
        PainterTool painterTool1 = new PainterTool("Brush", "Natural", 100);
        boolean checkPainterTool = painterTool.equals(painterTool1);
        System.out.println("Same?? : " + checkPainterTool);
        System.out.println("======================================");

        Pet pet = new Pet("Dog", "Beagle", 3);
        System.out.println(pet);
        System.out.println("My Code: " + pet.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(pet));
        Pet pet1 = new Pet("Dog", "Beagle", 3);
        boolean checkPet = pet.equals(pet1);
        System.out.println("Same?? : " + checkPet);
        System.out.println("======================================");

        Phone phone = new Phone("Samsung", "S23", 799.99);
        System.out.println(phone);
        System.out.println("My Code: " + phone.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(phone));
        Phone phone1 = new Phone("Samsung", "S22", 799.99); // Different model
        boolean checkPhone = phone.equals(phone1);
        System.out.println("Same?? : " + checkPhone);
        System.out.println("======================================");

        Planet planet = new Planet("Earth", 1, 20);
        System.out.println(planet);
        System.out.println("My Code: " + planet.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(planet));
        Planet planet1 = new Planet("Earth", 1, 20);
        boolean checkPlanet = planet.equals(planet1);
        System.out.println("Same?? : " + checkPlanet);
        System.out.println("======================================");

        Podcast podcast = new Podcast("TechTalk", "John", 10);
        System.out.println(podcast);
        System.out.println("My Code: " + podcast.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(podcast));
        Podcast podcast1 = new Podcast("TechTalk", "Doe", 10);
        boolean checkPodcast = podcast.equals(podcast1);
        System.out.println("Same?? : " + checkPodcast);
        System.out.println("======================================");

        PodcastEpisode podcastEpisode = new PodcastEpisode("AI in 2025", "Aryan", 10);
        System.out.println(podcastEpisode);
        System.out.println("My Code: " + podcastEpisode.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(podcastEpisode));
        PodcastEpisode podcastEpisode1 = new PodcastEpisode("AI in 2025", "Aryan", 10);
        boolean checkPodcastEpisode = podcastEpisode.equals(podcastEpisode1);
        System.out.println("Same?? : " + checkPodcastEpisode);
        System.out.println("======================================");

        Printer printer = new Printer("Canon", "B/W", true);
        System.out.println(printer);
        System.out.println("My Code: " + printer.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(printer));
        Printer printer1 = new Printer("Canon", "Color", true);
        boolean checkPrinter = printer.equals(printer1);
        System.out.println("Same?? : " + checkPrinter);
        System.out.println("======================================");

        Refrigerator refrigerator = new Refrigerator("LG", 310, true);
        System.out.println(refrigerator);
        System.out.println("My Code: " + refrigerator.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(refrigerator));
        Refrigerator refrigerator1 = new Refrigerator("LG", 310, true);
        boolean checkRefrigerator = refrigerator.equals(refrigerator1);
        System.out.println("Same?? : " + checkRefrigerator);
        System.out.println("======================================");

        Restaurant restaurant = new Restaurant("Domino's", "Italian", 4);
        System.out.println(restaurant);
        System.out.println("My Code: " + restaurant.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(restaurant));
        Restaurant restaurant1 = new Restaurant("Pizza Hut", "Italian", 4);
        boolean checkRestaurant = restaurant.equals(restaurant1);
        System.out.println("Same?? : " + checkRestaurant);
        System.out.println("======================================");

        RiceCooker riceCooker = new RiceCooker("Panasonic", 10, true);
        System.out.println(riceCooker);
        System.out.println("My Code: " + riceCooker.hashCode());
        System.out.println("Original Hashcode " + System.identityHashCode(riceCooker));
        RiceCooker riceCooker1 = new RiceCooker("Panasonic", 10, true);
        boolean checkRiceCooker = riceCooker.equals(riceCooker1);
        System.out.println("Same?? : " + checkRestaurant);
        System.out.println("======================================");

        Smartwatch smartwatch = new Smartwatch("Apple", false, 5);
        System.out.println(smartwatch);
        System.out.println("My Code: " + smartwatch.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(smartwatch));
        Smartwatch smartwatch1 = new Smartwatch("Apple", false, 5);
        boolean checkSmartwatch = smartwatch.equals(smartwatch1);
        System.out.println("Same?? : " + checkSmartwatch);
        System.out.println("======================================");

        Sofa sofa = new Sofa("Leather", 3, true);
        System.out.println(sofa);
        System.out.println("My Code: " + sofa.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(sofa));
        Sofa sofa1 = new Sofa("Leather", 3, true);
        boolean checkSofa = sofa.equals(sofa1);
        System.out.println("Same?? : " + checkSofa);
        System.out.println("======================================");

        SpaceMission spaceMission = new SpaceMission("Apollo 11", "NASA", 365);
        System.out.println(spaceMission);
        System.out.println("My Code: " + spaceMission.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(spaceMission));
        SpaceMission spaceMission1 = new SpaceMission("Apollo 11", "NASA", 365);
        boolean checkSpaceMission = spaceMission.equals(spaceMission1);
        System.out.println("Same?? : " + checkSpaceMission);
        System.out.println("======================================");

        Speaker speaker = new Speaker("Boat", 50, true);
        System.out.println(speaker);
        System.out.println("My Code: " + speaker.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(speaker));
        Speaker speaker1 = new Speaker("Boat", 50, true);
        boolean checkSpeaker = speaker.equals(speaker1);
        System.out.println("Same?? : " + checkSpeaker);
        System.out.println("======================================");

        Student student = new Student("John", 20, "Physics");
        System.out.println(student);
        System.out.println("My Code: " + student.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(student));
        Student student1 = new Student("John", 20, "Physics");
        boolean checkStudent = student.equals(student1);
        System.out.println("Same?? : " + checkStudent);
        System.out.println("======================================");

        Sunglasses sunglasses = new Sunglasses("Ray-Ban", "Brown", true);
        System.out.println(sunglasses);
        System.out.println("My Code: " + sunglasses.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(sunglasses));
        Sunglasses sunglasses1 = new Sunglasses("Ray-Ban", "Brown", true);
        boolean checkSunglasses = sunglasses.equals(sunglasses1);
        System.out.println("Same?? : " + checkSunglasses);
        System.out.println("======================================");

        Tablet tablet = new Tablet("iPad", 10.2, 0);
        System.out.println(tablet);
        System.out.println("My Code: " + tablet.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(tablet));
        Tablet tablet1 = new Tablet("iPad", 10.2, 0);
        boolean checkTablet = tablet.equals(tablet1);
        System.out.println("Same?? : " + checkTablet);
        System.out.println("======================================");

        Teacher teacher = new Teacher("Mrs. Smith", "Science", 12);
        System.out.println(teacher);
        System.out.println("My Code: " + teacher.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(teacher));
        Teacher teacher1 = new Teacher("Mrs. Smith", "Science", 12);
        boolean checkTeacher = teacher.equals(teacher1);
        System.out.println("Same?? : " + checkTeacher);
        System.out.println("======================================");

        Television television = new Television("Sony", 55, true);
        System.out.println(television);
        System.out.println("My Code: " + television.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(television));
        Television television1 = new Television("Sony", 55, true);
        boolean checkTelevision = television.equals(television1);
        System.out.println("Same?? : " + checkTelevision);
        System.out.println("======================================");

        Thermometer thermometer = new Thermometer("Glass", 42.0, false);
        System.out.println(thermometer);
        System.out.println("My Code: " + thermometer.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(thermometer));
        Thermometer thermometer1 = new Thermometer("Glass", 42.0, false);
        boolean checkThermometer = thermometer.equals(thermometer1);
        System.out.println("Same?? : " + checkThermometer);
        System.out.println("======================================");

        Ticket ticket = new Ticket("Concert", "VIP", 299.99);
        System.out.println(ticket);
        System.out.println("My Code: " + ticket.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(ticket));
        Ticket ticket1 = new Ticket("Concert", "VIP", 299.99);
        boolean checkTicket = ticket.equals(ticket1);
        System.out.println("Same?? : " + checkTicket);
        System.out.println("======================================");

        Toaster toaster = new Toaster("Morphy", 2, true);
        System.out.println(toaster);
        System.out.println("My Code: " + toaster.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(toaster));
        Toaster toaster1 = new Toaster("Morphy", 2, true);
        boolean checkToaster = toaster.equals(toaster1);
        System.out.println("Same?? : " + checkToaster);
        System.out.println("======================================");

        Train train = new Train("Rajdhani", 5, "Mumbai");
        System.out.println(train);
        System.out.println("My Code: " + train.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(train));
        Train train1 = new Train("Rajdhani", 5, "Mumbai");
        boolean checkTrain = train.equals(train1);
        System.out.println("Same?? : " + checkTrain);
        System.out.println("======================================");

        Tree tree = new Tree("Mango", 15, 25);
        System.out.println(tree);
        System.out.println("My Code: " + tree.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(tree));
        Tree tree1 = new Tree("Mango", 12, 25);
        boolean checkTree = tree.equals(tree1);
        System.out.println("Same?? : " + checkTree);
        System.out.println("======================================");

        TV tv = new TV("LG", 43, true);
        System.out.println(tv);
        System.out.println("My Code: " + tv.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(tv));
        TV tv1 = new TV("LG", 43, true);
        boolean checkTV = tv.equals(tv1);
        System.out.println("Same?? : " + checkTV);
        System.out.println("======================================");

        TVShow tvShow = new TVShow("Friends", 10, "Horror");
        System.out.println(tvShow);
        System.out.println("My Code: " + tvShow.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(tvShow));
        TVShow tvShow1 = new TVShow("Friends", 10, "Horror");
        boolean checkTVShow = tvShow.equals(tvShow1);
        System.out.println("Same?? : " + checkTVShow);
        System.out.println("======================================");

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Dyson", "Big", 1200);
        System.out.println(vacuumCleaner);
        System.out.println("My Code: " + vacuumCleaner.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(vacuumCleaner));
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Dyson", "Big", 1200);
        boolean checkVacuumCleaner = vacuumCleaner.equals(vacuumCleaner1);
        System.out.println("Same?? : " + checkVacuumCleaner);
        System.out.println("======================================");

        Volunteer volunteer = new Volunteer("Sam", "CleanUp Drive", 5);
        System.out.println(volunteer);
        System.out.println("My Code: " + volunteer.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(volunteer));
        Volunteer volunteer1 = new Volunteer("Sam", "CleanUp Drive", 5);
        boolean checkVolunteer = volunteer.equals(volunteer1);
        System.out.println("Same?? : " + checkVolunteer);
        System.out.println("======================================");

        Wallet wallet = new Wallet("Leather", 6, "White");
        System.out.println(wallet);
        System.out.println("My Code: " + wallet.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(wallet));
        Wallet wallet1 = new Wallet("Leather", 6, "White");
        boolean checkWallet = wallet.equals(wallet1);
        System.out.println("Same?? : " + checkWallet);
        System.out.println("======================================");

        Wardrobe wardrobe = new Wardrobe(2, "Vialot", true);
        System.out.println(wardrobe);
        System.out.println("My Code: " + wardrobe.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(wardrobe));
        Wardrobe wardrobe1 = new Wardrobe(2, "Vialot", true);
        boolean checkWardrobe = wardrobe.equals(wardrobe1);
        System.out.println("Same?? : " + checkWardrobe);
        System.out.println("======================================");

        WashingMachine washingMachine = new WashingMachine("IFB", 7.0, true);
        System.out.println(washingMachine);
        System.out.println("My Code: " + washingMachine.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(washingMachine));
        WashingMachine washingMachine1 = new WashingMachine("Sony", 7.0, true);
        boolean checkWashingMachine = washingMachine.equals(washingMachine1);
        System.out.println("Same?? : " + checkWashingMachine);
        System.out.println("======================================");

        Watch watch = new Watch("Fossil", "Metal", 10000);
        System.out.println(watch);
        System.out.println("My Code: " + watch.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(watch));
        Watch watch1 = new Watch("Fossil", "Metal", 10000);
        boolean checkWatch = watch.equals(watch1);
        System.out.println("Same?? : " + checkWatch);
        System.out.println("======================================");

        WeatherReport weatherReport = new WeatherReport("Sunny", 32, "Hyderabad");
        System.out.println(weatherReport);
        System.out.println("My Code: " + weatherReport.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(weatherReport));
        WeatherReport weatherReport1 = new WeatherReport("Sony", 32, "Hyderabad");
        boolean checkWeatherReport = weatherReport.equals(weatherReport1);
        System.out.println("Same?? : " + checkWeatherReport);
        System.out.println("======================================");

        YogaMat yogaMat = new YogaMat("Decathlon", 20, "Blue");
        System.out.println(yogaMat);
        System.out.println("My Code: " + yogaMat.hashCode());
        System.out.println("Original Hashcode: " + System.identityHashCode(yogaMat));
        YogaMat yogaMat1 = new YogaMat("Decathlon", 10, "Blue");
        boolean checkYogaMat = yogaMat.equals(yogaMat1);
        System.out.println("Same?? : " + checkYogaMat);
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======================================");

    }
}
