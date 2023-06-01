package InterfaceConcepts;

class PhotoPrintConfiguration implements PrintConfiguration{
    private Double width;
    private Double height;
    private String colorMode;

    Double photoWidth(){
        return this.width;
    }
    Double photoHeight(){
        return this.height;
    }

    @Override
    public String getColorMode() {
        return this.colorMode;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setColorMode(String colorMode) {
        this.colorMode = colorMode;
    }
}
