xebia_assignment

Code is committed with target folder. Application can be run through java command java -jar target/retail-store-0.0.1-SNAPSHOT.java

Application desing -
Application contains User class which is parent to different type of users like Employee, Affiliated user, Customer.

BillCalculator interface has multiple implementations to calculate disocunt on the basis of type of user.

ConstantHelper is written to define discount percentage applicable to different type of users.

Utility class is written to provide few functions to check conditions and to calculate default discount.

Note
App.java is main class to run the application. Dummy data is provided there to calculate differnt type to discounts.
