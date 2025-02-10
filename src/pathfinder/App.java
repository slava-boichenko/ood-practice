package pathfinder;

import pathfinder.filters.AndFilter;
import pathfinder.filters.CompositeFilter;
import pathfinder.filters.ExtensionFilter;
import pathfinder.filters.SizeFilter;

import java.io.File;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FileFinder finder = new FileFinderBuilder().withMaxSize(10000).withExtension(".jpg").build();
        List<File> files = finder.search("my/path/");

        CompositeFilter compositeFilter = new AndFilter(List.of(new ExtensionFilter(".jpg'"), new SizeFilter(">",12345)));
        finder = new FileFinderBuilder().withFilter(compositeFilter).build();
        files = finder.search("my/path/");
    }
}