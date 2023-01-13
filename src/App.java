public class App {
    public static void main(String[] args) throws Exception {
        Subject matematica = new Subject();
        matematica.setTitle("Matematica");
        String[] keywords = {"soma","subtracao","divisao","multiplicacao"};
        matematica.setKeywords(keywords);

        Tutor maria = new Tutor();
        maria.setName("Maria");

        matematica.setTutors(maria);

        Student miranda = new Student();
        miranda.setName("Miranda");
        miranda.setEmail("miranda@email.com");

        double[] content = {1,2,(-3.5)};
        Question mirandaQuestion = miranda.createQuestion(matematica, "subtracao", content);

        System.out.println(maria.createAnswer(mirandaQuestion));
    }
}
