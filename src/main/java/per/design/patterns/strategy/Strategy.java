package per.design.patterns.strategy;

/**
 * 策略设计模式
 */
public class Strategy {

    public static void main(String[] args) {
        ContextStrategy contextStrategy = new ContextStrategy();
        contextStrategy.getPerson(SexEnum.MALE).getSex();
        contextStrategy.getPerson(SexEnum.FEMALE).getSex();
        contextStrategy.getPerson(SexEnum.UNKNOWN).getSex();
    }
}

/**
 * 抽象类
 */
interface Person {
    void getSex();
}

/**
 * 实体类 - 男
 */
class MalePerson implements Person {

    @Override
    public void getSex() {
        System.out.println("男");
    }
}

/**
 * 实体类 - 女
 */
class FemalePerson implements Person {

    @Override
    public void getSex() {
        System.out.println("女");
    }
}

/**
 * 实体类 - 不知姓名
 */
class UnknownPerson implements Person {

    @Override
    public void getSex() {
        System.out.println("未知");
    }
}

/**
 * 枚举类 - 表示可选择性
 */
enum SexEnum {
    MALE("male", "男"),
    FEMALE("female", "女"),
    UNKNOWN("unknown", "未知"),
    ;

    private String code;
    private String msg;


    SexEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

/**
 * 定义策略选择器
 */
class ContextStrategy {
    private MalePerson malePerson = new MalePerson();
    private FemalePerson femalePerson = new FemalePerson();
    private UnknownPerson unknownPerson = new UnknownPerson();

    public Person getPerson(SexEnum sexEnum) {
        if ("male".equals(sexEnum.getCode())) {
            return malePerson;
        } else if ("female".equals(sexEnum.getCode())) {
            return femalePerson;
        } else {
            return unknownPerson;
        }
    }
}