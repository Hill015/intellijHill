package com.Syntax.Class24;

  abstract class File {
    /*Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while
    open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

     */
   abstract void openFile();




    void editFile(){
        System.out.println("edits file");

    }
    void closeFile() {
        System.out.println("Closes file");

    }
  }
class JavaFile extends File{
    @Override
    void openFile() {
        System.out.println("use ij");
    }
    }
class wordFile extends File{
        @Override
    void openFile() {
            System.out.println("use word");
        }
        }
  class pdfFile extends File{
            @Override
      void openFile(){
                System.out.println("use adobe");

            }
  }




