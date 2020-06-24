package org.enumexercises.zad_3;

public enum TemperatureConvert {

    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn * 1.8) + 32);
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn + 273.15);
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn + 273.15);
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn - 32) / 1.8);
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn + 459.67) * 5 / 9);
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (float) ((tempIn * 1.8) - 559.67);
        }
    });

    private char tempIn;
    private char tempOut;
    private Converter converter;

    TemperatureConvert(char tempIn, char tempOut, Converter converter) {
        this.tempIn = tempIn;
        this.tempOut = tempOut;
        this.converter = converter;
    }

    public static float convertTemperature(char tempIn, char tempOut, float value) {
        for (TemperatureConvert temperatureCovert : values()) {
            if (tempIn == C_F.tempIn && tempOut == C_F.tempOut) {
                return temperatureCovert.converter.convert(value);
            }

        }
        return 0;
    }

}
