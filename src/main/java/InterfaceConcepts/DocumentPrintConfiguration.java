package InterfaceConcepts;

class DocumentPrintConfiguration implements PrintConfiguration{
    private String pageLayout;
    private String pageSize;
    private String colorMode;
    String pageLayout() {
        return this.pageLayout;
    }
    String pageSize(){
        return this.pageSize;
    }

    public String getPageLayout() {
        return pageLayout;
    }

    public void setPageLayout(String pageLayout) {
        this.pageLayout = pageLayout;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String getColorMode() {
        return colorMode;
    }

    public void setColorMode(String colorMode) {
        this.colorMode = colorMode;
    }
}
