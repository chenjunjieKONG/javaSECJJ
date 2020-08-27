package homework.day10.test3;

import java.util.ArrayList;

public class Reception {
    Filter filter;

    public Reception() {
    }

    public Reception(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void typeUser(ArrayList<User> users, int start, int end) {
        for (User u : users) {
            if (u.getId() >= start && u.getId() <= end) {
                filter.filterUser(u);
            }
        }
    }

    public void typeUser(ArrayList<User> users) {
        for (User u : users) {
            if (u.getType() == null) {
                filter.filterUser(u);
            }
        }
    }
}
