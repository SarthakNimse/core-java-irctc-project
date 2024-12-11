** IRCTC(Indian Railway Catering and Tourism Corporation) Booking System **

** project name : core-java-irctc-booking-system

package names: com.irctc.dept/functionality.model
package names: com.irctc.dept/functionality.service
package names: com.irctc.dept/functionality.repository
package names: com.irctc.dept/functionality.controller
package names: com.irctc.dept/functionality.utility

** functionality :

-User registration:
-Train Destination With Scheduling:
-Ticket Booking:
-Payement Interface:
-Booking history and management:
-Search & filtering:
-Notification Alerts:

** POJO(Plain Old Java Objects):

-user - (user id, full name, username, email, password ,phone no)
-train - (train name, sourceStation, destinationStation, departureTime, arrivalTime, totalSeats, availableSeats, pricePerSeat)
-Ticket - (ticketId, pnrNumber, userId, train name, seatNumber, departureTime, bookingDate, ticket price)
-payement - (payementId, ticketId, userId, paymentDate, paymentMethod, amount, paymentStatus)
-booking history - (userId, train name, ticketId, payement)
-Search & filtering -  (train name, train route, destination, train type, departureTime)
-Notification Alerts  - (userId, type, message, dateTime)
