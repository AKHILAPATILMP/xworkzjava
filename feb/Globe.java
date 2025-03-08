class Globe {
    static void spin() { System.out.println("The globe is spinning."); }
    static void showCountries() { System.out.println("Displaying all countries on the globe."); }
    static void highlightContinents() { System.out.println("Highlighting continents."); }
    static void pointEquator() { System.out.println("Showing the equator line."); }
    static void markLatitudeLongitude() { System.out.println("Marking latitude and longitude lines."); }

    // Invoking methods from Geography class
    static void invokeGeographyMethods() {
        Geography.studyOceans();
        Geography.mapBorders();
        Geography.identifyLandforms();
        Geography.analyzeClimate();
        Geography.teachGeography();
    }

    public static void main(String[] args) {
        spin();
        showCountries();
        highlightContinents();
        pointEquator();
        markLatitudeLongitude();

        invokeGeographyMethods();
    }
}

class Geography {
    static void studyOceans() { System.out.println("Studying different oceans."); }
    static void mapBorders() { System.out.println("Mapping country borders."); }
    static void identifyLandforms() { System.out.println("Identifying mountains and plains."); }
    static void analyzeClimate() { System.out.println("Analyzing world climate zones."); }
    static void teachGeography() { System.out.println("Teaching world geography."); }
}