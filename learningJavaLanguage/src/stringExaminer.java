public class stringExaminer {
    public static void main(String args[]){
        String name = "Umer$1289_programmer";
        int vowelCount = 0, digitCount = 0, consCount = 0, specCount = 0, count = 0;

        name = name.toUpperCase();

        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U'){
                vowelCount += 1;
            }
            else if (name.charAt(i) == '$' || name.charAt(i) == '_'){
                specCount += 1;
            }
            else if (name.charAt(i) >= '0' && name.charAt(i) <= '9'){
                digitCount += 1;
            }
            else{
                consCount += 1;
            }
            count += 1;
        }

        System.out.println("vowel count: " + vowelCount);
        System.out.println("digit count: " + digitCount);
        System.out.println("consonants count: " + consCount);
        System.out.println("special characters: " + specCount);
        System.out.println();
        System.out.println("total characters: " + count);
    }
}
