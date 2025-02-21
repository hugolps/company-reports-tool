package br.edu.ifpb.companyreportstool.service;

public class HtmlExporter implements ReportExporter{
    public String exportHeader(String title) {
        return "<header><h1>" + title + "</h1></header>";
    };
    public String exportBody(String subtitle, String dados) {

        return  "<main><h2>" + subtitle + "</h2>" +
                "<p>" + dados + "</p></main>";
    };
    public String exportFooter(String desc) {
        return "<footer>" + desc + "</footer>";
    };

}
