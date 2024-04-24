import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> newSet = new HashSet<>();
        for (String card : cards) {
            newSet.add(card);
        }
        return newSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        } else if (myCollection.containsAll(theirCollection)) {
            return false;
        } else if (theirCollection.removeAll(myCollection)) {
            return true;
        } else if (myCollection.removeAll(theirCollection) && theirCollection.removeAll(myCollection)) {
            return false;
        } else
            return true;

    }

    static Set<String> commonCards(List<Set<String>> collections) {

        Set<String> common = new HashSet<>();

        // agregamos todas las cartas.
        for (Set<String> collection : collections) {
            for (String card : collection) {
                common.add(card);
            }
        }

        for (Set<String> collection : collections) {
            common.retainAll(collection);
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();

        // agregamos todas las cartas.
        for (Set<String> collection : collections) {
            for (String card : collection) {
                common.add(card);
            }
        }
        return common;
    }
}
