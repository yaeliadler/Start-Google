package main.java.Week3.BehavioralPatterns;

public interface Visitor {
    void visit(User user);

    void visit(Group group);

    void visit(Asset asset);
}
