public class Subject {
    private String title;
    private Tutor tutor;
    private String[] keywords = new String[5];

    public void setTitle(String title) {
        if(this.title==null) {
            this.title = title;
        }
    }

    public void setTutors(Tutor tutor) {
        this.tutor = tutor;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String getTitle() {
        return title;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
