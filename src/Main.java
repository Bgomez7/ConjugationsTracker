public class Main {
    public static void main(String[] args) {
        //Read in and hold csv data in a String[] arraylist.
        CSVData data = new CSVData("src\\FrenchConjugations.csv");

        for(int i = 0; i < data.conjugations.size(); i++) {
            String[] currentArr = data.conjugations.get(i);
            for (String s : currentArr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}