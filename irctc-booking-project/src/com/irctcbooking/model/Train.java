package com.irctcbooking.model;

public class Train {
        private String trainName;
        private String sourceStation;
        private String destinationStation;
        private String departureTime;
        private String arrivalTime;
        private int totalSeats;
        private int availableSeats;
        private double pricePerSeat;

        @Override
        public String toString() {
                return "Train{" +
                        "trainName='" + trainName + '\'' +
                        ", sourceStation='" + sourceStation + '\'' +
                        ", destinationStation='" + destinationStation + '\'' +
                        ", departureTime='" + departureTime + '\'' +
                        ", arrivalTime='" + arrivalTime + '\'' +
                        ", totalSeats=" + totalSeats +
                        ", availableSeats=" + availableSeats +
                        ", pricePerSeat=" + pricePerSeat +
                        '}';
        }

        public double getPricePerSeat() {
                return pricePerSeat;
        }

        public void setPricePerSeat(double pricePerSeat) {
                this.pricePerSeat = pricePerSeat;
        }

        public int getAvailableSeats() {
                return availableSeats;
        }

        public void setAvailableSeats(int availableSeats) {
                this.availableSeats = availableSeats;
        }

        public int getTotalSeats() {
                return totalSeats;
        }

        public void setTotalSeats(int totalSeats) {
                this.totalSeats = totalSeats;
        }

        public String getArrivalTime() {
                return arrivalTime;
        }

        public void setArrivalTime(String arrivalTime) {
                this.arrivalTime = arrivalTime;
        }

        public String getDepartureTime() {
                return departureTime;
        }

        public void setDepartureTime(String departureTime) {
                this.departureTime = departureTime;
        }

        public String getDestinationStation() {
                return destinationStation;
        }

        public void setDestinationStation(String destinationStation) {
                this.destinationStation = destinationStation;
        }

        public String getTrainName() {
                return trainName;
        }

        public void setTrainName(String trainName) {
                this.trainName = trainName;
        }

        public String getSourceStation() {
                return sourceStation;
        }

        public void setSourceStation(String sourceStation) {
                this.sourceStation = sourceStation;
        }
}
