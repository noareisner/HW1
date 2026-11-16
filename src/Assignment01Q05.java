public class Assignment01Q05 {
    public static boolean hasTrue(boolean[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i]) {
                return true ;
            }
        }
        return false ;
    }
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0 ;
        }

        boolean visited[] = new boolean[m.length] ;
        boolean current[] = new boolean[m.length] ;
        int counter = 0 ;
        visited[i] = true ;
        current[i] = true ;
        while (hasTrue(current)) {
            if (current[j]) {
                return counter ;
            }
            boolean next[] = new boolean[m.length] ;
            for (int k = 0 ; k < m.length ; k++) {
                if (current[k]) {
                    for (int l = 0 ; l < m.length ; l++) {
                        if (m[k][l] == 1 && !visited[l]) {
                            next[l] = true ;
                            visited[l] = true ;
                        }
                    }
                }
            }
            current = next ;
            counter++ ;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}