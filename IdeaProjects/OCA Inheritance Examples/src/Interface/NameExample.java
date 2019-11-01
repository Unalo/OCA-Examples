package Interface;
import Interface.Names;
public class NameExample {
    Names names = (name) -> name.length() > 5 ? "Unalo" : "Siyasanga";
    public  String m() {
        return names.greet("unalo");
    }
}
