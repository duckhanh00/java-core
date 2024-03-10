public class VariableConstantSample {
    public static void main(String[] args) {
        char π = '1';
        char $ = '1';
        char € = '1';
        char 東 = '1';
        char ä = 'ä';
        System.out.println(東);
        System.out.println("東".getBytes().length);
        System.out.println(Character.isJavaIdentifierPart('東'));
        System.out.println(Character.isJavaIdentifierPart('™'));
        System.out.println(Character.isLetter('東'));
        System.out.println(Character.isLetter('™'));
    }
}
