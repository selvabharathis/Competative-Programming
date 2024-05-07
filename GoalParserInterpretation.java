public class GoalParserInterpretation {
    public static String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
    public static void main(String args[]) {
        System.out.println("Result: "+interpret("G()(al)"));
    }
}
