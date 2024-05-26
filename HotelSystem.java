/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mphahlele.TA.hotelsystem;

public class HotelSystem {

    private String name;
    private String cellPhone;
    private String email;
    private String RoomOptions;
    private String overNightOrDay;
    private int numOfDays;
    private double price;

    public HotelSystem() 
    {
        
    }

    
    public HotelSystem(String name, String cellPhone, String email, String RoomOptions, String overNightOrDay, int numOfDays, double price) {
        this.name = name;
        this.cellPhone = cellPhone;
        this.email = email;
        this.RoomOptions = RoomOptions;
        this.overNightOrDay = overNightOrDay;
        this.numOfDays = numOfDays;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getRoomOptions() {
        return RoomOptions;
    }

    public String getOverNightOrDay() {
        return overNightOrDay;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoomOptions(String RoomOptions) {
        this.RoomOptions = RoomOptions;
    }

    public void setOverNightOrDay(String overNightOrDay) {
        this.overNightOrDay = overNightOrDay;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void chooseRoom(String choosenRoom) {
        if (RoomOptions.equalsIgnoreCase(choosenRoom)) {
            RoomOptions = "basic room";
        } else if (RoomOptions.equalsIgnoreCase(choosenRoom)) {
            RoomOptions = "platinum room";
        } else if (RoomOptions.equalsIgnoreCase(choosenRoom)) {
            RoomOptions = "presidential room";
        }

    }

    public void stayChoice(String chosenChoice) {
        if (overNightOrDay.equalsIgnoreCase(chosenChoice)) {
            overNightOrDay = "Day"
                    + "\nCheck-out :5PM";
        } else if (overNightOrDay.equalsIgnoreCase(chosenChoice)) {
            overNightOrDay = "Night\n"
                    + "Check-out : 10AM";
        }
    }

    public double yourPrice() {
        double totalPrice = 0;
        if (RoomOptions.equalsIgnoreCase("basic room")) {
            price = 500;
            totalPrice = price * numOfDays;
        } else if (RoomOptions.equalsIgnoreCase("platinum room")) {
            price = 1200;
            totalPrice = price * numOfDays;
        } else if (RoomOptions.equalsIgnoreCase("presidential room")) {
            price = 1900;
            totalPrice = price * numOfDays;
        }

        return totalPrice;
    }

}
