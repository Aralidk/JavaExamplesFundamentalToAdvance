abstract class Android {
    private String model;
    private String owner;
    protected Android(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public abstract String move();
}
