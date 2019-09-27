package ExceptionExample;

public class RuntineExceptions {
    String name = "codeX Java Group";
  public  void display  () throws ReflectiveOperationException {
      System.out.println(name);
    }

   public String names() throws ReflectiveOperationException {
            display();

        return name;
    }
}

