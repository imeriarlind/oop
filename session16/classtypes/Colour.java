package session16.classtypes;

import lombok.Getter;

@Getter
public enum Colour {
    RED("E kuqe"),
    GREEN("E gjelber"),
    BLUE("E kalter"),
    BLACK("E zeze");

    private final String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return colour;
    }
}
