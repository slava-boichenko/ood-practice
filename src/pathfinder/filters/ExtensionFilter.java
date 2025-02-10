package pathfinder.filters;

import pathfinder.Filter;

import java.io.File;

public class ExtensionFilter implements Filter {
    private final String ext;

    public ExtensionFilter(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean match(File file) {
        return file.isFile() && file.getPath().endsWith(ext);
    }
}
