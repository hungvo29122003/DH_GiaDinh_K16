package Convert.Observer;
import java.util.LinkedList;
import java.util.List;
public class Convert_Publisher {
    // filed
    private List<Convert_Subcriber> subcribers = new LinkedList<>();

    // methods
    public void subcriber(Convert_Subcriber subcriber) {
        subcribers.add(subcriber);
    }

    public void unsubcriber(Convert_Subcriber subcriber) {
        subcribers.remove(subcriber);
    }

    public void notifySubcriber() {
        for (Convert_Subcriber subcriber : subcribers) {
            subcriber.update();
        }
    }
}
