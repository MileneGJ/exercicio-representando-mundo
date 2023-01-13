public class Student {
    private String name;
    private String email;

    Question createQuestion(Subject subject, String keyword, double[] content ) {
        Question newQuestion = new Question();
        newQuestion.setSubject(subject);
        newQuestion.setKeyword(keyword);
        newQuestion.setContent(content);
        newQuestion.setStudentName(name);
        return newQuestion;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
        this.email = email;
        }
    }

    public void setName(String name) {
        if(this.name==null) {
        this.name = name;
        }
    }
}
