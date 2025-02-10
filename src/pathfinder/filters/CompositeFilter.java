package pathfinder.filters;

import pathfinder.Filter;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeFilter implements Filter {
    protected List<Filter> filters = new ArrayList<>();

    public CompositeFilter(List<Filter> filters) {
        this.filters = filters;
    }
}
