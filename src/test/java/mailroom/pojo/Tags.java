package mailroom.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Tags {
    private long id;
    private String name;

    public Tags(String name){
        this.setName(name);
    }

}
