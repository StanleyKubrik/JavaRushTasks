package javaSyntax.level6;

public class task135_lev6_lec11 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea{
        public String getDescription(){
            return "IDEA";
        }
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}
