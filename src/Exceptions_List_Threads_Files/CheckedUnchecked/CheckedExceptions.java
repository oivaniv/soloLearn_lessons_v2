package Exceptions_List_Threads_Files.CheckedUnchecked;

import javax.swing.plaf.TableHeaderUI;

public class CheckedExceptions {
    //The first way to handle the exception via throws InterruptedException
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
    }

        public void goodSleep(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
