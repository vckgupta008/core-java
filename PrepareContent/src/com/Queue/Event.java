package com.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Event {
    public String userId;
    public String eventType;

    public Event(String userId, String eventType) {
        this.userId = userId;
        this.eventType = eventType;
    }

    public void sendAsEmail() {
        System.out.println("Sent email to " + userId + " for event " + eventType);
    }

    public void sendAsPushNotification() {
        System.out.println("Sent push notification to " + userId + " for event " + eventType);
    }

}

class Source {
//Event1_User1_push Event2_User1_push Event1_User1_email Event2_User1_email sendPushNotifications sendMails
    static Stack<Event> pushNotificationStack = new Stack<Event>();
    static Queue<Event> emailQueue = new LinkedList<Event>();

    public static void storeEvent(Event event, String channel) {
        // Write code here

        if(channel.equals("email")){
            System.out.println("email= "+channel);
            emailQueue.add(event);
        }
        else{
            System.out.println("push= "+channel);
            pushNotificationStack.push(event);
        }
    }

    public static void sendEmails() {
        // Write code here
        for(Event email: emailQueue){
            email.sendAsEmail();
        }
    }

    public static void sendPushNotifications() {
        // Write code here
//        for(Event qu:pushNotificationStack){
//            qu.sendAsPushNotification();
//        }
        while(!pushNotificationStack.isEmpty()){
            pushNotificationStack.pop().sendAsPushNotification();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String event_stream = scanner.nextLine();
        for (String event : event_stream.split(" ")) {
            String eventType = event.split("_")[0];
            switch (eventType) {
                case "sendMails":
                    sendEmails();
                    break;
                case "sendPushNotifications":
                    sendPushNotifications();
                    break;
                default:
                    String userId = event.split("_")[1];
                    String channel = event.split("_")[2];
                    storeEvent(new Event(userId, eventType), channel);
                    break;
            }
        }
    }
}

