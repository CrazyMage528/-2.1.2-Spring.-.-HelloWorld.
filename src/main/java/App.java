import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Получение и вывод бина HelloWorld
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean1.getMessage());
        System.out.println(bean1 == bean2); // Должно вывести true, так как Singleton

        // Получение и вывод бина Cat
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(cat1 == cat2); // Должно вывести false, так как Prototype
    }
}
