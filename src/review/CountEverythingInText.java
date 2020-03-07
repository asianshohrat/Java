package review;

public class CountEverythingInText {
    public static void main(String[] args) {
        String line = "This Nau Bootcamp is aw3som3. Always Java Is perfect with Mr.Duran  5";
        int vowels = 0, consonants = 0, numbers = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++numbers;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Total Letters: "+ (vowels+consonants));
        System.out.println("Numbers: " + numbers);
        System.out.println("Spaces: " + spaces);
    }
}

