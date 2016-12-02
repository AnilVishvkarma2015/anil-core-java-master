package com.corejava.zip;

/*
        Create Zip File With CRC32 Checksum Example
        This Java example shows how to create a zip file and generate the
        checksum value using Java CheckedOutputStream and CRC32 classes.
        @version 1.0
        @since 16 Nov 2016
        @author Anil Vishvkarma
*/
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
 
public class CompressFileWithCRC32 {
       
        public static void main(String args[])
        {              
                String zipFile = "C:/zipdemo.zip";
                String sourceFile = "C:/Services.docx";
               
                //              create byte buffer
                byte[] buffer = new byte[1024];
               
                try
                {
                        //create object of FileOutputStream
                        FileOutputStream fout = new FileOutputStream(zipFile);
                       
                        /*
                         * Create an object of CheckedOutputStream using,
                         *
                         * CheckedOutputStream(OutputStream out, Checksum checksum)
                         *
                         * constructor.
                         *
                         * The second argument is the Checksum algorithm we want to use.
                         * It can be either CRC32 or Adler32.
                         *  
                         */
                         
                         CheckedOutputStream checksum = new CheckedOutputStream(fout, new CRC32());
                         
                         //create an object of ZipOutputStream
                        ZipOutputStream zout = new ZipOutputStream(checksum);
                         
                        //create object of FileInputStream for source file
                        FileInputStream fin = new FileInputStream(sourceFile);
                       
                        zout.putNextEntry(new ZipEntry(sourceFile));
 
                        int length;
                         
                        while((length = fin.read(buffer)) > 0)
                        {
                           zout.write(buffer, 0, length);
                        }
                       
                        zout.closeEntry();
                         
                        //close the InputStream
                        fin.close();
                         
                        //close the ZipOutputStream
                        zout.close();
                       
                        System.out.println("Zip file has been created!");
                       
                        /*
                         * Get the generated checksum value using
                         *
                         * Checksum getChecksum()
                         *
                         * method.
                         *
                         * This method returns the checksum for the output stream.
                         */
                        System.out.println("CRC32 Checksum is : " + checksum.getChecksum().getValue());
                }
                catch(IOException ioe)
                {
                        System.out.println("IOException : " + ioe);
                }
               
 
        }
 
}
 
/*
Output of this example would be
Zip file has been created!
CRC32 Checksum is : 1481449702
*/