package com.xworkz.isarelation.table;

    public class SmartTable extends Table {
        public SmartTable() {
            super();
            System.out.println("SmartTable constructor is running");
        }

        public void wirelessCharging() {
            System.out.println("Table is charging devices wirelessly");
        }

        public void temperatureControl() {
            System.out.println("Table is adjusting surface temperature");
        }

        public void voiceControl() {
            System.out.println("Table is responding to voice commands");
        }

        public void autoHeightAdjust() {
            System.out.println("Table height is adjusting automatically");
        }
    }

