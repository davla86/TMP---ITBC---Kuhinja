import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Application {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                WeightedIngredient brasno = new WeightedIngredient("Wheat", 1, 80);
                WeightedIngredient secer = new WeightedIngredient("Sugar", 1, 102);
                WeightedIngredient ulje = new WeightedIngredient("Oil", 1, 200);
                WeightedIngredient kakao = new WeightedIngredient("Cocoa", 0.1, 50);
                WeightedIngredient vanila = new WeightedIngredient("Vanilla", 0.05, 40);
                WeightedIngredient visnja = new WeightedIngredient("Cherry", 1, 120);
                WeightedIngredient krompir = new WeightedIngredient("Potato", 1, 80);
                WeightedIngredient batat = new WeightedIngredient("Sweet potato", 1, 350);
                WeightedIngredient kecap = new WeightedIngredient("Ketchup", 0.1, 120);
                WeightedIngredient paprika = new WeightedIngredient("Pepper", 1, 130);
                WeightedIngredient mleko = new WeightedIngredient("Milk", 1, 150);
                WeightedIngredient so = new WeightedIngredient("Salt", 1, 90);
                WeightedIngredient meso = new WeightedIngredient("Meat", 1, 500);
                WeightedIngredient luk = new WeightedIngredient("Onion", 1, 140);
                WeightedIngredient cokolada = new WeightedIngredient("Chocolate", 0.1, 135);

                ArrayList<WeightedIngredient> musakaList = new ArrayList<WeightedIngredient>();
                musakaList.add(krompir.getScale(1));
                musakaList.add(meso.getScale(0.5));
                musakaList.add(ulje.getScale(0.1));
                musakaList.add(luk.getScale(0.1));
                Recipe musaka = new Recipe("Musaka", Level.MEDIUM, musakaList);

                ArrayList<WeightedIngredient> corbanKrompirList = new ArrayList<WeightedIngredient>();
                corbanKrompirList.add(krompir.getScale(0.5));
                corbanKrompirList.add(luk.getScale(0.2));
                corbanKrompirList.add(ulje.getScale(0.1));
                corbanKrompirList.add(so.getScale(0.03));
                Recipe corbanKrompir = new Recipe("Corban Krompir", Level.MEDIUM, corbanKrompirList);

                ArrayList<WeightedIngredient> sladoledList = new ArrayList<WeightedIngredient>();
                sladoledList.add(vanila.getScale(0.2));
                sladoledList.add(mleko.getScale(0.5));
                sladoledList.add(secer.getScale(0.2));
                Recipe sladoled = new Recipe("Sladoled", Level.EASY, sladoledList);

                ArrayList<WeightedIngredient> pitaOdVisanjaList = new ArrayList<WeightedIngredient>();
                pitaOdVisanjaList.add(brasno.getScale(0.3));
                pitaOdVisanjaList.add(visnja.getScale(0.2));
                pitaOdVisanjaList.add(ulje.getScale(0.1));
                pitaOdVisanjaList.add(secer.getScale(0.1));
                Recipe pitaOdVisanja = new Recipe("Pita od visanja", Level.BEGINNER, pitaOdVisanjaList);

                ArrayList<WeightedIngredient> punjenePaprikeList = new ArrayList<WeightedIngredient>();
                punjenePaprikeList.add(meso.getScale(0.6));
                punjenePaprikeList.add(ulje.getScale(0.1));
                punjenePaprikeList.add(paprika.getScale(0.5));
                punjenePaprikeList.add(krompir.getScale(0.7));
                punjenePaprikeList.add(luk.getScale(0.2));
                Recipe punjenePaprike = new Recipe("Punjene paprike", Level.HARD, punjenePaprikeList);

                ArrayList<WeightedIngredient> palacinkeList = new ArrayList<WeightedIngredient>();
                palacinkeList.add(mleko.getScale(0.4));
                palacinkeList.add(ulje.getScale(0.1));
                palacinkeList.add(brasno.getScale(0.4));
                palacinkeList.add(cokolada.getScale(0.1));
                Recipe palacinke = new Recipe("Palacinke", Level.EASY, palacinkeList);

                ArrayList<WeightedIngredient> picaList = new ArrayList<WeightedIngredient>();
                picaList.add(ulje.getScale(0.1));
                picaList.add(brasno.getScale(0.5));
                picaList.add(kecap.getScale(0.2));
                picaList.add(meso.getScale(0.2));
                picaList.add(luk.getScale(0.1));
                Recipe pica = new Recipe("Pica", Level.PRO, picaList);

                ArrayList<WeightedIngredient> vocnaTortaList = new ArrayList<WeightedIngredient>();
                vocnaTortaList.add(brasno.getScale(0.5));
                vocnaTortaList.add(mleko.getScale(0.5));
                vocnaTortaList.add(ulje.getScale(0.1));
                vocnaTortaList.add(secer.getScale(0.3));
                vocnaTortaList.add(kakao.getScale(1));
                vocnaTortaList.add(visnja.getScale(0.3));
                Recipe vocnaTorta = new Recipe("Vocna Torta", Level.HARD, vocnaTortaList);

                ArrayList<WeightedIngredient> peceniBatatList = new ArrayList<WeightedIngredient>();
                peceniBatatList.add(batat.getScale(0.6));
                peceniBatatList.add(ulje.getScale(0.1));
                peceniBatatList.add(luk.getScale(0.2));
                peceniBatatList.add(so.getScale(0.01));
                Recipe peceniBatat = new Recipe("Peceni batat", Level.MEDIUM, peceniBatatList);

                ArrayList<WeightedIngredient> bakinKolacList = new ArrayList<WeightedIngredient>();
                bakinKolacList.add(brasno.getScale(0.3));
                bakinKolacList.add(ulje.getScale(0.1));
                bakinKolacList.add(mleko.getScale(0.3));
                bakinKolacList.add(secer.getScale(0.2));
                Recipe bakinKolac = new Recipe("Bakin kolac", Level.BEGINNER, bakinKolacList);


                Fridge fridge = new Fridge();




                System.out.println("Unesite sumu novca koju ste izdvojili za nabavku: ");
                double d = sc.nextDouble();
                Boolean uslov = true;
                System.out.println("Dodajte namirnice za frizider: ");
                while (d > 0 && uslov) {
                        System.out.println("Izaberite sifru proizvoda sa liste, a zatim unesite kolicinu. " +
                                "Za prestanak nabavke pritisnite 0.");

                        System.out.println("brasno-1, secer-2, ulje-3, kakao-4, vanila-5, visnja-6");
                        System.out.println("krompir-7, batat-8, kecap-9, paprika-10, mleko-11");
                        System.out.println("so-12, meso-13, luk-14, cokolada-15");

                        int n = sc.nextInt();


                        switch (n) {
                                case 1: {
                                        System.out.println("Unesite kolicinu brasna:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Brasno = brasno.getScale(s);

                                        if (Brasno.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Brasno);
                                        d = d - Brasno.getPrice();
                                        break;
                                }
                                case 2: {
                                        System.out.println("Unesite kolicinu secera:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Secer = secer.getScale(s);

                                        if (Secer.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Secer);
                                        d = d - Secer.getPrice();
                                        break;
                                }
                                case 3: {
                                        System.out.println("Unesite kolicinu ulja:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Ulje = ulje.getScale(s);

                                        if (Ulje.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Ulje);
                                        d = d - Ulje.getPrice();
                                        break;
                                }

                                case 4: {
                                        System.out.println("Unesite kolicinu kakaa:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Kakao = kakao.getScale(s);

                                        if (Kakao.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Kakao);
                                        d = d - Kakao.getPrice();
                                        break;
                                }


                                case 5: {
                                        System.out.println("Unesite kolicinu vanile:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Vanila = vanila.getScale(s);

                                        if (Vanila.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Vanila);
                                        d = d - Vanila.getPrice();
                                        break;
                                }

                                case 6: {
                                        System.out.println("Unesite kolicinu visnje:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Visnja = visnja.getScale(s);

                                        if (Visnja.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Visnja);
                                        d = d - Visnja.getPrice();
                                        break;
                                }

                                case 7: {
                                        System.out.println("Unesite kolicinu krompira:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Krompir = krompir.getScale(s);

                                        if (Krompir.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Krompir);
                                        d = d - Krompir.getPrice();
                                        break;
                                }

                                case 8: {
                                        System.out.println("Unesite kolicinu batata:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Batat = batat.getScale(s);

                                        if (Batat.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Batat);
                                        d = d - Batat.getPrice();
                                        break;
                                }
                                case 9: {
                                        System.out.println("Unesite kolicinu kecapa:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Kecap = kecap.getScale(s);

                                        if (Kecap.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Kecap);
                                        d = d - Kecap.getPrice();
                                        break;
                                }

                                case 10: {
                                        System.out.println("Unesite kolicinu paprike:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Paprika = paprika.getScale(s);

                                        if (Paprika.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Paprika);
                                        d = d - Paprika.getPrice();
                                        break;
                                }

                                case 11: {
                                        System.out.println("Unesite kolicinu mleka:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Mleko = mleko.getScale(s);

                                        if (mleko.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Mleko);
                                        d = d - Mleko.getPrice();
                                        break;
                                }

                                case 12: {
                                        System.out.println("Unesite kolicinu soli:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient So = so.getScale(s);

                                        if (So.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(So);
                                        d = d - So.getPrice();
                                        break;
                                }

                                case 13: {
                                        System.out.println("Unesite kolicinu mesa:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Meso = meso.getScale(s);

                                        if (Meso.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Meso);
                                        d = d - Meso.getPrice();
                                        break;
                                }

                                case 14: {
                                        System.out.println("Unesite kolicinu luka:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Luk = luk.getScale(s);

                                        if (Luk.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Luk);
                                        d = d - Luk.getPrice();
                                        break;
                                }

                                case 15: {
                                        System.out.println("Unesite kolicinu cokolade:");
                                        double s = sc.nextDouble();
                                        WeightedIngredient Cokolada = cokolada.getScale(s);

                                        if (Cokolada.getPrice() > d) {
                                                System.out.println("Nemate dovoljno novca za ovu kolicinu! Unesite ponovo!");
                                                break;
                                        }
                                        fridge.addIngredient(Cokolada);
                                        d = d - Cokolada.getPrice();
                                        break;

                                }
                                case 0:
                                        uslov = false;


                        }


                }



                Boolean uslov2 = true;
                System.out.println("Preostala suma novca je: " + d);

                while (uslov2){
                        System.out.println("Unesite sifru jela koje zelite da spremite i proverite da li imate dovoljno namirnica.");
                        System.out.println("musaka - 1, corban krompir - 2, sladoled - 3, pita od visanja - 4, punjene paprike - 5");
                        System.out.println("palacinke - 6, pica - 7, vocna torta - 8, peceni batat - 9, bakin kolac - 10");
                        System.out.println("Za prekid kuvanja pretisnite 0.");
                        int a = sc.nextInt();
                        Boolean t = true;

                        switch (a) {

                                case 1: {
                                        t = fridge.enoughIngredient(musaka);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za musaku! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(musaka);
                                                System.out.println("Musaka je spremljena!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 2: {
                                        t = fridge.enoughIngredient(corbanKrompir);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za corban krompir! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(corbanKrompir);
                                                System.out.println("Corban krompir je spremljen!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 3: {
                                        t = fridge.enoughIngredient(sladoled);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za sladoled! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(sladoled);
                                                System.out.println("Sladoled je spremljen!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo! ");
                                        }
                                        break;
                                }

                                case 4: {
                                        t = fridge.enoughIngredient(pitaOdVisanja);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za pitu od visanja! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(pitaOdVisanja);
                                                System.out.println("Pita od visanja je spremna!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 5: {
                                        t = fridge.enoughIngredient(punjenePaprike);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za punjenu papriku! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(punjenePaprike);
                                                System.out.println("Punjene paprike su spremne!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 6: {
                                        t = fridge.enoughIngredient(palacinke);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za palacinke! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(palacinke);
                                                System.out.println("Palacinke su spremne!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 7: {
                                        t = fridge.enoughIngredient(pica);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za picu! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(pica);
                                                System.out.println("Pica je spremna!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 8: {
                                        t = fridge.enoughIngredient(vocnaTorta);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za vocnu tortu! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(vocnaTorta);
                                                System.out.println("Vocna torta je spremna!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 9: {
                                        t = fridge.enoughIngredient(peceniBatat);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za peceni batat! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(peceniBatat);
                                                System.out.println("Peceni batat je spreman!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;
                                }

                                case 10: {
                                        t = fridge.enoughIngredient(bakinKolac);
                                        if (t) {
                                                System.out.println("Imate dovoljno namirnica za bakin kolac! Hajdemo, vreme je za kuvanje!");
                                                fridge.makeMeal(bakinKolac);
                                                System.out.println("Bakin kolac je spreman!");
                                        } else {
                                                System.out.println("Nemate dovoljno namirnica za ovo jelo!");
                                        }
                                        break;}
                                case 0: uslov2 = false;

                        }
                }
        }


}
















