package fr.designpatterns.behavioral.mediator;

public class ChatRoom {
  public static String showMessage(User user, String message) {
    return "Thu Dec 14 19:05:34 CET 2017 [" + user.getName() + "] : " + message;
  }
}
