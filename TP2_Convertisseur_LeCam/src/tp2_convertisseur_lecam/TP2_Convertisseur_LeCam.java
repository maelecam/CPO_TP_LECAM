/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_lecam;

/**
 *
 * @author 33604
 */
public class TP2_Convertisseur_LeCam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class convertisseur {
            double valeur1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veillez saisir un nombre :");
        valeur1 = sc.nextDouble();
        double sauvegarde;
        sauvegarde = valeur1;
        int saisie;
        do {
            System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
            System.out.println("1) De Celcius vers Kelvin");
            System.out.println("2) De Kelvin vers Farenheit");
            System.out.println("3) De Kelvin vers Celcius");
            System.out.println("4) De Farenheit vers Celcius");
            System.out.println("5) De Kelvin vers Farenheit");
            System.out.println("6) De Farenheit vers Kelvin");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Veillez saisir un nombre :");
            saisie = sc1.nextInt();
            if (saisie < 1 || saisie > 6) {
                System.out.println("Saisie invalide.Veuillez choisir un nombre entre 1 et 6. ");
            }

        } while (saisie < 1 || saisie > 6);
        switch (saisie) {
            case 1:
                valeur1 = CelciusVersKelvin(valeur1);
                System.out.println(sauvegarde + "degré Celcius est égal à " + valeur1 + " degré Kelvin");
                break;
            case 2:
                valeur1 = CelciusVersFarenheit(valeur1);
                System.out.println(sauvegarde + "degré Celcius est égal à " + valeur1 + " degré Farenheit");
                break;
            case 3:
                valeur1 = KelvinVersCelcius(valeur1);
                System.out.println(sauvegarde + "degré Kelvin est égal à " + valeur1 + " degré Celcius");
                break;
            case 4:
                valeur1 = FarenheitVersCelcius(valeur1);
                System.out.println(sauvegarde + "degré Farenheit est égal à " + valeur1 + " degré Celcius");
                break;
            case 5:
                valeur1 = KelvinVersFahrenheit(valeur1);
                System.out.println(sauvegarde + "degré Kelvin est égal à " + valeur1 + " degré Farenheit");
                break;
            case 6:
                valeur1 = FahrenheitVersKelvin(valeur1);
                System.out.println(sauvegarde + "degré Farenheit est égal à " + valeur1 + " degré Kelvin");
                break;
        }
    }

    public static double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        tCelcius = tCelcius * 33.8;
        return tCelcius;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }

    public static double FarenheitVersCelcius(double tFaren) {
        tFaren = tFaren / 33.8;
        return tFaren;
    }

    public static double KelvinVersFahrenheit(double tKelvin) {
        tKelvin = tKelvin / 255.93;
        return tKelvin;
    }

    public static double FahrenheitVersKelvin(double tFaren) {
        tFaren = tFaren * 255.93;
        return +tFaren;
    }
        }
    }
    
}
