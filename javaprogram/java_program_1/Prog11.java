import java.io.File;
class Prog11 
{
     public static void main(String s[]) 
          {
             String dir = "/";
             File folder = new File(dir);
             File[] listOfFiles = folder.listFiles();
             for(int i = 0; i < listOfFiles.length; i++) 
                        {
                           if(listOfFiles[i].isFile()) 
                               {
                                 System.out.println("[FILE]" + listOfFiles[i].getName());
                               } 
                           else if(listOfFiles[i].isDirectory())  
                               {
                                  String directoryToSearch = listOfFiles[i].getName();
                                  System.out.println("[DIR]" + directoryToSearch);
                                  File subFolder = new File(dir + directoryToSearch);
                                  File[] listOfSubFiles = subFolder.listFiles();
                                  for(int j = 0; j < listOfSubFiles.length; j++) 
                                           {
                                              System.out.println("\t[DIR]" + listOfSubFiles[j].getName());
                                            }
                                  }
                         }
                }
}