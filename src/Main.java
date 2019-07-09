public class Main {

    public static void main(String[] args) {

        ActorController actorController = new ActorController();  //创建构建者

        ActorBuilder actorBuilder;      //创建抽象创建者

        actorBuilder = new HeroBuilder();  //实例化具体创建者

        Role hero;  // 创建人物对象

        hero =  actorController.construct(actorBuilder); //构建者指挥具体创建者拼接人物对象

        System.out.println(hero.getHairstyle());



    }
}
