package CreationalPatterns.prototype;

public interface Prototype {
    Repository getShallowClone();

    Repository getDeepClone();
}
