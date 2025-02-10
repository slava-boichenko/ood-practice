package pathfinder.filters;

import pathfinder.Filter;

import java.io.File;
import java.util.List;

public class OrFilter extends CompositeFilter {
    public OrFilter(List<Filter> filters) {
        super(filters);
    }

    @Override
    public boolean match(File file) {
        return this.filters.stream().anyMatch(filter -> filter.match(file));
    }
}
