package Behavioural.ChainofResponsibility;

public class Client {
    public static void main(String[] args){
        SupportHandler level1SA = new Level1Supporthandler();
        SupportHandler level2SA = new Level2Supporthandler();
        SupportHandler level3SA = new Level3SupportHandler();
        level1SA.setNextHandler(level2SA);
        level2SA.setNextHandler(level3SA);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        level1SA.handleRequest(request1);
        level1SA.handleRequest(request2);
        level1SA.handleRequest(request3);
    }
}
