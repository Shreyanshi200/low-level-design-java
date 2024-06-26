package Behavioural.ChainofResponsibility;

public class Level3SupportHandler implements SupportHandler{
    public void setNextHandler(SupportHandler nexthandler){

    }
    @Override
    public void handleRequest(Request request) {
        if(request.getpriority()==Priority.CRITICAL){
            System.out.println("Level 3 support handled the request");
        }
        else {
            System.out.println("Request can't be handled");
        }
    }
}
