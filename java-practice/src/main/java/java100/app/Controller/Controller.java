package java100.app.Controller;

public interface Controller {
    void execute(Request request, Response response);
    
    default void init() {}
    
    default void destroy() {}
    
}
