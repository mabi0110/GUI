package cw1.zad2;

public abstract class Singer {

    private final String lastName;
    private static int number = 0;
    private int singerNumber;

    public Singer(String lastName) {
        this.lastName = lastName;
        number++;
        this.singerNumber = number;
    }

    abstract String sing();

    @Override
    public String toString() {
        return "(" + singerNumber + ") " + lastName + ": " + sing();
    }

    public static Singer loudest(Singer[] sng) {
        Singer tempMax = null;
        int sumMax = -1;

        for (Singer singer : sng) {
            int counter = 0;
            String songText = singer.sing();
            for (int j = 0; j < songText.length(); j++) {
                char character = songText.charAt(j);
                if (character >= 'A' && character <= 'Z') {
                    counter++;
                }
            }
            if (counter > sumMax){
                tempMax = singer;
                sumMax = counter;
            }
        }
        return tempMax;
    }

//    public static Singer loudest(Singer[] sng) {
//        int counter = 0;
//        int[] countersArray = new int[sng.length];
//        int index = 0;
//
//        for (Singer singer : sng) {
//            String songText = singer.sing();
//            for (int j = 0; j < songText.length(); j++) {
//                char character = songText.charAt(j);
//                if (character >= 'A' && character <= 'Z') {
//                    counter++;
//                }
//            }
//            countersArray[index] = counter;
//            index++;
//            counter = 0;
//        }
//
//        int maxElement = indexOfMaxElement(countersArray);
//        return sng[maxElement];
//    }
//
//    private static int indexOfMaxElement(int[] countersArray) {
//        int index = 0;
//        int maxElement = countersArray[index];
//
//        for (int i = 1; i < countersArray.length; i++) {
//            if (maxElement < countersArray[i]) {
//                maxElement = countersArray[i];
//                index = i;
//            }
//        }
//        return index;
//    }

}