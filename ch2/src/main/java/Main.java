import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // AnnotationConfigApplicationContext 클래스는 자바 설정에서 정보를 읽어와 빈 객체를 생성한다.
        // AnnotationConfigApplicationContext 을 생성할 때, 미리 정의해둔 AppContext 클래스를 읽고 Bean 설정을 읽는다
        var ctx = new AnnotationConfigApplicationContext(AppContext.class);

        // getBean 은 메서드 이름과 타입을 읽어 greeter() 가 생성한 Greeter 객체를 반환한다.
        var g = ctx.getBean("greeter", Greeter.class);
        var msg = g.greet("스프링");
        System.out.println(msg);
        ctx.close();
    }
}
