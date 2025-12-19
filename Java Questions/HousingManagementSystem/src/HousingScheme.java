public class HousingScheme {
    private Block[] blocks;
    private int blockCount;
    String name;
    public HousingScheme(String name) {
        this.name=name;
        blocks = new Block[10];
        blockCount = 0;
        blocks[blockCount++] = new Block("A-1");
        blocks[blockCount++] = new Block("B-2");
        blocks[blockCount++] = new Block("C-3");
    }

    public void addBlock(String name) {
        if (blockCount < blocks.length) {
            blocks[blockCount++] = new Block(name);
            System.out.println("Block " + name + " added successfully!");
        } else {
            System.out.println("Cannot add more blocks! Storage full.");
        }
    }
    public Block findBlockByName(String name) {
        for (int i = 0; i < blockCount; i++) {
            if (blocks[i].name.equalsIgnoreCase(name)) {
                return blocks[i];
            }
        }
        System.out.println("Block not found: " + name);
        return null;
    }
    public Block findBlockByIndex(int index) {
        if (index >= 0 && index < blockCount) {
            return blocks[index];
        } else {
            System.out.println("Invalid block index!");
            return null;
        }
    }
    public void bookPlot(String blockName, int row, int col) {
        Block block = findBlockByName(blockName);
        if (block != null) {
            block.book_plot(row, col);
        }
    }
    public void cancelPlotBooking(String blockName, int row, int col) {
        Block block = findBlockByName(blockName);
        if (block != null) {
            block.cancel_booking(row, col);
        }
    }
    public void computeTotals() {
        int totalPlots = 0;
        int bookedPlots = 0;
        for (int i = 0; i < blockCount; i++) {
            Block block = blocks[i];
            for (int r = 0; r < block.plots.length; r++) {
                for (int c = 0; c < block.plots[r].length; c++) {
                    totalPlots++;
                    if (block.plots[r][c].isBooked()) {
                        bookedPlots++;
                    }
                }
            }
        }

        int available = totalPlots - bookedPlots;
        System.out.println("Total Plots: " + totalPlots);
        System.out.println("Booked Plots: " + bookedPlots);
        System.out.println("Available Plots: " + available);
    }

    public void displayBlocks() {
        System.out.println("Blocks in this Housing Scheme:");
        for (int i = 0; i < blockCount; i++) {
            System.out.println( blocks[i].name);
        }
    }
    
    public void displayPlotsInBlock(String blockName) {
        Block block = findBlockByName(blockName);
        if (block != null) {
            block.displayPlots();
        }
    }
}
