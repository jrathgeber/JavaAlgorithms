package Copying;

/*

Not a Deep Copy

After cloning, when you modify the original object, it is modifying the clone as well. – Sibish Aug 30 '17 at 23:58
I also have the same problem, when I change the properties of the original object then the values are changed in the cloned object. – jmoran Oct 6 '17 at 19:18
This is wrong in that it is not a deep copy which was asked for. – Bluehorn Nov 6 '17 at 12:10
This method clone the pointer which points for the cloneable object, but all the properties inside both objects are the same, So there is a new object created in the memory, but the data inside each object is the same data from memory – Omar HossamEldin Feb 14 at 12:49
To Bhasker Tiwari's defense however, the example given concerns a String reference only, which is perfectly safe (and infact preferred) to share among copies. Admittedly it should have been made clear that this is a special case and that further action needs to be taken when deep cloning objects with references to mutable objects. – aioobe May 1 at 12:51

*/


public class CloneableExample implements Cloneable{

    private String str;
    public CloneableExample(){
    }
    public void setStr(String str){
        this.str = str;
    }
    public void display(){
        System.out.println("The String is "+str);
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main (String ...args) {

        try {

            CloneableExample del = new CloneableExample();
            CloneableExample delTemp = (CloneableExample) del.clone(); // this line will return you an independent
            // object, the changes made to this object will
            // not be reflected to other object

        } catch (CloneNotSupportedException cnse) {

            System.out.println("Error during cloning");

        }


    }

}