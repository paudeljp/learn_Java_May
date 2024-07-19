public class primitiveAndObjectType {
    public static void main(String[] args) {
        int numbers[] = {2,5,8,6,4,9};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

        String cities[] = {"kathmandu","Pokhara","Butwal", "Jhapa"};
        System.out.println(cities[0]);
        System.out.println(cities[cities.length-1]);

        numbers[2] = 10;
        cities[2] = "Chitwan";

        System.out.println(numbers[2]);
        System.out.println(cities[2]);
    }
}
