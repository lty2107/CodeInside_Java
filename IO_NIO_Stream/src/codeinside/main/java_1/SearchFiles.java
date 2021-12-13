package codeinside.main.java_1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

public class SearchFiles {

    //It's used in dfs
    private Map<String, Boolean> map = new HashMap<String, Boolean>();

    private File root;

    public SearchFiles(File root) {
        this.root = root;
    }

    /**
     * List eligible files on current path
     *
     * @param directory The directory to be searched
     * @return Eligible files
     */
    private String[] getTargetFiles(File directory) {
        if (directory == null) {
            return null;
        }

        String[] files = directory.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                // TODO Auto-generated method stub
                return name.startsWith("Temp") && name.endsWith(".txt");
            }

        });

        return files;
    }

    private void recursive(File path){

        printFiles(getTargetFiles(path));
        for(File file: path.listFiles()){
            if(file.isDirectory()){
                recursive(file);
            }
        }
        if(path.isDirectory()){
            printFiles(getTargetFiles(path));
        }
    }

    /**
     * Print all eligible files
     */
    private void printFiles(String[] targets) {
        for (String target : targets) {
            System.out.println(target);
        }
    }
}
