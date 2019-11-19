package com.company;
import javax.swing.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Obuda uni gyakorlo feladatok\n" +
                "http://users.nik.uni-obuda.hu/szollosi/docs/oop/OOPtantargyGyakorloFeladatokI20070801.pdf\n" +
                "[ENG-HUN mixed] Hasznald a linket es valassz a feladatok kozul 1-20 kozott: ");
        String userinput = reader.next();

        if (userinput.equals("1")) {

            System.out.println("\n First exercise: Olvassunk be egy sugár értéket és számítsuk" +
                    " ki kör kerületét és területét, valamint a gömb felszínét és térfogatát.");
            System.out.println("Enter a number: ");
            double input = reader.nextDouble();
            first_exercise first = new first_exercise();
            first.area(input);
            first.circumference(input);
            first.sphere_area(input);
            first.sphere_volume(input);

        } else if (userinput.equals("2")) {

            System.out.println("\nSecond exercise: Olvasson be három számot, majd írassa ki őket csökkenő sorrendben.");
            System.out.println("Enter the first number: ");
            int number1 = reader.nextInt();
            System.out.println("Enter the second number: ");
            int number2 = reader.nextInt();
            System.out.println("Enter the third number: ");
            int number3 = reader.nextInt();
            second_exercise second = new second_exercise();
            second.descending(number1, number2, number3);

        } else if (userinput.equals("3")) {

            System.out.println("\nThird exercise: Írjon programot, mely egy háromszög oldalainak (a, b, c) hosszát olvassa be a" +
                    " billentyűzetről, majd megmondja," +
                    "hogy a háromszög szerkeszthető-e! \n(A háromszög szerkeszthető, ha az (a+b>c) és (a+c>b) és (b+c>a) feltétel" +
                    "teljesül.) ");
            System.out.println("Enter the first number: ");
            double a = reader.nextDouble();
            System.out.println("Enter the second number: ");
            double b = reader.nextDouble();
            System.out.println("Enter the third number: ");
            double c = reader.nextDouble();
            third_exercise third = new third_exercise();
            third.triangle(a, b, c);


        } else if (userinput.equals("4")) {

            System.out.println("\nFourth exercise: Olvasson be a billentyűzetről egy számot és mondjuk meg," +
                    " hogy a szám negatív, vagy pozitív! ");
            System.out.println("Enter the number: ");
            int number = reader.nextInt();
            fourth_exercise fourth = new fourth_exercise();
            fourth.negative_or_positive(number);

        } else if (userinput.equals("5")) {

            System.out.println("\nFifth exercise: Kérjen be a billentyűzetről két számot, majd írja ki azok összegét," +
                    " különbségét, szorzatát és hányadosát a\n" +
                    "képernyőre!  ");
            System.out.println("Enter the number: ");
            int firstnum = reader.nextInt();
            System.out.println("Enter another number: ");
            int secondnum = reader.nextInt();
            fifth_exercise fifth = new fifth_exercise();
            fifth.add(firstnum, secondnum);
            fifth.div(firstnum, secondnum);
            fifth.multi(firstnum, secondnum);
            fifth.sub(firstnum, secondnum);

        } else if (userinput.equals("6")) {

            System.out.println("\nFifth exercise: Készítsen programot, mely logikai true/false értékeket olvas be" +
                    " a billentyűzetről! True esetén a képernyőre az\n" +
                    "IGAZ szót írja ki a program! ");
            System.out.println("Enter the value(must be: 'True' or 'False'): ");
            String value = reader.next();
            sixth_exercise sixth = new sixth_exercise();
            sixth.True_or_False(value);

        } else if (userinput.equals("7")) {

            System.out.println("\nFifth exercise: Írjon programot, mely beolvas egy számpárt a billentyűzetről," +
                    " majd kiírja a két szám számtani közepét! ");
            System.out.println("Enter a number: ");
            double valueinput = reader.nextDouble();
            System.out.println("Enter another number: ");
            double valueinput2 = reader.nextDouble();
            seventh_exercise seventh = new seventh_exercise();
            seventh.average_of_number(valueinput, valueinput2);

        } else if (userinput.equals("8")) {

            System.out.println("\nEighth exercise: A téglatest oldalainak ismeretében számítsa ki a lapátlókat, " +
                    "majd határozza meg a testátlót, a felszínt és a\n" +
                    "térfogatot!  ");
            System.out.println("Enter a number: ");
            double valueinput = reader.nextDouble();
            System.out.println("Enter another number: ");
            double valueinput2 = reader.nextDouble();
            System.out.println("Enter another number: ");
            double valueinput3 = reader.nextDouble();
            eighth_exercise eight = new eighth_exercise();
            eight.felszin(valueinput,valueinput2,valueinput3);
            eight.lapatlo(valueinput,valueinput2,valueinput3);
            eight.terfogat(valueinput,valueinput2,valueinput3);
            eight.testatlo(valueinput,valueinput2,valueinput3);

        } else if (userinput.equals("9")) {

            System.out.println("\nNinth exercise: A téglatest oldalainak ismeretében határozza meg az oldalélek" +
                    " összegét, majd írassa ki a legrövidebb oldalél\n" +
                    "összeggel rendelkező test adatait, felszínét és térfogatát. ");

            System.out.println("Enter a number: ");
            double valueinput = reader.nextDouble();
            System.out.println("Enter another number: ");
            double valueinput2 = reader.nextDouble();
            System.out.println("Enter another number: ");
            double valueinput3 = reader.nextDouble();
            ninth_exercise ninth = new ninth_exercise();
            ninth.oldalelek(valueinput,valueinput2,valueinput3);

        } else if (userinput.equals("10")) {

            System.out.println("\nTenth exercise: Deciliterben megadott súlyt bontsunk hektoliter," +
                    " liter, deciliter egységekre! \n");
            System.out.println("Enter a number: ");
            double valueinput = reader.nextDouble();
            tenth_exercise tenth = new tenth_exercise();
            tenth.deciliter(valueinput);

        } else if (userinput.equals("11")) {

            System.out.println("\nEleventh exercise: Beolvasott egész számról döntsük el, hogy osztható-e kilenccel," +
                    " a vizsgálatot a számjegyek összegének 9-cel\n" +
                    "való oszthatóságával végezzük, majd ellenőrizzük le maradékos osztással is. ");
            System.out.println("Enter a number: ");
            int valueinput = reader.nextInt();
            eleventh_exercise eleven = new eleventh_exercise();
            eleven.div_9(valueinput);

        } else if (userinput.equals("12")) {

            System.out.println("\nTwelfth exercise: Nem negatív egész számról határozza meg egy program," +
                    " hogy hány jegyű! ");
            System.out.println("Enter a number between 1 and 1000000: ");
            int valueinput = reader.nextInt();
            twelfth_exercise twelve= new twelfth_exercise();
            twelve.num_len(valueinput);

        } else if (userinput.equals("13")) {

            System.out.println("\nThirteenth exercise: Olvassa be egy hónap nevét, majd írja ki," +
                    " hogy melyik évszakban van az adott hónap");
            System.out.println("Enter an evszak in English: ");
            String valueinput = reader.next();
            thirteenth_exercise thirteenth = new thirteenth_exercise();
            thirteenth.evszak(valueinput);

        } else if (userinput.equals("14")) {

            System.out.println("\nFourteenth exercise: Kérje be egy cég éves bevételét és kiadását. " +
                    "Állapítsa meg, hogy nyereséges, veszteséges vagy nullszaldós volt-e\n" +
                    "a cég és az eredményt írja ki. ");
            System.out.println("Enter a number(bevetel): ");
            int valueinput = reader.nextInt();
            System.out.println("Enter another number(kiadas): ");
            int valueinput2 = reader.nextInt();
            fourteenth_exercise fourteen = new fourteenth_exercise();
            fourteen.ceg(valueinput,valueinput2);

        } else if (userinput.equals("15")) {

            System.out.println("\nFiveteenth exercise: Kérdezzük meg a felhasználót, hogy beszél-e magyarul, angolul," +
                    " spanyolul (vagy amilyen nyelven tudunk). Ha\n" +
                    "egyikre igennel felel, akkor köszönjük azon a nyelven, ha egyiket sem ismeri," +
                    " írjuk ki neki egy ♥-et. (unicode:\n" +
                    "2665) ");
            System.out.println("Enter a language(English,Magyar,Spanish,Deutsch,Polish or None): ");
            String valueinput = reader.next();
            fiveteenth_exercise fiveteen = new fiveteenth_exercise();
            fiveteen.multilanguage(valueinput);

        } else if (userinput.equals("16")) {

            System.out.println("\nSixteenth exercise: Készítsen jelszóellenőrző programot: a program addig fut, " +
                    "amíg helyes jelszót nem kap, de próbálkozás után leáll\n" +
                    "(más üzenettel, mint amikor sikeres a belépés). \n");
            System.out.println("hint: sok idot tolt a gep elott, csodakra kepes, es altalaban bezarkozott emberi faj  ");
            while(true) {
                System.out.println("Enter a password(in english): ");
                String valueinput = reader.next();
                sixteenth_exercise sixteenth = new sixteenth_exercise();
                sixteenth.password(valueinput);
            }

        } else if (userinput.equals("17")) {

            System.out.println("\nSeventeenth exercise: Olvassa be egy hónap sorszámát, majd írja ki," +
                    " hogy melyik évszakban van az adott hónap. ");
            System.out.println("Enter a number: ");
            int valueinput = reader.nextInt();
            seventeenth_exercise seventeenth = new seventeenth_exercise();
            seventeenth.evszak(valueinput);

        } else if (userinput.equals("18")) {

            System.out.println("\nEighteenth exercise: Számítsa ki az éves középhőmérsékletet" +
                    " miután a felhasználó megadta a havi középhőmérsékleteket. ");
            System.out.println("Enter a number: ");
            double valueinput = reader.nextDouble();
            eighteenth_exercise eighteenth = new eighteenth_exercise();
            eighteenth.questionmark();

        } else if (userinput.equals("19")) {

            System.out.println("\nNineteenth exercise: Készítsen programot, amely kávéautomatát szimulál: " +
                    "lehessen választani pohár nélkül, dupla cukorral és habos\n" +
                    "kávé közül. Az alapárhoz képest a dupla 20," +
                    " a habos 50 Ft-tal drágább, a pohár nélküli 10-zel olcsóbb. A\n" +
                    "választás után az automata kérje el a megfelelő összeget.\n" +
                    "x - alap\n" +
                    "dupla cuki- x+20\n" +
                    "habos - x+50\n" +
                    "pohar nelkul - x-10\n" +
                    "Alap ar: 100FT");


            System.out.println("Dupla cukor legyen?(Igen/Nem): ");
            String valueinput = reader.next();
            System.out.println("Habos legyen?(Igen/Nem): ");
            String valueinput2 = reader.next();
            System.out.println("Pohar nelkul legyen?(Igen/Nem): ");
            String valueinput3 = reader.next();
            nineteenth_exercise nineteenth = new nineteenth_exercise();
            nineteenth.kave(valueinput,valueinput2,valueinput3);


        } else if (userinput.equals("20")) {

            System.out.println("\nTwentieth exercise: Írjon címletező programot: a program megmondja," +
                    " hogy mennyi kell egy adott összeg kifizetéséhez előre\n" +
                    "megadott (konstans) címletekből. ");
            System.out.println("10,5,2,1 euros");
            System.out.println("Give me a number: ");
            int valueinput = reader.nextInt();
            twentieth_exercise twentieth = new twentieth_exercise();
            twentieth.cimlet(valueinput);
        }
    }
}
