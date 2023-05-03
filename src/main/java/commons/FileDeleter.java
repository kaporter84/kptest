package commons;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileDeleter {

    public static void deleteFilesInFolders(String directoryPath, List<String> extensionList, List<String> patternList, List<String> folderExclusionList) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println(directoryPath + " is not a valid directory");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Error listing files in directory " + directoryPath);
            return;
        }

        Arrays.stream(files).forEach(file -> {
                if (file.isDirectory() && (folderExclusionList == null || !folderExclusionList.contains(file.getName())))
                {
                    deleteFilesInFolders(file.getAbsolutePath(), extensionList, patternList, folderExclusionList); // recursion
                }
                else if (file.isFile() && extensionList.contains(file.getName().substring(file.getName().lastIndexOf(".") + 1)))
                {
                    if(patternList == null || patternList.stream().anyMatch(pattern -> file.getName().matches(pattern + "\\.[a-z]+")) || file.getName().equalsIgnoreCase(".DS_STORE"))
                    {
                        System.out.println(file.delete() ? file.getName() + " deleted successfully." : "Error deleting file " + file.getName());
                    }
                }
        });
    }

    public static void deleteFoldersInFolders(String directoryPath, List<String> searchList) {
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println(directoryPath + " is not a valid directory");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Error listing files in directory " + directoryPath);
            return;
        }

        Arrays.stream(files).forEach(file -> {
            if (file.isDirectory() && searchList.stream().anyMatch(search -> file.getName().equalsIgnoreCase(search)))
            {
                    boolean success = deleteFolder(file);

                    if (success)
                    {
                        System.out.println(file.getName() + " deleted successfully.");
                    }
                    else
                    {
                        System.out.println("Error deleting folder " + file.getName());
                    }
            }
        });
    }

    public static boolean deleteFolder(File folder) {
        if (!folder.exists()) {
            return true;
        }

        boolean success = true;
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    success &= deleteFolder(file);
                } else {
                    success &= file.delete();
                }
            }
        }

        success &= folder.delete();
        return success;
    }
}