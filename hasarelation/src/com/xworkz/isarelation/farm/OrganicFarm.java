package com.xworkz.isarelation.farm;
    public class OrganicFarm extends Farm {
        public OrganicFarm() {
            super();
            System.out.println("OrganicFarm constructor is running");
        }

        public void useNaturalFertilizers() {
            System.out.println("OrganicFarm is using natural fertilizers");
        }

        public void avoidPesticides() {
            System.out.println("OrganicFarm avoids chemical pesticides");
        }

        public void cropRotation() {
            System.out.println("OrganicFarm follows crop rotation techniques");
        }

        public void rainwaterHarvesting() {
            System.out.println("OrganicFarm utilizes rainwater harvesting");
        }

        public void sellOrganicProduce() {
            System.out.println("OrganicFarm is selling certified organic produce");
        }
    }


