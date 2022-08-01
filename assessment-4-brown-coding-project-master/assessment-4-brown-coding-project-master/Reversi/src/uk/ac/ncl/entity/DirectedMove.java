/**
 * @author Kostiantyn Potomkin
 * @version 0.9
 * @since 05-03-2020
 */
package uk.ac.ncl.entity;

public class DirectedMove {

    private Cell cell;

    private int[] direction;

    /**
     *
     * @param cell - the current cell a move is made onto.
     * @param direction - direction of where move is going.
     */

    public DirectedMove(Cell cell, int[] direction) {
        this.cell = cell;
        this.direction = direction;
    }

    public Cell getCell() {
        return cell;
    }

    public int[] getDirection() {
        return direction;
    }
}
