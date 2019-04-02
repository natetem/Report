package com.entreprise.report.model;

import java.util.ArrayList;
import java.util.List;


public class Result {
    private String inputFile;
    private List<Reference> references;
    private List<Error> errors;

    public Result(String inputFile) {
        this.inputFile = inputFile;
        this.references = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void addReference(Reference reference) {
        this.references.add(reference);
    }
    public List<Reference> getReferences() {
        return references;
    }
    public void addError(Error error) {
        this.errors.add(error);
    }

    public List<Error> getErrors() {
        return errors;
    }


}
