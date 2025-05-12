abstract public class Account {
        protected int id;
        protected String name;
        private DataSource myData;

        public void performOperation(DataSource _myData){
            myData = _myData;
            myData.execute();
        }
}



class Admin extends Account{
        // A private string specified only with the Admin
        private String AuthPassword;
        public Admin(int _id, String _name, String _password){
            id = _id;
            name = _name;
            AuthPassword = _password;
        }
    }


     interface DataSource {
        public void execute();
    }



     class Delete implements DataSource{
        @Override
        public void execute() {
            System.out.println("Data has been deleted.");
        }

    }



     class MainApplication {
        public static void main(String[] args) {
            Admin curAdmin = new Admin(1234, "Mtume", "mtume12345");
            User curUser = new User(4455, "John");
            curAdmin.performOperation(new Update()); // Admin Updates the data.
            curUser.performOperation(new View()); // User can view the data.

        }

    }


     class Update implements DataSource{
        @Override
        public void execute() {
            System.out.println("Data has been Updated Successfuly!");
        }

    }


     class User extends Account {
        public User(int _id, String _name){
            id = _id;
            name = _name;
        }
    }


     class View implements DataSource {
        @Override
        public void execute() {
            System.out.println("Some data to be displayed.");
        }
    }


