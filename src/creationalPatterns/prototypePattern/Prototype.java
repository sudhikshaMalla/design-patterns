package creationalPatterns.prototypePattern;

public interface Prototype {
    Repository getShallowClone();

    Repository getDeepClone();
}
