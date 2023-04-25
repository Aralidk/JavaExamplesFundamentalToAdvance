class Dog extends Android implements Cloneable{
    public Dog(String model){super(model);}

    @Override
    public String move(){
        return "The dog is Running";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
