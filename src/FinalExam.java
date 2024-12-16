import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Creature {
    String name;
    int powerLevel;

    public Creature(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }
}

public class FinalExam {

    public static void main(String[] args) {
        // Create Creature objects
        List<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Dragon", 95));
        creatures.add(new Creature("Griffin", 88));
        creatures.add(new Creature("Unicorn", 78));
        creatures.add(new Creature("Phoenix", 92));
        creatures.add(new Creature("Centaur", 85));

        // Bubble Sort (Descending Order)
        System.out.println("*** Bubble Sort: Descending Order by Power Level ***");
        bubbleSortDescending(creatures);
        displayCreatures(creatures);

        // Selection Sort (Ascending Order)
        System.out.println("\n*** Selection Sort: Ascending Order by Power Level ***");
        selectionSortAscending(creatures);
        displayCreatures(creatures);

        // Stack Implementation (using a List as a stack)
        System.out.println("\n*** Stack Implementation: Popping Creatures ***");
        stackImplementation(creatures);
    }

    // Bubble Sort (Descending Order)
    public static void bubbleSortDescending(List<Creature> creatures) {
        for (int i = 0; i < creatures.size() - 1; i++) {
            for (int j = 0; j < creatures.size() - i - 1; j++) {
                if (creatures.get(j).powerLevel < creatures.get(j + 1).powerLevel) {
                    // Swap elements
                    Creature temp = creatures.get(j);
                    creatures.set(j, creatures.get(j + 1));
                    creatures.set(j + 1, temp);
                }
            }
        }
    }

    // Selection Sort (Ascending Order)
    public static void selectionSortAscending(List<Creature> creatures) {
        for (int i = 0; i < creatures.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < creatures.size(); j++) {
                if (creatures.get(j).powerLevel < creatures.get(minIndex).powerLevel) {
                    minIndex = j;
                }
            }
            // Swap elements
            Creature temp = creatures.get(minIndex);
            creatures.set(minIndex, creatures.get(i));
            creatures.set(i, temp);
        }
    }

    // Stack Implementation (using a List as a stack)
    public static void stackImplementation(List<Creature> creatures) {
        List<Creature> stack = new ArrayList<>();
        for (Creature creature : creatures) {
            stack.add(creature);
        }

        // Reverse the list to simulate popping from the stack
        Collections.reverse(stack);

        for (Creature creature : stack) {
            System.out.println("Popped: " + creature.name + " - " + creature.powerLevel);
        }
    }

    // Helper method to display creatures
    public static void displayCreatures(List<Creature> creatures) {
        for (Creature creature : creatures) {
            System.out.println(creature.name + " - " + creature.powerLevel);
        }
    }
}