package NestedClasses;

/**
 * Author:
 * Created at:2022/6/15
 * Updated at:
 * 说明：此文件为求解Java官方教程中的例题https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/nested-questions.html,
 * 详细例题题目
 **/

public class DataStructure2 {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure2() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }


    }

    public EvenIterator generateEvenIterator() {
        return new EvenIterator();
    }

    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }

    public  void print(java.util.function.Function<Integer, Boolean> iterator){




    }
    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure2 ds = new DataStructure2();
        ds.printEven();


        System.out.print("Exercises2.a:");
//        ds.print(ds.generateEvenIterator());

        System.out.print("Exercises2.b:");
//2.自己这个解法有误
//        ds.print(new DataStructureIterator() {
//            private int nextIndex = 0;
//            private final static int SIZE = 15;
//            private int[] arrayOfInts = new int[SIZE];
//            @Override
//            public boolean hasNext() {
//                return (nextIndex <= SIZE - 1);
//            }
//
//            @Override
//            public Integer next() {
//                // Record a value of an even index of the array
//                Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
//
//                // Get the next even element
//                nextIndex += 2;
//                return retValue;
//            }
//        });
        System.out.print("Exercises2.b:");
        /*
         * 求解https://docs.oracle.com/javase/tutorial/java/javaOO/QandE/nested-questions.html的2.b
         *
         * Invoke the method print(DataStructureIterator iterator) so that it prints elements that have an odd index value.
         * Use an anonymous class as the method's argument instead of an instance of the interface DataStructureIterator.
         *
         * 2022.6.16--错误代码逻辑记录--dai排查错误原因
         *
         *
         * */
//        ds.print(new DataStructureIterator() {
//            private int nextIndex = 1;
//            private int[] arrayOfInts = new int[SIZE];
//            public boolean hasNext() {
//                return (nextIndex <= SIZE - 1);
//            }
//
//            public Integer next() {
//                // Record a value of an even index of the array
//                Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
//
//                // Get the next even element
//                nextIndex += 2;
//                return retValue;
//            }
//        });


        System.out.print("Exercises2.c:");
        /*
        * Define a method named print(java.util.function.Function<Integer, Boolean> iterator)
        * that performs the same function as print(DataStructureIterator iterator).
        * Invoke this method with a lambda expression to print elements that have an even index value.
        * Invoke this method again with a lambda expression to print elements that have an odd index value.
        *
        *
        * */












    }
}