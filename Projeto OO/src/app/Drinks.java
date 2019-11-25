package app;

class Drinks {
    
    private String name;
    private String brand;
    private String expirationDate;
    private String typeDrink;

    Drinks(){

    }

    Drinks(String name, String brand, String expirationDate, String typeDrink){
        this.name = name;
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.typeDrink = typeDrink;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return the expirationDate
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * @return the typeDrink
     */
    public String getTypeDrink() {
        return typeDrink;
    }

    /**
     * @param Name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param Brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @param typeDrink the typeDrink to set
     */
    public void setTypeDrink(String typeDrink) {
        this.typeDrink = typeDrink;
    }

    @Override
    public String toString() {
        String auxString = "Name of Product: " + name + "\n" + "Brand: " + brand +
        "\n" + "Expiration Date: " + expirationDate + "\n" + "Type of Drink: " + typeDrink;
        return auxString;
    }

}