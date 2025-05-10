class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public void printContactDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
    }
}

public class mnumber8 {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Satyam", "9866397847", null);
        Contact contact2 = new Contact("Sandesh", "984521537", "sandesh123@gmail.com");
        Contact contact3 = new Contact("Sanjay", "9866397847", "");

        if (contact1.getEmailAddress() != null && !contact1.getEmailAddress().isEmpty()) {    // help of ai 
            System.out.println("Email address is not null or empty for " + contact1.getName());
        } else {
            contact1.printContactDetails();
        }

        if (contact2.getEmailAddress() != null && !contact2.getEmailAddress().isEmpty()) {
            System.out.println("Email address is not null or empty for " + contact2.getName());
        } else {
            contact2.printContactDetails();
        }

        if (contact3.getEmailAddress() != null && !contact3.getEmailAddress().isEmpty()) {
            System.out.println("Email address is not null or empty for " + contact3.getName());
        } else {
            contact3.printContactDetails();
        }
    }
}
// my code is not working properly
// class Contact {
//     private String name;
//     private String phoneNumber;
//     private String emailAddress;

//     public Contact(String name, String phoneNumber, String emailAddress) {
//         this.name = name;
//         this.phoneNumber = phoneNumber;
//         this.emailAddress = emailAddress;
//     }

//     public void printContactDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Phone Number: " + phoneNumber);
//         System.out.println("Email Address: " + emailAddress);
         
//     }
// }

// public class mnumber8 {
//     public static void main(String[] args) {
//         Contact contact1 = new Contact("satyam", "9866397847",null);
//         Contact contact2 = new Contact("sandesh", "984521537", "sandesh123@gmail.com");
//         Contact contact3 = new Contact("sanjay", "9866397847", "");

//         if (contact1.emailAddress != null) {
//       System.out.println("their email address is not null of " + contact1.name);
//         } 
//         else {
//             contact1.printContactDetails();
//         }
//         if (contact2.emailAddress != null) {
//             System.out.println("their email address is not null of " + contact2.name);
//         } 
//         else {
//             contact2.printContactDetails();
//         }
//         if (contact3.emailAddress != null) {
//             System.out.println("their email address is not null of " + contact3.name);
//         } 
//         else {
//             contact3.printContactDetails();
//         }
          
            
    
//     }}