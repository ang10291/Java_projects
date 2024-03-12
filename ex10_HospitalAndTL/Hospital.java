package ArraysWorks_10;

public class Hospital {
    public static void main(String[] args) {
        float[] temperatureData = generatePatientsTemperatures(30);
        System.out.println(getReport(temperatureData));
    }

    public static float[] generatePatientsTemperatures(int patientsCount) {
        int min = 32;
        int max = 40;
        float[] patientsTemp = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientsTemp[i] = (float) (Math.random() * (max - min) + min);
        }
        return patientsTemp; // кол-во пациентов с температурой в диапазоне от 32 до 40 градусов
    }

    public static String getReport(float[] temperatureData) {
        StringBuilder stringBuilder = new StringBuilder();
        float sum = 0;
        int count = 1;

        for (int i = 0; i < temperatureData.length; i++) {
            float temp = (float) (Math.round(temperatureData[i] * 10.0) / 10.0);
            stringBuilder.append(temp).append(" ");
            sum += temperatureData[i];
            if (temperatureData[i] > 36.2 && temperatureData[i] < 36.9) {
                count++;
            }
        }
        float averageTemp = (float) (Math.round((sum / temperatureData.length) * 100.0) / 100.0);

        String report = "Температуры пациентов: " + stringBuilder.toString().trim() +
                "\nСредняя температура: " + averageTemp +
                "\nКоличество здоровых: " + count;
        return report;
    }
}