public class SprawdzCwiartke {

    public void sprawdzCwiartke(UkladWspol punkt) {


        if (punkt.x > 0 && punkt.y > 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży w I ćwiartce układu współrzędnych.");
        } else if (punkt.x < 0 && punkt.y > 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży w II ćwiartce układu współrzędnych.");

        } else if (punkt.x < 0 && punkt.y < 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży w III ćwiartce układu współrzędnych.");

        } else if (punkt.x > 0 && punkt.y < 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży w IV ćwiartce układu współrzędnych.");

        } else if (punkt.x == 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży na osi Y");

        } else if (punkt.y == 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży na osi X");

        }
        else if (punkt.x == 0 && punkt.y == 0) {

            System.out.println("Punkt (" + punkt.x + "," + punkt.y + ") leży na przecięciu osi współrzędnych");

        }
    }
}
