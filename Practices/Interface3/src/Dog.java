/**
 * Created by ayako_sayama on 2016/12/07.
 */
public class Dog extends Animal {

    public Dog(String type, String name, int age, boolean sound){
        super(type, name, age, true);

    }

    public boolean sound(boolean sound){
        return true;
    }

    @Override
    public String toString() {
        return "Dog name:"+ super.getName()+

                    "type: '" + super.getType() + '\'' +
                    ", age: '" + super.getAge() + '\'' +
                    ", sound:"  + super.sound +
                    '}';
    }
}
