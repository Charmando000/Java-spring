package snake_backend;
import jakarta.persistence.*;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int points;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPoints(){
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}
