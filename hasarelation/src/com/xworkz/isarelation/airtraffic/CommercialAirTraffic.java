package com.xworkz.isarelation.airtraffic;
    public class CommercialAirTraffic extends AirTraffic {
        public CommercialAirTraffic() {
            super();
            System.out.println("CommercialAirTraffic constructor is running");
        }

        public void scheduleFlights() {
            System.out.println("CommercialAirTraffic is scheduling flights");
        }

        public void handlePassengerRequests() {
            System.out.println("CommercialAirTraffic is handling passenger requests");
        }

        public void manageBaggage() {
            System.out.println("CommercialAirTraffic is managing baggage");
        }

        public void coordinateWithAirlines() {
            System.out.println("CommercialAirTraffic is coordinating with airlines");
        }

        public void issueWeatherAlerts() {
            System.out.println("CommercialAirTraffic is issuing weather alerts");
        }
    }


