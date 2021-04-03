package home.work10.lambda;

import java.util.Random;

public enum ProcessEnum {

    SUM((index, mod) -> index + mod),
    MULTI((index, mod) -> index * mod),
    EVEN_OR_ODD((index, mod) -> (index % 2 == 0) ? (index / 2 + mod) : (index * index - mod)),
    GEN1(((index, mod) -> {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        return index * num - mod;
    })),
    GEN2(((index, mod) -> index * mod - index + mod));

    private final Processable processable;

    ProcessEnum(Processable p) {
        this.processable = p;
    }

    public Processable getProcess() {
        return processable;
    }

}
