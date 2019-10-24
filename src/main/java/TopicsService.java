import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class TopicsService {

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(

            new Topic("_spring", "_Spring FrameWork", "_Spring Description"),
            new Topic("spring", "Spring FrameWork", "Spring Description"),
            new Topic("java", "Java FrameWork", "Java Description")

    ));

    public List<Topic> getTopicList() {
        return topicList;
    }
}