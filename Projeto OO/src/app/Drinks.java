package app;

class Drinks {
    
    private String name;
    private float priceDrink;
    private String brand;
    private String expirationDate;
    private String typeDrink;
    private int rank;


    Drinks(){
        this.rank = 0;
        this.priceDrink = -1;
    }

    Drinks(String name, float priceDrink, String brand, String expirationDate, String typeDrink){
        this.name = name;
        this.priceDrink = priceDrink;
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.typeDrink = typeDrink;
        this.rank = 0;
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
     * @return the priceDrink
     */
    public float getPriceDrink() {
        return priceDrink;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /** 
     * @return Rank position by the form of names designated by their rank number (About drink)
     */
    public String getPositionRank(){
        if(getRank() <= 0) return "Iron";
        else if(getRank() <= 2) return "Silver";
        else if(getRank() <= 4) return "Gold";
        else if(getRank() <= 6) return "Platinum";
        else if(getRank() <= 8) return "Diamond";
        else if(getRank() > 8) return "The Drink";
        else return null;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * @param Name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param priceDrink the priceDrink to set
     */
    public void setPriceDrink(float priceDrink) {
        this.priceDrink = priceDrink;
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

    /** 
     * @return The string with information about drink
     */
    public String toString() {
        String auxString = "\nName of Product: " + name + "\n" + "Rank: " + getPositionRank() + "\n" + "Price of Product: R$" + 
        priceDrink + "\n" + "Brand: " + brand + "\n" + "Expiration Date: " + 
        expirationDate + "\n" + "Type of Drink: " + typeDrink + "\n\n";
        return auxString;
    }


}