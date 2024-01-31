/**
 * This is Component interface for future creating of Leaf and Composite classes
 *
 * @param x first parameter of Position function
 * @param y second parameter of Position function
 * @param size  parameter of Size function
 */
 interface Component {
    public void Position(int x, int y);
    public void Size(int size);
}
