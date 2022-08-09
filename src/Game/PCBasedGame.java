package Game;

public class PCBasedGame extends Game{
        private int minRAM;
        private int HDD;
        private double minCPU;

        public PCBasedGame(String description) {
                super(description);
        }

        public PCBasedGame(int minRAM, int HDD, double minCPU) {
                this.minRAM = minRAM;
                this.HDD = HDD;
                this.minCPU = minCPU;
        }

        public int getMinRAM() {
                return minRAM;
        }

        public int getHDD() {
                return HDD;
        }

        public double getMinCPU() {
                return minCPU;
        }

        public void setMinRAM(int minRAM) {
                this.minRAM = minRAM;
        }

        public void setHDD(int HDD) {
                this.HDD = HDD;
        }

        public void setMinCPU(double minCPU) {
                this.minCPU = minCPU;
        }

        @Override
        public String toString() {
                return "PCBasedGame{" +
                        "minRAM=" + minRAM +
                        ", HDD=" + HDD +
                        ", minCPU=" + minCPU +
                        '}';
        }
}
