public class parcelSystem {
    Parcel[][] parcels;
    public parcelSystem(int n){
        parcels= new Parcel[n][n];
        for (int i = 0; i < parcels.length; i++) {
            for (int j = 0; j < parcels.length; j++) {
                parcels[i][j]= new Parcel();
            }
        }
    }
    public void create_parcel(int row, int column){
     parcels[row][column].input();
        parcels[row][column].setRow(row);
        parcels[row][column].setColumn(column);
    }
    public void setstate(int row, int column){
        if (!parcels[row][column].isDelieverd()){
            parcels[row][column].setDelieverd(true);
            parcels[row][column].setStored(false);
        }
        else{
            System.out.println("The parcel is Already deleiverd");
        }
    }
    public void check_position(int row, int column){
        if (parcels[row][column].isStored()) {
            System.out.println("There is already a parcel in this place");
        }
        else{
            create_parcel(row,column);
        }
    }
    public void getDetails(String id) {
        boolean found = false;
        for (int i = 0; i < parcels.length; i++) {
            for (int j = 0; j < parcels[i].length; j++) {
                Parcel parcel = parcels[i][j];
                if (parcel != null && id.equals(parcel.getParcelId())) {
                    System.out.println(parcel);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Parcel with ID " + id + " not found.");
        }
    }

}
