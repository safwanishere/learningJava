public class stringExaminer {
    public static void main(String args[]){
        String name = "Umer$12_programmer";
        int vowelCount = 0;
        int digitCount = 0;
        int consCount = 0;
        int specCount = 0;

        name = name.toUpperCase();

        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U'){
                vowelCount += 1;
            }
            else if (name.charAt(i) == '$' || name.charAt(i) == '_'){
                specCount += 1;
            }
            else if (name.charAt(i) == '1' || name.charAt(i) == '2'){
                digitCount += 1;
            }
            else{
                consCount += 1;
            }
        }

        System.out.println("vowel count: " + vowelCount);
        System.out.println("digit count: " + digitCount);
        System.out.println("consonants count: " + consCount);
        System.out.println("special characters: " + specCount);
    }
}
