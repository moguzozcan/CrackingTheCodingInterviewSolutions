package ConceptsAndAlgorithms.Chapter8RecursionAndDynamicProgramming;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
The robot can only move in two directions, right and down, but certain cells are "off limits" such that
the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
the bottom right.
 */
public class RobotInAGrid {

    public List<Point> getPath(boolean[][] maze) {
        if(maze == null || maze.length == 0) {
            return null;
        }

        List<Point> path = new ArrayList<>();
        if(getPath(maze, maze.length - 1, maze[0].length - 1, path)) {
            return path;
        }
        return null;
    }

    //Recursive solution O(2^(r+c))
    private boolean getPath(boolean[][] maze, int r, int c, List<Point> path) {

        if(r < 0 || c < 0 || !maze[r][c]) {
            return false;
        }

        boolean isAtOrigin = (r == 0) && (c == 0);

        if(isAtOrigin || getPath(maze, r, c - 1, path) || getPath(maze, r - 1, c, path)) {
            Point p = new Point(r, c);
            path.add(p);
            return true;
        }
        return false;
    }

    //Dynamic Programming Solution
    public List<Point> getPathDP(boolean[][] maze) {
        if(maze == null || maze.length == 0) {
            return null;
        }

        List<Point> path = new ArrayList<>();
        HashSet<Point> failedPoints = new HashSet<>();

        if(getPathDP(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
            return path;
        }
        return null;
    }

    private boolean getPathDP(boolean[][] maze, int r, int c, List<Point> path, HashSet<Point> failedPoints) {
        if(c < 0 || r < 0 || !maze[r][c]) {
            return false;
        }

        Point p = new Point(r, c);

        if(failedPoints.contains(p)) {
            return false;
        }

        boolean isAtOrigin = (r == 0) && (c == 0);

        if(isAtOrigin || getPathDP(maze, r - 1, c, path, failedPoints) || getPathDP(maze, r, c - 1, path, failedPoints)) {
            path.add(p);
            return true;
        }

        failedPoints.add(p);
        return false;
    }
}
