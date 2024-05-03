import java.io.File;

class FilesFoldersExample {
    int fileCounter;
    int folderCounter;

    public static void main(String arg[]) {
        System.out.println("Hi....");
        FilesFoldersExample ffe = new FilesFoldersExample();
        ffe.setNumberOfFilesAndFolders("//home/swapnilphulpagar/Downloads"); // Change this to the directory path
    }

    public void setNumberOfFilesAndFolders(String path) {
        File file = new File(path);
        System.out.println(file.getName());
        System.out.println(file.getParent());

        File[] files = file.listFiles();
        if (files != null) {
            int filesCount = 0;
            int foldersCount = 0;
            for (File f : files) {
                if (f.isFile()) {
                    filesCount++;
                } else if (f.isDirectory()) {
                    foldersCount++;
                }
            }
            System.out.println("Number of files: " + filesCount);
            System.out.println("Number of folders: " + foldersCount);
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}
