package org.sawaklaudia.graphs.dfs;

import java.util.HashSet;
import java.util.Set;

public class ContactsList {

    public static void main(String[] args) {
        int[][] contacts = getContacts();
        int numOfStudents = 9;
        int[][] matrix = createMatrix(contacts, numOfStudents);
        displayMatrix(matrix);
        System.out.println(canReachInMatrix(matrix, 3, 1));
    }

    public static int[][] getContacts() {
        return new int[][]{
                {1, 2}, {2, 4}, {2, 5}, {2, 7}, {3, 8}, {4, 8}, {5, 8}, {6, 9}
        };
    }

    public static int[][] createMatrix(int[][] contacts, int numOfStudents) {
        int[][] matrix = new int[numOfStudents + 1][numOfStudents + 1];

        for (int k = 0; k < contacts.length; k++) {
            int row = contacts[k][0];
            int column = contacts[k][1];
            matrix[row][column] = 1;
            matrix[column][row] = 1;
        }
        return matrix;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static boolean canReachInMatrix(int[][] matrix, int student, int toReach) {
        Set<Integer> visited = new HashSet<>();
        return dfsInMatrix(matrix, visited, student, toReach);
    }

    public static boolean dfsInMatrix(int[][] matrix, Set<Integer> visited, int student, int toReach) {
        visited.add(student);

        for (int column = 0; column < matrix[0].length; column++) {
            if (matrix[student][column] == 1 && column == toReach) {
                return true;
            } else if (matrix[student][column] == 1 && !visited.contains(column)) {
                return dfsInMatrix(matrix, visited, column, toReach);
            }
        }
        return false;
    }
}
