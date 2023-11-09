package DependencyInversionPrinciple.followed;

public class MackBook {
     final KeyboardI keyboardI;
     final MouseI mouseI;

    public MackBook(KeyboardI keyboardI,MouseI mouseI) {
        this.keyboardI = keyboardI;
        this.mouseI=mouseI;
    }
}
