package SealedClass;

public class Demo {
    //sealed修饰后，Person 类只能限定某⼏个类继承
    //限定关键字 permits
    //限定的⼦类需要使⽤final修改，即不允许再有⼦类
    //如果孙⼦类也想要继承密封类，则按照上述步骤，修改代码即可
    //取消密封类 :non-sealed
    sealed class Person permits U1, U2, U3 {
    } //⽗类

    final class U1 extends Person {
    } //⼦类1

    final class U2 extends Person {
    } //⼦类2

    class User1 extends U1 {
    } //孙⼦类1

    class User2 extends U1 {
    } //孙⼦类2

    non-sealed class U3 extends Person {
    } //⼦类3
}
