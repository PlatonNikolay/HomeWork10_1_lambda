package home.work10.lambda;

public class CreatorArrays {

    public static int[] getFilledArray(final int size, final int mod, Processable p) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = p.process(i, mod);
        }
        return array;
    }
}
