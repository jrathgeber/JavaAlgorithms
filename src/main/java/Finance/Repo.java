package Finance;

public class Repo {


    public static void main (String...args) {

        double bondPrice = 100.0;
        double haircut2 = 1.02;
        double haircut1 = 0.98;

        System.out.println("Haircut 1 is " + bondPrice * haircut1 ) ;
        System.out.println("Haircut 2 is " + bondPrice / haircut2 ) ;

    }

    private void haircut() {


    }


    private void mmargin () {

       // Margin adjustment ¼
       // ððoriginal consideration þ repo interest charged to dateÞ
       // ð1 þ initial marginÞÞ  ðnew all  in price  nominal amountÞ

    }

    private void gap () {

        // We noted earlier that gap is a measure of the difference in interest-rate sensitivity
        //of assets and liabilities that revalue at a particular date, expressed as a
        //cash value

    }

}
