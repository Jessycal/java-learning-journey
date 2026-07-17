public class StudentEateryAnalysis {
    public static void main(String[] args) {
        int [] response = { 1, 2, 3, 4, 5, 5,5,5,5,5,5,5,5,5,4,14,9,6,1,2};
        int [] frequencyOfResponse = new int [6];

        for ( int answer = 0; answer < response.length; answer++) {
            try {
                ++frequencyOfResponse[response[answer]];
            }
            catch (ArrayIndexOutOfBoundsException errorExceptionHandling) {
                System.out.println(errorExceptionHandling);
                System.out.println(" Invalid Rating: [ " + answer + "] =" + response[answer]);
            }
        }
            System.out.printf("%s%10s%n", "Rating",     "Frequency"); // column headings

            for (int rating = 1; rating < frequencyOfResponse.length; rating++) {
                                System.out.println("[ " + rating + "] =" + frequencyOfResponse[rating]);


                    



            }
            if (frequencyOfResponse[5] >= 10) {
                        System.out.println("This Eatery services is superberb");
                    }
                    else {
                        System.out.println("Improve on Your service.....");
                    }

    }
}

