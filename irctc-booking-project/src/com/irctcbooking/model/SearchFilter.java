package com.irctcbooking.model;

public class SearchFilter {
    private String trainName;
    private String trainRoute;
    private String destination;
    private String trainType;
    private String departureTime;

    @Override
    public String toString() {
        return "SearchFilter{" +
                "trainName='" + trainName + '\'' +
                ", trainRoute='" + trainRoute + '\'' +
                ", destination='" + destination + '\'' +
                ", trainType='" + trainType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainRoute() {
        return trainRoute;
    }

    public void setTrainRoute(String trainRoute) {
        this.trainRoute = trainRoute;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
