package com.xworkz.associate;

public class Warranty {

        private String startDate;
        private String endDate;
        public Warranty(String startDate,String endDate){
            this.startDate=startDate;
            startDate="20/10/2025";
            this.endDate=endDate;
            endDate="23/04/2025";
        }
        public void WarDis(){
            System.out.println("Start date:"+this.startDate);
            System.out.println("End date:"+this.endDate);
        }
    }

