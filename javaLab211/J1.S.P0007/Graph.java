public class Graph {
    private boolean adjacenyMatrix[][];
    private int vertexCount;

    public Graph(int vertexCount) {
        this.adjacenyMatrix = new boolean[vertexCount + 1][vertexCount + 1];
        this.vertexCount = vertexCount;
    }

    public void addEdge(int start, int end) {
        if ((start > 0 && start <= vertexCount) && (end > 0 && end <= vertexCount)) {
            System.out.println("check");
            if (adjacenyMatrix[start][end]) {
                System.out.println("This edge has been added");
            } else {
                adjacenyMatrix[start][end] = true;
                adjacenyMatrix[end][start] = true;
            }

        } else {
            System.out.println("Invalid edge");
        }
    }

    public void removeEdge(int start, int end) {
        if ((start > 0 && start <= vertexCount) && (end > 0 && end <= vertexCount)) {
            if (!adjacenyMatrix[start][end]) {
                System.out.println("This edge does not exsit");
            } else {
                adjacenyMatrix[start][end] = false;
                adjacenyMatrix[end][start] = false;
            }
        } else {
            System.out.println("Invalid edge");
        }
    }

    public boolean isEdge(int start, int end) {
        if ((start > 0 && start <= vertexCount) && (end > 0 && end <= vertexCount)) {
            if (!adjacenyMatrix[start][end]) {
                return false;
            } else {
                return true;
            }

        }
        return false;

    }
}