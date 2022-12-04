package Racing;

public enum Carrying {

        N_1(3.5f), N_2(3.5f, 12f), N_3(12f, 0);

        private float lower;
        private float upper;

        Carrying(float upper) {
            this.upper = upper;
        }

        Carrying() {
        }

        Carrying(float lower, float upper) {
            this.lower = lower;
            this.upper = upper;
        }

        public float getLower() {
            return lower;
        }

        public float getUpper() {
            return upper;
        }

        public static Carrying getValue(double value) {
            for (Carrying carrying : Carrying.values()) {
                if (value > carrying.getLower() && value < carrying.getUpper()) {
                    System.out.println(carrying);
                    return carrying;
                }
            }
            return null;
        }


        @Override
        public String toString() {
            if (lower == 0.0f) {
                return "Грузоподъемность до " + upper + " тонн.";
            } else if (upper == 0.0f) {
                return "Грузоподъемность свыше " + lower + " тонн.";
            }
            return "Грузоподъемность: " + "от " + lower + ", до " + upper + " тонн.";
        }
    }

