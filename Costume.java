public abstract class Costume {
    private String name;
    public Costume(String name) {
        this.name = name;
    }
    public class childreenCostume extends Costume {
        
        private int size;

        public childreenCostume(String name, int size) {
            super(name);
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public int getSize() {
            return size;
        }
    }
}
