package org.example.Core.MVP;
import org.example.Core.Models.Contact;
public class Presenter {
    
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setName(contact.name);
            view.setPhone(contact.phone);
            view.setSalary(contact.salary);
            view.setCompanyName(contact.company);
            view.setEmail(contact.email);
        }
    }

    public void add() {
        model.currentBook().add(
                new Contact(view.getName(), view.getPhone(), view.getSalary(), view.getCompanyName(), view.getEmail()));
    }


    public void remove() {
        model.currentBook().remove(model.currentBook.getCotact(model.getCurrentIndex()));
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();

                view.setName(contact.name);
                view.setPhone(contact.phone);
                view.setSalary(contact.salary);
                view.setCompanyName(contact.company);
                view.setEmail(contact.email);
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setName(contact.name);
                view.setPhone(contact.phone);
                view.setSalary(contact.salary);
                view.setCompanyName(contact.company);
                view.setEmail(contact.email);
            }
        }
    }

}
