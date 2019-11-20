import javax.ejb.Stateless;

@Stateless(name = "MyEJbeanEJB")
public class MyEJBean {
    public String sayHello(String name) {
        return String.format("Hello %s, welcome to EJB 3.1!", name);
    }
}