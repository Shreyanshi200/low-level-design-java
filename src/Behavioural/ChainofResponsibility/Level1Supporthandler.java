package Behavioural.ChainofResponsibility;

public class Level1Supporthandler implements SupportHandler{
    private SupportHandler nexthandler;
    public void setNextHandler(SupportHandler nexthandler){
        this.nexthandler = nexthandler;
    }
    @Override
    public void handleRequest(Request request) {
        if(request.getpriority()==Priority.BASIC){
            System.out.println("Level 1 support handled the request");
        }
        else if(nexthandler!=null){
            nexthandler.handleRequest(request);
        }
    }
}
