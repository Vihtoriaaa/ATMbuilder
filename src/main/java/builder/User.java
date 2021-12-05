package builder;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString @Getter
public class User {
    private String name;
    private String gender;
    private String race;
    private int age;
    private int height;
    @Singular
    private List<String> occupations;
}
