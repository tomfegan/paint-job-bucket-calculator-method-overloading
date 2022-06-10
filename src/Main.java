public class Main {
    public static void main(String[] args) {

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        // → should return -1 since the width parameter is invalid

        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        // → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5
        // and Bob has 2 extra buckets home.

        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        // → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5
        // and Bob has 1 extra bucket at home.

    }
}
