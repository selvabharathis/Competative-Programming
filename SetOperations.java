import java.util.*;

public class SetOperations {
    public static void main(String args[]) {
/*
* Feature of Set
* It holds unique value
* Iteration order is not guarantee
* */
        int[] duplicateElements = new int[]{10,14,13,11,12,30,24,30,25};
        List<Integer> streamUniqueVal = Arrays.stream(duplicateElements)
                                        .boxed()
                                        .distinct()
                                        .sorted(Comparator.reverseOrder())
                                        .toList();
        Set<Integer> uniqueValue = new HashSet<>();
        for(int val : duplicateElements) {
            uniqueValue.add(val);
        }

        List<Integer> uniqueInteger = uniqueValue.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(uniqueInteger + " unique integer");
        System.out.println(uniqueInteger.get(1));

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        set.remove("banana");

        boolean exists = set.contains("apple");

        for (String item : set) {
            System.out.println(item);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int size = set.size();

        boolean isEmpty = set.isEmpty();

        set.clear();

        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("cherry");

// Union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

// Intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

// Difference
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // Instantiate an object of HashSet
        HashSet<ArrayList> set3 = new HashSet<>();

        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();

        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set3.add(list1);
        set3.add(list2);

        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set3.size());


        /*
        *  Linked Hash Set
        *  Maintain the order of insertion
        * */

        // Creating an empty LinkedHashSet of string type
        LinkedHashSet<String> linkedset
                = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        // using add() method
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // Note: This will not add new element
        // as A already exists
        linkedset.add("A");
        linkedset.add("E");

        // Getting size of LinkedHashSet
        // using size() method
        System.out.println("Size of LinkedHashSet = "
                + linkedset.size());

        System.out.println("Original LinkedHashSet:"
                + linkedset);

        // Removing existing entry from above Set
        // using remove() method
        System.out.println("Removing D from LinkedHashSet: "
                + linkedset.remove("D"));

        // Removing existing entry from above Set
        // that does not exist in Set
        System.out.println(
                "Trying to Remove Z which is not "
                        + "present: " + linkedset.remove("Z"));

        // Checking for element whether it is present inside
        // Set or not using contains() method
        System.out.println("Checking if A is present="
                + linkedset.contains("A"));

        // Noew lastly printing the updated LinkedHashMap
        System.out.println("Updated LinkedHashSet: "
                + linkedset);
    }
}

