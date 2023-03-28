package src.com.softserve.edu03.practic.taskThree;

import java.util.List;

public enum Continent {
    ASIA {
        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("China", "Iraq", "Turkey", "Kazakhstan");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }
    }, AFRICA {

        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("Zambia", "Ghana", "Angola", "Algeria");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }
    }, NORTH_AMERICA {
        @Override
        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("USA", "Canada", "Mexico", "Panama");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }
    }, SOUTH_AMERICA {
        @Override
        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("Colombia", "Chile", "Argentina", "Brazil");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }
    }, ANTARCTICA {
        @Override
        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("No country");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }


    }, EUROPA {
        @Override
        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("Germany", "Francia", "Italy", "Spain");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }


    }, AUSTRALIA {
        @Override
        public boolean checkContinentWithCountry(String country) {
            List<String> listCountry = List.of("Australia");
            return listCountry.stream().anyMatch(s -> s.equals(country));
        }


    };

    public abstract boolean checkContinentWithCountry(String country);

    /*This method must be in another clas, and in main method you should call this method*/
    public static void foundContinent(String countryFromUser){
        String result = "";
        while (true){
            if(checkResult(Continent.ASIA.checkContinentWithCountry(countryFromUser) == true ? "It is country "+countryFromUser+" location on Asia continent":"")) break;
            if(checkResult(Continent.AFRICA.checkContinentWithCountry(countryFromUser) == true ? "It is country "+countryFromUser+" location on Africa continent":"")) break;
            if(checkResult(Continent.NORTH_AMERICA.checkContinentWithCountry(countryFromUser) == true ? "It is country "+countryFromUser+" location on NORTH_AMERICA continent":""))break;
            if(checkResult(Continent.SOUTH_AMERICA.checkContinentWithCountry(countryFromUser) == true ? "It is country "+countryFromUser+" location on SOUTH_AMERICA continent":""))break;
            if(checkResult(Continent.ANTARCTICA.checkContinentWithCountry(countryFromUser) == true ? "It is country "+countryFromUser+" location on ANTARCTICA continent":""))break;
            if(checkResult(Continent.EUROPA.checkContinentWithCountry(countryFromUser) == true ? "It is country"+countryFromUser+" location on EUROPA continent":""))break;
            if(checkResult(Continent.AUSTRALIA.checkContinentWithCountry(countryFromUser) == true ? "It is country "+countryFromUser+" location on AUSTRALIA continent":""))break;
            if(result.length() == 0){
                System.out.println("Continent not found!");
                break;
            }
        }

    }
    private static boolean checkResult(String result){
        if(result.length() != 0){
            System.out.println(result);
            return true;
        }
        return false;
    }
}
