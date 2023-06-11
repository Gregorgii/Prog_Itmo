package managers;

import java.util.ArrayList;
import java.util.List;
import things.StudyGroup;

@XmlRootElement(name = "studyGroupList")
public class StudyGroupListWrapper {
    private List<StudyGroup> studyGroups;

    public StudyGroupListWrapper() {
        studyGroups = new ArrayList<>();
    }

    public StudyGroupListWrapper(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    @XmlElement(name = "studyGroup")
    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }
}