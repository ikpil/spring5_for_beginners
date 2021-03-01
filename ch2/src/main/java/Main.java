import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        var g = ctx.getBean("greeter", Greeter.class);
        var msg = g.greet("스프링");
        System.out.println(msg);
        ctx.close();
    }
}
