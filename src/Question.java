public class Question {
    private Subject subject;
    private String keyword;
    private double[] content;
    private String studentName;

    String showQuestion(){
        return studentName + " asked in " + subject.getTitle() + " section " + keyword + "content";
    }

    public void setContent(double[] content) {
        this.content = content;
    }

    public void setKeyword(String keyword) {
        String[] keywordsList = subject.getKeywords();
        for(int i =0; i<keywordsList.length; i++) {
            if(keywordsList[i].equals(keyword)) {
                this.keyword = keyword;
            }
        }
    }
    
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double[] getContent() {
        return content;
    }

    public String getKeyword() {
        return keyword;
    }

    public Subject getSubject() {
        return subject;
    }
    public String getStudentName() {
        return studentName;
    }
}
