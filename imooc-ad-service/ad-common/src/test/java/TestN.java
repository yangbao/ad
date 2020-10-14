import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestN {
    public static void main(String[] args) {

        User u1 = new User(1001,"tom");
        User u2= new User(1002,"jim");
        Set<Long> value = new HashSet( Collections.singleton(u1.getId()));
        System.out.println(value);
    }

}
 class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}