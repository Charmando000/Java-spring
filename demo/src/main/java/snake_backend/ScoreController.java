package snake_backend;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/scores")
public class ScoreController {
    private final ScoreRepository repo;

    public ScoreController(ScoreRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Score saveScore(@RequestBody Score score){
        return repo.save(score);
    }

    @GetMapping
    public List<Score> getScores() {
        return repo.findTop10ByOrderByPointsDesc();
    }
}
