package fr.designpatterns.architectural.frontcontroller;

public class Dispatcher {
  private StudentView studentView;
  private HomeView homeView;

  public Dispatcher() {
    studentView = new StudentView();
    homeView = new HomeView();
  }

  public String dispatch(String request) {
    if (request.equalsIgnoreCase("STUDENT")) {
      return studentView.show();
    }
    return homeView.show();
  }
}
