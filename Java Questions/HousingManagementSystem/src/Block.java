public class Block {
    String name;
    Plot[][] plots;
    Park[] parks;
    public CommercialMarket commercialMarket;
    public static int BLOCK_COUNT=0;
    public Block(String name){
        BLOCK_COUNT++;
        this.name=name;
        plots=new Plot[5][5];
        int count=0;
        parks= new Park[1];
        parks[0]= new Park("Park121",5);
        commercialMarket= new CommercialMarket("Cm-121",14);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0){
                    plots[i][j]=new Plot("P"+count,PlotType.COMM_OFFICE,PlotShape.SQUARE,5);
                    count++;
                }
                else if (i==1){
                        plots[i][j]=new Plot("P"+count,PlotType.COMM_SHOP,PlotShape.RECTANGULAR,5,10);
                        count++;
                } else if (i==2) {
                    plots[i][j]=new ConcretePlot("P"+count,PlotType.RES_10_MARLA,PlotShape.RECTANGULAR,5,32,10);
                    count++;
                } else if (i==3) {
                    plots[i][j]= new Plot("C"+count,PlotType.PARKING,PlotShape.L_SHAPE,5,6,7,5);
                    count++;
                }
                else{
                    plots[i][j]= new Plot("E"+count,PlotType.COMM_OFFICE,PlotShape.SQUARE,5);
                    count++;
                }
            }
        }
    }
    public void book_plot(int row, int column){
        // Validate array bounds
        if (row < 0 || row >= plots.length || column < 0 || column >= plots[0].length) {
            System.out.println("Invalid row or column! Please enter values between 0-4.");
            return;
        }
        
        if (plots[row][column].isBooked()) {
            System.out.println("The plot is Already Booked");
        }
        else{
            plots[row][column].setBooked(true);
            System.out.println("The plot "+plots[row][column].getId()+" is now booked");
        }
    }
    public void cancel_booking(int row, int column){
        // Validate array bounds
        if (row < 0 || row >= plots.length || column < 0 || column >= plots[0].length) {
            System.out.println("Invalid row or column! Please enter values between 0-4.");
            return;
        }
        
        if (plots[row][column].isBooked()) {
            plots[row][column].setBooked(false);
            System.out.println("The plot booking is now Cancelled");
        }
        else{
            System.out.println("The Plot is not booked yet!");
        }
    }
    public void Search_by_id(String id){
        for (int i = 0; i < plots.length; i++) {
            for (int j = 0; j < plots.length; j++) {
                if (id.equals(plots[i][j].getId())) {
                    System.out.println("The Plot id is:"+plots[i][j].getId());
                    if (plots[i][j].isBooked()) {
                        System.out.println("Status:Booked");
                    }else{
                        System.out.println("Status:Not Booked");
                    }
                }
            }
        }
    }
    
    public void displayPlots() {
        System.out.println("Available plots in " + name + ":");
        for (int i = 0; i < plots.length; i++) {
            for (int j = 0; j < plots[i].length; j++) {
                String status = plots[i][j].isBooked() ? "BOOKED" : "AVAILABLE";
                System.out.println("Plot " + plots[i][j].getId() + " at [" + i + "," + j + "] - " + status);
            }
        }
    }
}
