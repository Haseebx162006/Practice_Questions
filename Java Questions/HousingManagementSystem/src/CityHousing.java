public class CityHousing {
    HousingScheme[] housingScheme;
    String name;
    int s_count;
    CityHousing(String name) {
        this.name=name;
        housingScheme= new HousingScheme[10];
        s_count++;
    }
    public void addSociety(HousingScheme s) {
        if (s_count < housingScheme.length) {
            housingScheme[s_count++] = s;
            System.out.println("Society '" + s.name + "' added successfully!");
        } else {
            System.out.println("Cannot add more societies!");
        }
    }
    public HousingScheme findSocietyByName(String name) {
        for (int i = 0; i < s_count; i++) {
            if (housingScheme[i] != null && housingScheme[i].name.equalsIgnoreCase(name)) {
                return housingScheme[i];
            }
        }
        System.out.println("Society not found: " + name);
        return null;
    }
    public void bookPlot(String societyName, String blockName, int row, int col) {
        HousingScheme society = findSocietyByName(societyName);
        if (society != null) {
            society.bookPlot(blockName, row, col);
        }
    }
    public void cancelPlot(String societyName, String blockName, int row, int col) {
        HousingScheme society = findSocietyByName(societyName);
        if (society != null) {
            society.cancelPlotBooking(blockName, row, col);
        }
    }
    public void displaySocieties() {
        System.out.println("Societies in the City:");
        for (int i = 0; i < s_count; i++) {
            if (housingScheme[i]!=null){
                System.out.println(" - " + housingScheme[i].name);
            }
        }
    }
    
    public void displayPlots(String societyName, String blockName) {
        HousingScheme society = findSocietyByName(societyName);
        if (society != null) {
            society.displayPlotsInBlock(blockName);
        }
    }

}
