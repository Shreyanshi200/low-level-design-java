package Behavioural.ChainofResponsibility;

public class Level2Supporthandler implements SupportHandler{
    private SupportHandler nexthandler;
    public void setNextHandler(SupportHandler nexthandler){
        this.nexthandler = nexthandler;
    }
    @Override
    public void handleRequest(Request request) {
        if(request.getpriority()==Priority.INTERMEDIATE){
            System.out.println("Level 2 support handled the request");
        }
        else if(nexthandler!=null){
            nexthandler.handleRequest(request);
        }
    }
}
