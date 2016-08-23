package com.clouway;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class MyClass {

    private static Logger logger = Logger.getLogger(MyClass.class);

    public static void main(String[] args) {
        DirectoryBrowser browser = new DirectoryBrowser();
        Scanner scanner = new Scanner(System.in);
        String path;
        path = scanner.nextLine();
        logger.info("Directory browser was called with path:" + path +
                "\n\t return:" + browser.listContent(path));
    }
}
