import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.zip.*;


public class t2 {
    String filePath = "C:\\Users\\user\\IdeaProjects\\num5\\src\\directory";
    String strName = "passport";
    String zipFileName = "output.zip";

    public void run() {
        File file = new File(filePath);
        File[] files = file.listFiles();
        List<File> res = new ArrayList<>();

        search(files, res);
    }

    public void search(File[] files, List<File> res) {
        for (File entry : files) {
            if (entry.getName().toLowerCase().contains(strName.toLowerCase())) {
                res.add(entry);
            } else if (entry.isDirectory()) {
                if (entry.listFiles().length > 0) {
                    search(entry.listFiles(), res);
                }
            }
        }

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("output.zip"))) {
            for (File f : res) {
                archiver(f, f.getName(), zout);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



    private void archiver(File file, String fileName, ZipOutputStream zout) throws IOException{
        if (file.isDirectory()) {
            if (fileName.endsWith("/")) {
                zout.putNextEntry(new ZipEntry(fileName));
                zout.closeEntry();
            } else {
                zout.putNextEntry(new ZipEntry(fileName + "/"));
                zout.closeEntry();
            }
            File[] children = file.listFiles();
            if (children.length > 0) {
                for (File childFile : children) {
                    archiver(childFile, fileName + "/" + childFile.getName(), zout);
                }
            }
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zout.putNextEntry(zipEntry);
        byte[] bytes = new byte[2048];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zout.write(bytes, 0, length);
        }

        zout.closeEntry();
        fis.close();
    }
}

