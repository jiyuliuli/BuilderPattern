public class ActorController  {

    public Role construct(ActorBuilder actorBuilder) {

        Role role;

        actorBuilder.sex();
        actorBuilder.costume();
        actorBuilder.creatActor();
        actorBuilder.face();
        actorBuilder.hairstyle();
        actorBuilder.type();
        role = actorBuilder.creatActor();
        return role;

    }

}
