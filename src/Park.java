public class Park {
    public class InfoAboutAttractions {
        private String attraction;
        private String workingHours;
        private double price;

        public InfoAboutAttractions(String attraction, String workingHours, double price) {
            this.attraction = attraction;
            this.workingHours = workingHours;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        InfoAboutAttractions rollerPark = new Park().new InfoAboutAttractions(
                "Roller", "8.00 - 12.00", 12);
        System.out.println("Attraction: " + rollerPark.attraction + ";\nWorking Hours: " + rollerPark.workingHours +
                ";\nPrice: " + rollerPark.price);
    }
}
