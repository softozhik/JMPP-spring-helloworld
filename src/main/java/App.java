import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hw2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("helloworld: " + hw1.equals(hw2));
        System.out.println("cat: " + cat1.equals(cat2));

        //System.out.println(bean.getMessage());
    }
}