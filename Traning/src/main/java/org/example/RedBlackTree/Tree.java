package org.example.RedBlackTree;

import java.util.Scanner;

class node {

    node leftChild;
    node rightChild;
    int data;

    // красный ==> true, черный ==> false
    boolean color;

    node(int data) {
        this.data = data;
        leftChild = null;
        rightChild = null;

// Новый узел, который создается, является всегда красного цвета.
        color = true;
    }
}

public class Tree {

    private static node root = null;

    // Функция для поворота узла против часовой стрелки.
    node rotateLeft(node myNode) {
        System.out.printf("поворот влево!!\n");
        node child = myNode.rightChild;
        node childLeft = child.leftChild;

        child.leftChild = myNode;
        myNode.rightChild = childLeft;

        return child;
    }

    // Функция для поворота узла по часовой стрелке.
    node rotateRight(node myNode) {
        System.out.printf("вращение вправо\n");
        node child = myNode.leftChild;
        node childRight = child.rightChild;

        child.rightChild = myNode;
        myNode.leftChild = childRight;

        return child;
    }

    // Функция для проверки того, является ли узел красного цвета или нет.
    boolean isRed(node myNode) {
        if (myNode == null) {
            return false;
        }
        return (myNode.color == true);
    }

    // Функция для изменения цвета двух узлы.
    void swapColors(node node1, node node2) {
        boolean temp = node1.color;
        node1.color = node2.color;
        node2.color = temp;
    }

    // вставка в левостороннее Красно-черное дерево.
    node insert(node myNode, int data) {
// Обычный код вставки для любого двоичного файла
        if (myNode == null) {
            return new node(data);
        }

        if (data < myNode.data) {
            myNode.leftChild = insert(myNode.leftChild, data);
        } else if (data > myNode.data) {
            myNode.rightChild = insert(myNode.rightChild, data);
        } else {
            return myNode;
        }

// случай 1.
        // когда правый дочерний элемент красный, а левый дочерний элемент черный или не существует.
        if (isRed(myNode.rightChild) && !isRed(myNode.leftChild)) {
// Повернуть узел  влево
            myNode = rotateLeft(myNode);

// Поменять местами цвета дочернего узла всегда должен быть красным
            swapColors(myNode, myNode.leftChild);
        }

// случай 2
        // когда левый ребенок, а также левый внук выделены красным цветом
        if (isRed(myNode.leftChild) && isRed(myNode.leftChild.leftChild)) {
// Повернуть узел в право
            myNode = rotateRight(myNode);
            swapColors(myNode, myNode.rightChild);
        }

// случай 3
        // когда и левый, и правый дочерние элементы окрашены в красный цвет.
        if (isRed(myNode.leftChild) && isRed(myNode.rightChild)) {
// Инвертировать цвет узла это левый и правый дети.
            myNode.color = !myNode.color;

// Изменить цвет на черный.
            myNode.leftChild.color = false;
            myNode.rightChild.color = false;
        }

        return myNode;
    }

    // Обход по порядку
    void inorder(node node) {
        if (node != null) {
            inorder(node.leftChild);
            char c = '●';
            if (node.color == false)
                c = '◯';
            System.out.print(node.data + "" + c + " ");
            inorder(node.rightChild);
        }
    }

    public static void main(String[] args) {

        Tree node = new Tree();
        Scanner scan = new Scanner(System.in);

        char ch;
        do {
            System.out.println("Введите целое число");

            int num = scan.nextInt();
            root = node.insert(root, num);

            node.inorder(root);
            System.out.println("\nВы хотите продолжить? (введите y или n)");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}