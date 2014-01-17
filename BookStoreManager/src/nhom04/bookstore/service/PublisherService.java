package nhom04.bookstore.service;

import nhom04.bookstore.bean.Publisher;
import nhom04.bookstore.dao.PublisherDAO;
import java.util.Vector;

public class PublisherService {

    public int addPublisher(Publisher pub) {
        PublisherDAO pDAO = new PublisherDAO();
        return pDAO.insert(pub);
    }

    public Vector<Publisher> getListPublisher() {
        PublisherDAO pDAO = new PublisherDAO();
        return pDAO.getAll();
    }

    public int editPublisher(Publisher pub) {
        PublisherDAO pDAO = new PublisherDAO();
        return pDAO.update(pub);
    }

    public int deletePublisher(Publisher pub) {
        PublisherDAO pDAO = new PublisherDAO();
        return pDAO.delete(pub);
    }
}
