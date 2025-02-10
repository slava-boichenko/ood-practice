package pathfinder.filters;

import pathfinder.Filter;

import java.io.File;

public class SizeFilter implements Filter {
    private final long maxSize;
    private final String operator;

    public SizeFilter(String operator, long maxSize) {
        this.operator = operator;
        this.maxSize = maxSize;
    }

    @Override
    public boolean match(File file) {
        if (this.operator.equals("<")) {
            return file.length() < this.maxSize;
        }

        // for simplicity, the default is "greater"
        return file.length() > this.maxSize;
    }
}
