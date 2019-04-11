package hernandez.perez.uca.com.subway_app.classes;

import android.text.Html;

import java.util.ArrayList;

import hernandez.perez.uca.com.subway_app.Entities.BranchOffice;
import hernandez.perez.uca.com.subway_app.R;

public class NgBranchOffice {

    public NgBranchOffice() {
    }
    public ArrayList<BranchOffice> getBranchOffices(){
        ArrayList<BranchOffice> branchOffices= new ArrayList<>();
        BranchOffice branchOffice = new BranchOffice();
        BranchOffice branchOffice1 = new BranchOffice();
        BranchOffice branchOffice2 = new BranchOffice();
        BranchOffice branchOffice3 = new BranchOffice();
        BranchOffice branchOffice4 = new BranchOffice();

        branchOffice.setName("Subway Los Robles");
        branchOffice.setDescription("Somos una cadena de restaurantes de comida rápida estadounidense especializada en " +
                "la elaboración de sándwich submarino y bocadillos, ensaladas y pizza por ración.");
        branchOffice.setSchedule(Html.fromHtml(
                "<p>Lunes 9:00am - 10:00pm </p>"+
                "<p>Martes 9:00am - 10:00pm</p>"+
                "<p>Miercoles 9:00am - 10:00pm</p>"+
                "<p>Jueves 9:00am - 10:00pm</p>"+
                        "<p>viernes 9:00am - 10:00pm</p>"+
                        "<p>Sabado 9:00am - 10:00pm</p>" +
                        "<p>Domingo 9:00am - 10:00pm</p>").toString());
        branchOffice.setLatitude(12.1215892);
        branchOffice.setLongitude(-86.2601707);
        branchOffice.setIdImage(R.drawable.subway_robles);
        branchOffice.setAddress("Donde fue el Lacmiel 125 vrs al Este,casa 23 Modulo 1 y 2 Managua 24534, Nicaragua");
        branchOffice.setDate("Registrado desde 8 de abril del 2019");
        branchOffice.setId(11);
        branchOffices.add(branchOffice);

        branchOffice1.setName("Subway Metrocentro");
        branchOffice1.setDescription("Somos una cadena de restaurantes de comida rápida estadounidense especializada en " +
                "la elaboración de sándwich submarino y bocadillos, ensaladas y pizza por ración.");
        branchOffice1.setSchedule(Html.fromHtml(
                "<p>Lunes 9:00am - 10:00pm </p>"+
                        "<p>Martes 9:00am - 10:00pm</p>"+
                        "<p>Miercoles 9:00am - 10:00pm</p>"+
                        "<p>Jueves 9:00am - 10:00pm</p>"+
                        "<p>viernes 9:00am - 10:00pm</p>"+
                        "<p>Sabado 9:00am - 10:00pm</p>" +
                        "<p>Domingo 9:00am - 10:00pm</p>").toString());
        branchOffice1.setLatitude(12.1270997);
        branchOffice1.setLongitude(-86.2647094);
        branchOffice1.setIdImage(R.drawable.subway_metrocentro);
        branchOffice1.setAddress("Paseo Union Europea");
        branchOffice1.setDate("Registrado desde 9 de abril del 2019");
        branchOffice.setId(22);
        branchOffices.add(branchOffice1);

        branchOffice2.setName("Subway Jean Paul Genie");
        branchOffice2.setDescription("Somos una cadena de restaurantes de comida rápida estadounidense especializada en " +
                "la elaboración de sándwich submarino y bocadillos, ensaladas y pizza por ración.");
        branchOffice2.setSchedule(Html.fromHtml(
                "<p>Lunes 9:00am - 10:00pm </p>"+
                        "<p>Martes 9:00am - 10:00pm</p>"+
                        "<p>Miercoles 9:00am - 10:00pm</p>"+
                        "<p>Jueves 9:00am - 10:00pm</p>"+
                        "<p>viernes 9:00am - 10:00pm</p>"+
                        "<p>Sabado 9:00am - 10:00pm</p>" +
                        "<p>Domingo 9:00am - 10:00pm</p>").toString());
        branchOffice2.setLatitude(12.103247725681612);
        branchOffice2.setLongitude(-86.25848601422257);
        branchOffice2.setIdImage(R.drawable.subway_jennie);
        branchOffice2.setAddress("Club Terraza 200 mts al este 100 vrs al norte, Managua, Nicaragua");
        branchOffice2.setDate("Registrado desde 10 de abril del 2019");
        branchOffice.setId(33);
        branchOffices.add(branchOffice2);

        branchOffice3.setName("Subway Ciudad Jardin");
        branchOffice3.setDescription("Somos una cadena de restaurantes de comida rápida estadounidense especializada en " +
                "la elaboración de sándwich submarino y bocadillos, ensaladas y pizza por ración.");
        branchOffice3.setSchedule(Html.fromHtml(
                "<p>Lunes 9:00am - 10:00pm </p>"+
                        "<p>Martes 9:00am - 10:00pm</p>"+
                        "<p>Miercoles 9:00am - 10:00pm</p>"+
                        "<p>Jueves 9:00am - 10:00pm</p>"+
                        "<p>viernes 9:00am - 10:00pm</p>"+
                        "<p>Sabado 9:00am - 10:00pm</p>" +
                        "<p>Domingo 9:00am - 10:00pm</p>").toString());
        branchOffice3.setLatitude(12.144301854568525);
        branchOffice3.setLongitude(-86.2567075583695);
        branchOffice3.setIdImage(R.drawable.subway_ciudad_jardin);
        branchOffice3.setAddress("Esq Opu BDF casa G19, Loc 2 Managua, NIC");
        branchOffice3.setDate("Registrado desde 11 de abril del 2019");
        branchOffice.setId(44);
        branchOffices.add(branchOffice3);

        branchOffice4.setName("Subway Galerías Santo Domingo");
        branchOffice4.setDescription("Somos una cadena de restaurantes de comida rápida estadounidense especializada en " +
                "la elaboración de sándwich submarino y bocadillos, ensaladas y pizza por ración.");

        branchOffice4.setSchedule(Html.fromHtml(
                "<p>Lunes 9:00am - 10:00pm </p>"+
                        "<p>Martes 9:00am - 10:00pm</p>"+
                        "<p>Miercoles 9:00am - 10:00pm</p>"+
                        "<p>Jueves 9:00am - 10:00pm</p>"+
                        "<p>viernes 9:00am - 10:00pm</p>"+
                        "<p>Sabado 9:00am - 10:00pm</p>" +
                        "<p>Domingo 9:00am - 10:00pm</p>").toString());
        branchOffice4.setLatitude(12.103860129767114);
        branchOffice4.setLongitude(-86.24901614826797);
        branchOffice4.setIdImage(R.drawable.subway_galerias);
        branchOffice4.setAddress("Nivel 2, Food Court, Loc FC-03 CC Galerias Santo Domingo");
        branchOffice4.setDate("Registrado desde 12 de abril del 2019");
        branchOffice.setId(55);
        branchOffices.add(branchOffice4);
        return branchOffices;
    }
}
