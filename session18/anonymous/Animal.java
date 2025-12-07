package session18.anonymous;

public abstract class Animal {
    private boolean hasLegs;

    public Animal(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public abstract boolean isMammal();

    @Override
    public String toString() {
        return getClass() + " "+(isMammal() ? "is" : "is not") + " a mammal and it " + (hasLegs ? "has legs." : "does not have legs.");
    }
}