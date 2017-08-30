package net.veminal.pdf.core.documents.merge;

import net.veminal.pdf.utils.DirectoryFilesUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BuildPDFDocumentTest {
    private List<String> docs;

    @Before
    public void setUp() {
        docs = new ArrayList<>();
    }

    @Test
    public void buildPDF() {
        docs.add("C:\\main.cpp");
        docs.add("C:\\Users\\user\\Desktop\\pdf-conf\\app.json");
        Build build = new BuildPDFDocument(
                DirectoryFilesUtil.fileList(docs));
        final String path = "C:\\Users\\user\\Desktop\\test.pdf";
        build.buildPDF(path);
        assert true;
    }
}
