package pathfinder;

import java.io.File;

public interface Filter {
    boolean match(File file);
}
