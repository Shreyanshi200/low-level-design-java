package Behavioural.ChainofResponsibility;

public class Request {
    private Priority priority;
    public Request(Priority priority){
        this.priority = priority;
    }
    public Priority getpriority(){
        return priority;
    }
}