package pathfinder;

import pathfinder.filters.ExtensionFilter;
import pathfinder.filters.SizeFilter;

public class FileFinderBuilder {
    private final FileFinder finder = new FileFinder();

    public FileFinderBuilder() {

    }

    // Example of specialized filters construction
    public FileFinderBuilder withMaxSize(long maxSize) {
        return withFilter(new SizeFilter(maxSize));
    }

    public FileFinderBuilder withExtension(String extension) {
        return withFilter(new ExtensionFilter(extension));
    }

    // Generic filters accepted, including the composite AND and OR
    public FileFinderBuilder withFilter(Filter filter) {
        this.finder.addFilter(filter);
        return this;
    }

    public FileFinder build(){
        return this.finder;
    }

}
