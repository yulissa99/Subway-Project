package hernandez.perez.uca.com.subway_app.classes;

import java.util.ArrayList;

import hernandez.perez.uca.com.subway_app.Entities.BranchOffice;

public class NgBranchOffice {

    public NgBranchOffice() {
    }
    public ArrayList<BranchOffice> getBranchOffices(){
        ArrayList<BranchOffice> branchOffices= new ArrayList<>();
        BranchOffice branchOffice = new BranchOffice();
        branchOffice.setName("Subway Los Robles");
        branchOffice.setAddress("");
        branchOffice.setName("Subway Metrocentro");
        branchOffice.setName("Subway Jean Paul Genie");
        branchOffice.setAddress("Club Terraza 200 mts al este 100 vrs al norte, Managua, Nicaragua");
        branchOffice.setName("Subway Ciudad Jardin");
        branchOffice.setName("Subway Galerías Santo Domingo");


    }



}
