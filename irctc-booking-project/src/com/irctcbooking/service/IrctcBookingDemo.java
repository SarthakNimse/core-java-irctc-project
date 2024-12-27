package com.irctcbooking.service;

import com.irctcbooking.model.*;

import java.util.Scanner;

public class IrctcBookingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        private int userId;
//        private String fullName;
//        private String username;
//        private String email;
//        private String phoneNo;

        System.out.println("Enter your user id ");
        int userId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Your Full Name ");
        String fullName = sc.nextLine();

        System.out.println("Enter Your User Name ");
        String username = sc.nextLine();

        System.out.println("Enter Your Email");
        String email = sc.nextLine();

        System.out.println("Enter Your Phone no ");
        String phoneNo = sc.nextLine();

        User user = new User();
        user.setUserId(userId);
        user.setFullName(fullName);
        user.setUsername(username);
        user.setEmail(email);
        user.setPhoneNo(phoneNo);

        System.out.println("--------NOW ENTER TRAIN DETAILS---------------");

//  private String trainName;
//        private String sourceStation;
//        private String destinationStation;
//        private String departureTime;
//        private String arrivalTime;
//        private int totalSeats;
//        private int availableSeats;
//        private double pricePerSeat;


        System.out.println("Enter your train Name ");
        String trainName = sc.nextLine();

        System.out.println("Enter your sourceStation ");
        String sourceStation = sc.nextLine();

        System.out.println("Enter your destinationStation ");
        String destinationStation = sc.nextLine();

        System.out.println("Enter your departureTime ");
        String departureTime = sc.nextLine();

        System.out.println("Enter your arrivalTime");
        String arrivalTime = sc.nextLine();

        System.out.println("Enter your total seats ");
        int totalSeats = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your available seats ");
        int availableSeats = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your price per seat");
        double pricePerSeat = sc.nextDouble();



        Train train = new Train();
        train.setTrainName(trainName);
        train.setSourceStation(sourceStation);
        train.setDestinationStation(destinationStation);
        train.setDepartureTime(departureTime);
        train.setArrivalTime(arrivalTime);
        train.setTotalSeats(totalSeats);
        train.setAvailableSeats(availableSeats);
        train.setPricePerSeat(pricePerSeat);

        System.out.println("--------NOW ENTER TICKET DETAILS---------------");

//         private int ticketId;
//    private String pnrNumber;
//    private int userId;
//    private String trainName;
//    private int seatNumber;
//    private String departureTime;
//    private String bookingDate;
//    private double ticketPrice;


        System.out.println("Enter your ticket Id");
        int ticketId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your PNR number ");
        String pnrNumber = sc.nextLine();

        System.out.println("Enter your seat number");
        int seatNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your booking date");
        String bookingDate = sc.nextLine();

        System.out.println("Enter your ticket price");
        double ticketPrice = sc.nextDouble();

        Ticket ticket = new Ticket();
        ticket.setTicketId(ticketId);
        ticket.setPnrNumber(pnrNumber);
        ticket.setSeatNumber(seatNumber);
        ticket.setBookingDate(bookingDate);
        ticket.setTicketPrice(ticketPrice);

//        private int paymentId;
//    private int ticketId;
//    private int userId;
//    private String paymentDate;
//    private String paymentMethod;
//    private double amount;
//    private String paymentStatus;

        System.out.println("--------NOW ENTER PAYEMENT DETAILS---------------");

        System.out.println("Enter your payement date");
        String payementDate = sc.nextLine();

        System.out.println("Enter your payement method");
        String payementMethod = sc.nextLine();

        System.out.println("Enter total amount");
        double amount = sc.nextDouble();

        System.out.println("Enter payement status");
        String payementStatus = sc.nextLine();

        Payment payement = new Payment();
        payement.setPaymentDate(payementDate);
        payement.setPaymentMethod(payementMethod);
        payement.setAmount(amount);
        payement.setPaymentStatus(payementStatus);


        System.out.println("--------NOW ENTER SEARCHFILTER DETAILS---------------");

        //         private String trainName;
//    private String trainRoute;
//    private String destination;
//    private String trainType;
//    private String departureTime;

        System.out.println("Enter your train destination");
        String destination = sc.nextLine();

        System.out.println("Enter your train type");
        String trainType = sc.nextLine();

        SearchFilter searchFilter = new SearchFilter();
        searchFilter.setTrainName(trainName);
        searchFilter.setDestination(destination);
        searchFilter.setTrainType(trainType);

        System.out.println("--------NOW ENTER NOTIFICATIONALERT DETAILS---------------");

//          private int userId;
//    private String type;
//    private String message;
//    private String dateTime;
        System.out.println("Enter your type");
        String type = sc.nextLine();

        System.out.println("Enter message you want to send");
        String message =sc.nextLine();

        System.out.println("Enter date and time");
        String datetime = sc.nextLine();

        NotificationAlert notificationAlert = new NotificationAlert();
        notificationAlert.setType(type);
        notificationAlert.setMessage(message);
        notificationAlert.setDateTime(datetime);


        System.out.println(user+""+train+""+ticket+""+payement+""+searchFilter+""+notificationAlert);
    }
}