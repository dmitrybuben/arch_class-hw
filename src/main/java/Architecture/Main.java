package org.example;

// программный комплект управления заказами

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Store store = new Store();
        //TODO ..
    }
}

class Store {
    private Collection<Order> orders = new HashSet<>();

    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id){
        //TODO: Отмена заказа
        return true;
    }

    public boolean paymentOrder(int id){
        //TODO: Оплата заказа
        return true;
    }
}

class Buyer{

/*
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            this.age =1;
        }
        else
            this.age = age;
    }
*/
    public static int counter;
    private int id;
    private String gender;
    private String name;
    private String lastName;
    private String patronymic;
    private Date birthday;

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    {
        id = ++counter;
    }
}

class Product{
    private static int counter = 0;
    private int id;
    private String name;
    private double price;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    {
        id = ++counter;
    }
}

class OrderItem {
    private static int counter = 0;
    private int id;
    private Product product;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    {
        id = ++counter;
    }

}

class Order{
    private static int counter = 0;
    private int id;
    private Date orderDate;
    private String address;
    private String phone;
    private Buyer buyer;
    private Collection<OrderItem> items = new HashSet<>(); // HashSet не хранит 2 одинаковых элемента

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getId() {
        return id;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }

    public void setItems(Collection<OrderItem> items) {
        this.items = items;
    }
}