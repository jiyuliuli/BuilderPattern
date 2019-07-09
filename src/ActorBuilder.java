public abstract  class ActorBuilder {


    protected Role actor = new Role();


    public abstract  void sex();
    public abstract  void face();
    public abstract  void type();
    public abstract  void costume();
    public abstract void hairstyle();

    public Role creatActor() {
        return  actor;
    }
    
}
