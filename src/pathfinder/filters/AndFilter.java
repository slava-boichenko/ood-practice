package pathfinder.filters;

import pathfinder.Filter;

import java.io.File;
import java.util.List;

public class AndFilter extends CompositeFilter {
    public AndFilter(List<Filter> filters) {
        super(filters);
    }

    @Override
    public boolean match(File file) {
        return this.filters.stream().allMatch(filter -> filter.match(file));
    }
}
