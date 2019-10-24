import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class TopicsController{

    @Autowired
    private TopicsService topicsService;

    @RequestMapping(value="/topic")
    public List<Topic>  all_topics(){
        return topicsService.getTopicList();
    }
}