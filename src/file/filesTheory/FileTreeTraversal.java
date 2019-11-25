package file.filesTheory;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Here's is one way to traverse all subdirectories and collect all files to a list.
 *
 * The method listFiles returns the nested files and directories of a directory as an array.
 */

public class FileTreeTraversal {
    public static void main(String[] args) {
        File file = new File("./myFiles/test.txt");

        getAllFiles(file);
    }

    private static List<File> getAllFiles(File rootDir) {
          File[] children = rootDir.listFiles();
          System.out.println(Arrays.toString(children));
          if (children == null || children.length == 0) {
              return Collections.emptyList();
          }

          List<File> files = new ArrayList<>();
          for (File child : children) {
              if (child.isDirectory()) {
                  files.addAll(getAllFiles(child));
              } else {
                  files.add(child);
              }
        }
          return files;
      }
}
