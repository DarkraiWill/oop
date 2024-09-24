import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public void main(String[] args) {
//        Game game = new Game();
//        game.printBoard();
//
//        while (true) {
//            System.out.println("Ход игрока " + game.currentPlayer );
//            System.out.print("Введи позицию (0-8): ");
//            int position = Integer.parseInt(System.console().readLine());
//            game.play(position);
//            game.printBoard();
//
//            if (game.isWinner()) {
//                System.out.println("Игрок " + game.currentPlayer + " победил");
//                break;
//            } else if (game.isBoardFull()) {
//                System.out.println("Ничья");
//                break;
//            }
//        }
    }
//    //Задача1
//    class Person{
//        String name;
//        int age;
//        String gender;
//        public Person(int age, String name, String gender){
//            this.age = age;
//            this.name = name;
//            this.gender = gender;
//        }
//        void ShowInfo(){
//            System.out.println(age + " " + gender+ " "+ name);
//        }
//        void RaiseAge(int a){
//            age += a;
//        }
//        void ChangeName(String name){
//            this.name = name;
//        }
//    }
//    //Задача 2
//    class Worker extends Person{
//        int salary;
//        public Worker(String name, int age, String gender){
//            super(age,name, gender);
//        }
//    }
//    class Manager extends Worker{
//        private Worker[] subordinates;
//        public Manager(String name, int age, String gender){
//            super(name, age, gender);
//        }
//    }
//    //Задача 3
//    interface Animal{
//        void MakeSound();
//    }
//    class Dog implements Animal{
//        public void MakeSound() {
//            System.out.println("Gaf");
//        }
//    }
//    class Cat implements Animal{
//        public void MakeSound() {
//            System.out.println("Myaw");
//        }
//    }
//    class Cow implements Animal{
//        public void MakeSound() {
//            System.out.println("Mu");
//        }
//    }
//    //Задача 4
//    abstract class Transport{
//        abstract void Move();
//    }
//    class Car extends Transport{
//        public void Move() {
//
//        }
//    }
//    class Bike extends Transport{
//        public void Move() {
//
//        }
//    }
//    //Задача 5
//    class Book{
//        private String title;
//        private String author;
//        private int year;
//
//    }
//    class Library {
//        Book[] books;
//
//        void AddBook(Book book) {
//            books[books.length] = book;
//        }
//
//        void SearchAuthorAndYear(String author, int year) {
//            for (Book book : books) {
//                if (book.author == author && book.year == year) {
//                    System.out.println(book.title);
//                    ;
//                }
//            }
//        }
//    }
//        //Задача 6
//    class  BankAccount{
//        private int accountNumber;
//        private int balance;
//        public BankAccount(int accountNumber, int balance) {
//            this.accountNumber = accountNumber;
//            this.balance = balance;
//        }
//        public void Deposit(int skoka){
//            balance += skoka;
//        }
//        public void Withdraw(int skoka){
//            balance-= skoka;
//        }
//    }
//        //Задача 7
//    class Counter{
//        static int count = 0;
//        public Counter(){
//            count++;
//        }
//        public static int getCount() {
//            return count;
//        }
//    }
//        //Задача 8
//    abstract class Shape{
//        abstract void getArea();
//    }
//    class  Circle extends Shape{
//        private double radius;
//        public Circle(double radius){
//            this.radius = radius;
//        }
//        void getArea() {
//            double S = Math.PI*radius*radius;
//        }
//    }
//    class  Rectangle extends Shape{
//        double a;
//        double b;
//        public Rectangle(double a, double b){
//            this.a = a;
//            this.b = b;
//        }
//        void getArea() {
//            double S = a*b;
//        }
//    }
//        //Задача 9
//class Animall{
//    void move() {
//    }
//}
//
//class Fish extends Animall {
//    @Override
//    void move() {
//        System.out.println("рыба плавает");
//    }
//}
//
//class Bird extends Animall {
//    @Override
//    void move() {
//        System.out.println("птица летает");
//    }
//}
//
//class Dog1 extends Animall {
//    @Override
//    void move() {
//        System.out.println("собака бегает");
//    }
//}
//        //Задача 10
//class Student{
//    String name;
//    String group;
//    double grade;
//    public Student(String name,String group,double grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//}
//class University{
//    ArrayList<Student> students;
//    void AddStudents(String name,String group,double grade){
//        students.add(new Student(name,group,grade));
//    }
//    void SearchName(String name){
//        Collections.sort(students, Comparator.comparing(student -> student.name));
//        for (Student stud : students){
//            System.out.println(stud);
//        }
//    }
//    void GradeFilter(){
//
//    }
//}
//        //Задача 11
//class Product {
//    String name;
//    int price;
//    int quantity;
//    public Product(String name, int price, int quantity) {
//        this.name = name;
//        this.quantity = quantity;
//        this.price = price;
//    }
//}
//
//class Store {
//    ArrayList<Product> products = new ArrayList<Product>();
//
//    public void addProduct(String name, int price, int quantity){
//        products.add(new Product(name, price, quantity));
//    }
//
//    public void delProduct(String name) {
//        products.removeIf(product -> product.name.equals(name));
//    }
//    public void searchProductName(String name){
//        for (Product product : products) {
//            if (product.name.equals(name)) {
//                System.out.println(product.name + " " + product.price + " " + product.quantity);
//            }
//        }
//    }
//}
//        //Задача 12
//interface PaymentSystem{
//    public void pay(int a);
//    public void refund(int a);
//}
//class CrediCard implements PaymentSystem{
//    @Override
//    public void pay(int a) {
//    }
//
//    @Override
//    public void refund(int a) {
//    }
//}
//class PayPal implements PaymentSystem{
//
//    @Override
//    public void pay(int a) {
//    }
//
//    @Override
//    public void refund(int a) {
//    }
//}
//        //Задача 13
//class UniqueID{
//    static int ID= 0;
//    private int id;
//    public UniqueID(){
//        id = createID();
//    }
//    public static int createID(){
//
//        return ID++;
//    }
//}
//    //Задача 14
//class Point{
//       int x;
//       int y;
//
//}
//class Rectanglee{
//    private Point upLeft;
//    private Point downRight;
//    public Rectanglee(Point upLeft, Point downRight){
//        this.upLeft = upLeft;
//        this.downRight = downRight;
//    }
//
//    public double getArea(){
//        return (downRight.x - upLeft.x * (downRight.y - upLeft.y));
//    }
//}
//        //Задача 15
//class ComplexNumber{
//    private double valid;  // Действительная часть
//    private double i;  // Мнимая часть
//
//    public ComplexNumber(double valid, double i) {
//        this.valid = valid;
//        this.i = i;
//    }
//
//    public ComplexNumber sum(ComplexNumber other) {
//        double newV = this.valid + other.valid;
//        double newI = this.i + other.i;
//        return new ComplexNumber(newV, newI);
//    }
//
//    public ComplexNumber sub(ComplexNumber other) {
//        double newV = this.valid - other.valid;
//        double newI = this.i - other.i;
//        return new ComplexNumber(newV, newI);
//    }
//
//    public ComplexNumber mult(ComplexNumber other) {
//        double newV = (this.valid * other.valid) - (this.i * other.i);
//        double newI = (this.valid * other.i) + (this.i * other.valid);
//        return new ComplexNumber(newV, newI);
//    }
//
//    public ComplexNumber div(ComplexNumber other) {
//        double newV = (this.valid * other.valid + this.i * other.i) / (other.valid * other.valid + other.i * other.i);
//        double newI = (this.i * other.valid - this.valid * other.i) / (other.valid * other.valid + other.i * other.i);
//        return new ComplexNumber(newV, newI);
//    }
// }
//    //Задача 16
//    class Matrix{
//        int[][] DvMat;
//        int col;
//        int row;
//        public Matrix(int row, int col) {
//            this.row = row;
//            this.col = col;
//            this.DvMat = new int[row][col];
//        }
//        public Matrix sum(Matrix other) {
//            Matrix result = new Matrix(row, col);
//            for (int i = 0; i < row; i++) {
//                for (int j = 0; j < col; j++) {
//                    result.DvMat[i][j] = DvMat[i][j] + other.DvMat[i][j];
//                }
//            }
//            return result;
//        }
//
//        public Matrix mult(Matrix other) {
//            Matrix result = new Matrix(row, other.col);
//            for (int i = 0; i < row; i++) {
//                for (int j = 0; j < other.col; j++) {
//                    for (int k = 0; k < col; k++) {
//                        result.DvMat[i][j] += DvMat[i][k] * other.DvMat[k][j];
//                    }
//                }
//            }
//            return result;
//        }
//    }
//        //Задача 17
//class Weapon{
//    String title;
//    int power;
//
//    public Weapon(String title, int power){
//        this.title = title;
//        this.power = power;
//    }
//}
//class Player{
//    private Weapon weapon;
//    private int hp;
//    public Player(Weapon weapon, int hp){
//        this.weapon = weapon;
//        this.hp = hp;
//    }
//    void AttackEnemy(Enemy enemy){
//        enemy.hp -= weapon.power;
//    }
//}
//class Enemy{
//    private Weapon weapon;
//    private int hp;
//    public Enemy(Weapon weapon, int hp){
//        this.weapon = weapon;
//        this.hp = hp;
//    }
//    void AttackPlayer(Player player){
//        player.hp -= weapon.power;
//    }
//}
//
//    //Задача 18
//class Order{
//        Customer customer;
//        Product1 products;
//        int sum;
//        int cost;
//        static ArrayList<Order> orders = new ArrayList<>();
//        public Order(Customer customer, Product1 product, int sum, int cost) {
//            this.customer = customer;
//            this.products = products;
//            this.sum = sum;
//            this.cost = cost;
//            orders.add(this);
//        }
//        public static void printOrderHistory() {
//            for(Order o : orders){
//                System.out.println(o.sum + " " + o.cost + " " + o.products.getName() + " " + o.customer.getFio());
//            }
//        }
//    }
//class Customer{
//    @Getter
//    String fio;
//    int age;
//    public Customer(String fio, int age){
//        this.fio = fio;
//        this.age = age;
//    }
//}
//class Product1{
//    @Getter
//    String name;
//    int cost;
//    public Product1(String name, int cost) {
//        this.name = name;
//        this.cost = cost;
//    }
//}
        //Задача 19
//class Device{
//        String brand;
//        void turnOn(){
//
//        }
//        void turnOff(){
//
//        }
//}
//class SmartPhone extends  Device{
//    @Override
//    void turnOff() {
//        super.turnOff();
//    }
//
//    @Override
//    void turnOn() {
//        super.turnOn();
//    }
//    void takePhoto(){
//
//    }
//}
//class Laptop extends  Device{
//    @Override
//    void turnOff() {
//        super.turnOff();
//    }
//
//    @Override
//    void turnOn() {
//        super.turnOn();
//    }
//    void takePhoto(){
//
//    }
//}
//        //Задача 20
//class  Game{
//    private char[] board;
//    private char currentPlayer;
//
//    public Game() {
//        board = new char[9];
//        for (int i = 0; i < 9; i++) {
//            board[i] = ' ';
//        }
//        currentPlayer = 'X';
//    }
//
//    public void play(int position) {
//        if (board[position] == ' ') {
//            board[position] = currentPlayer;
//            if (currentPlayer == 'X') {
//                currentPlayer = 'O';
//            } else {
//                currentPlayer = 'X';
//            }
//        } else {
//            System.out.println("Это место уже занято. Попробуй ещё раз.");
//        }
//    }
//
//    public boolean isWinner() {
//        // Проверяем строки
//        if ((board[0] == board[1] && board[1] == board[2] && board[0] != ' ') ||
//                (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') ||
//                (board[6] == board[7] && board[7] == board[8] && board[6] != ' ')) {
//            return true;
//        }
//        // Проверяем столбцы
//        if ((board[0] == board[3] && board[3] == board[6] && board[0] != ' ') ||
//                (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') ||
//                (board[2] == board[5] && board[5] == board[8] && board[2] != ' ')) {
//            return true;
//        }
//        // Проверяем диагонали
//        if ((board[0] == board[4] && board[4] == board[8] && board[0] != ' ') ||
//                (board[2] == board[4] && board[4] == board[6] && board[2] != ' ')) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isBoardFull() {
//        for (int i = 0; i < 9; i++) {
//            if (board[i] == ' ') {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void printBoard() {
//        System.out.println("-------------");
//        for (int i = 0; i < 9; i += 3) {
//            System.out.println("| " + board[i] + " | " + board[i + 1] + " | " + board[i + 2] + " |");
//            System.out.println("-------------");
//        }
//    }
//}
}