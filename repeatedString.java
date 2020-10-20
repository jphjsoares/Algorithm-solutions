
static long repeatedString(String s, long n) {
    long occurrence = 0;
    long appearencesOfAInS = 0;
    long appearencesOfAInSSubstring = 0;
    int lettersOfSLeftInPhrase = (int) (n % s.length());
    long fullSinPhrase = n / s.length();  


    //Check for occurrences of a's in the s string
    for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == 'a') {
            appearencesOfAInS++;
        }
    }

    for (int i = 0; i < (s.substring(0, lettersOfSLeftInPhrase)).length(); i++) {
        if(s.charAt(i) == 'a') {
            appearencesOfAInSSubstring++;
        }
    }

    occurrence = appearencesOfAInS*fullSinPhrase + appearencesOfAInSSubstring;
    return occurrence;
}