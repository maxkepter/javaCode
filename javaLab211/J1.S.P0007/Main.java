import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < 1) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of vertices");
        int numVertices = checkInputInt();
        Graph graph = new Graph(numVertices);
        int start, end;
        while (true) {
            System.out.println("-------------------");
            System.out.println("Enter your choice");
            System.out.println("1.Add edge");
            System.out.println("2.Remove edge");
            System.out.println("3.Check edge");
            System.out.println("4.Exit");
            System.out.println("-------------------");
            int choice = checkInputInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter start point");
                    start = checkInputInt();
                    System.out.println("Enter end point");
                    end = checkInputInt();

                    graph.addEdge(start, end);
                    break;
                case 2:
                    System.out.println("Enter start point");
                    start = checkInputInt();
                    System.out.println("Enter end point");
                    end = checkInputInt();
                    graph.removeEdge(start, end);
                    break;
                case 3:
                    System.out.println("Enter start point");
                    start = checkInputInt();
                    System.out.println("Enter end point");
                    end = checkInputInt();
                    if (graph.isEdge(start, end)) {
                        System.out.println("This is an edge");
                    } else {
                        System.out.println("This is not an edge");
                    }
                    break;
                case 4:
                    return;

            }

        }
    }

}
