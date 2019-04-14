import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    // CustomerService customerService = new CustomerServiceImpl(); //using new Keyword

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    CustomerService customerService = applicationContext
        .getBean("CustomerService", CustomerService.class); // used to get bean

    System.out.print(customerService.findAll().get(0).getFirstName());
  }
}
