package pathfinder;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileFinder {
    private final List<Filter> filters;

    public FileFinder() {
        this.filters = new ArrayList<>();
    }

    public FileFinder(List<Filter> filters) {
        this.filters = new ArrayList<>(filters);
    }

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public List<File> search(String path) {
        List<File> files = Collections.emptyList(); // TODO actual file system logic

        List<File> result = new ArrayList<>();

        for (File file : files) {
            for (Filter filter : this.filters) {
                if (filter.match(file)) {
                    result.add(file);
                }
            }
        }

        return result;
    }


}
