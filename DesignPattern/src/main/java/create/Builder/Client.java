package create.Builder;

/**
 * 建造者模式：多个简单对象组成一个复杂对象，组成部分是不变的，但每一部分是可以灵活选择的
 * 产品角色
 * 抽象建造者
 * 具体建造者
 * 指挥者
 */
public class Client {

    /**
     * 产品角色，由hair,color,gender三部分组成，每个部分可以改变
     */
    static class Hero {
        String hair;
        String color;
        String gender;

        public String getHair() {
            return hair;
        }

        public void setHair(String hair) {
            this.hair = hair;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "hair='" + hair + '\'' +
                    ", color='" + color + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    static abstract class Builder {
        //创建产品角色对象
        protected Hero hero = new Hero();

        public abstract void buildPartA();

        public abstract void buildPartB();

        public abstract void buildPartC();

        //返回产品对象
        public Hero getResult() {
            return hero;
        }
    }

    static class ConcreteBuilder1 extends Builder {
        @Override
        public void buildPartA() {
            hero.setColor("red");
        }

        @Override
        public void buildPartB() {
            hero.setGender("m");
        }

        @Override
        public void buildPartC() {
            hero.setColor("white");
        }
    }

    static class ConcreteBuilder2 extends Builder {
        @Override
        public void buildPartA() {
            hero.setColor("white");
        }

        @Override
        public void buildPartB() {
            hero.setGender("f");
        }

        @Override
        public void buildPartC() {
            hero.setColor("black");
        }
    }

    static class Director {
        private Builder builder;

        public Director(Builder builder) {
            this.builder = builder;
        }

        //产品构建与组装方法
        public Hero construct() {
            builder.buildPartA();
            builder.buildPartB();
            builder.buildPartC();
            return builder.getResult();
        }
    }

    public static void main(String[] args) {
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);
        Hero hero1 = director1.construct();
        System.out.println(hero1.toString());

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        Director director2 = new Director(builder2);
        Hero hero2 = director2.construct();
        System.out.println(hero2.toString());

    }

}
