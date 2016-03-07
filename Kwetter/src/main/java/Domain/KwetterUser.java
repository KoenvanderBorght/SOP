package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by koenv on 7-3-2016.
 */
@Entity
public class KwetterUser {

    @Id @GeneratedValue
    long id;

    public KwetterUser() {
    }
}
