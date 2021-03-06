package mailroom.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {

    public Category(String name){
        this.name = name;
    }

    private long id;
    private String name;

}
