package Shoppee;

public class Cart {
    int id;
    int totalPrice;

    public Cart(int id, int totalPrice){
        this.id = id;
        this.totalPrice = totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return this.id;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public static class Users {
        int id;
        String username;
        String password;
        String phone;
        public static Address address;

        public Users(int id, String username, String password, String phone){
            this.id = id;
            this.username = username;
            this.password = password;
            this.phone = phone;
            this.address = new Address();
        }

        public int getId() {
            return this.id;
        }

        public String getPassword() {
            return this.password;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getUsername() {
            return this.username;
        }

        public static Address getAddress() {
            return Users.address;
        }

        public static void setAddress(Address address) {
            Users.address = address;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
