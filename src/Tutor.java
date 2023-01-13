public class Tutor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name==null) {
            this.name = name;
        }
    }

    String createAnswer(Question question) {
        double[] content = question.getContent(); 
        double initialValue = content[0];
        String initialAnswer = "Olá, " + question.getStudentName() + ". A resposta é ";
        Subject subject = question.getSubject();
        if(subject.getTitle().equals("Matematica")){
        switch (question.getKeyword()) {
            case "soma":
                for(int i=1; i<content.length; i++) {
                    initialValue += content[i];
                }
                return initialAnswer+initialValue;
            
            case "subtracao":
                for(int i=1; i<content.length; i++) {
                    initialValue -= content[i];
                }
                return initialAnswer+initialValue;
            
            case "multiplicacao":
                for(int i=1; i<content.length; i++) {
                    initialValue *= content[i];
                }
                return initialAnswer+initialValue;
            
            case "divisao":
                for(int i=1; i<content.length; i++) {
                    initialValue = initialValue / content[i];
                }
                return initialAnswer+initialValue;

            default:
                return "Resposta não encontrada";
            }
        } else {
            return "Resposta não encontrada";
        }
    }
}
