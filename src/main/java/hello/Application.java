package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rex on 7/18/16.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService(){
      return  new MessageService() {
          @Override
          public String getMessage() {
              return "Hello Night!";
          }
        };
     }

    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

    }

}
